package fileOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class writeFileOperation {
	public static void main(String[] args) throws IOException {
		int action = 0;
		boolean flag = true;
		System.out.println();
		System.out.println("Welcome to file operations");
		System.out.println("Press 1 to write new content in the file");
		System.out.println("Press 2 to read content in the file");
		System.out.println("Press 3 to append content in the file");

		System.out.println();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println();

			System.out.println("Choose an option to perform the action");

			do {
				try {
					String s = sc.nextLine();

					action = Integer.parseInt(s);
					flag = false;

				} catch (NumberFormatException e) {
					System.out.println("Invalid Operation. Choose options from 1/2/3 only");
				}
			} while (flag);

			switch (action) {
			case 1:
				FileOutputStream f1 = new FileOutputStream("C:\\Users\\chirag\\Desktop\\demo.txt");

				System.out.println("Enter the new content to enter in the file");
				String s1 = sc.nextLine();
				byte[] b1 = s1.getBytes();
				f1.write(b1);
				f1.close();
				System.out.print("Content Successfully Inserted into file");
				break;

			case 2:
				FileInputStream f2 = new FileInputStream("C:\\Users\\chirag\\Desktop\\demo.txt");

				int x = 0;
				while ((x = f2.read()) != -1) {
					System.out.print((char) x);

				}
				System.out.println();
				f2.close();
				System.out.print("End of the file");
				break;

			case 3:
				System.out.println("Enter the content to append");
				String s3 = sc.nextLine();
				byte[] b3 = s3.getBytes();
				FileOutputStream f3 = new FileOutputStream("C:\\Users\\chirag\\Desktop\\demo.txt", true);
				f3.write(b3);
				System.out.print("Content Successfully appended");

			}
		} while (true);
	}
}
