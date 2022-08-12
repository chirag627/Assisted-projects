import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class functions {
	String wDirectory = System.getProperty("user.dir");
	List<String> filenames = new ArrayList<>();

	// getting file names in ascending order
	public void getFileNames(int j) {
		// To get the current working directory
		File d = new File(wDirectory + "/files");

		String[] filenames = new String[d.list().length];
		for (int i = 0; i < d.list().length; i++) {
			// Adding the file name in lowercase in array
			filenames[i] = d.list()[i].toLowerCase();
		}

		// Printing File names in ascending order
		System.out.println(bubbleSort(filenames));
		System.out.println();
		if (j != 1) {
			mainMenu.mainMenuOptions();
		} else {
			subMenu.subMenuOptions();
		}
	}
	// End of method

	static void closeApp() {
		System.out.println("Closing your application... \nThank you!");
	}

	// adding a new file in directory
	public void addFile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of file to create");
		String newFile = sc.nextLine();
		File aFile = new File(wDirectory + "/files/" + newFile);
		try {
			if (!aFile.exists()) {
				aFile.createNewFile();
				System.out.println("\nFile Created Successfully\n");
				new functions().getFileNames(1);

			} else {
				System.err.println("\nCannot create a file with name " + newFile + ". File aready exists\n");
				subMenu.subMenuOptions();

			}
		} catch (IOException e) {
			System.err.println("\nSomeThing went wrong, Please try again\n");
			subMenu.subMenuOptions();

		}

	}
	// End of method

	// deleting a file
	public void deleteFile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of file to delete");
		String delFile = sc.nextLine();
		File aFile = new File(wDirectory + "/files/" + delFile);
		if (aFile.exists()) {
			aFile.delete();
			System.out.println("\nFile " + delFile + " deleted successfully\n");
			new functions().getFileNames(1);

		} else {
			System.err.println("\nFile " + delFile + " does not exists\n");
			subMenu.subMenuOptions();

		}

	}
	// end of method

	// search a file
	public void searchFile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of file to search");
		String SeaFile = sc.nextLine();
		File aFile = new File(wDirectory + "/files");
		String[] files = new String[aFile.list().length];
		for (int i = 0; i < files.length; i++) {
			files[i] = aFile.list()[i];
		}
		int found = 0;
		for (int i = 0; i < files.length; i++) {
			if (files[i].equals(SeaFile)) {
				found = 1;
			}
		}

		if (found == 1) {

			System.out.println("\nFile found in the directory\n");
			subMenu.subMenuOptions();

		} else {
			System.err.println("\nFile not found in the directory\n");
			subMenu.subMenuOptions();

		}
		subMenu.subMenuOptions();
	}
	// end of method

	// bubble sort
	private List<String> bubbleSort(String[] f) {

		// sorting the array using bubble sort
		String temp;

		for (int i = 0; i < f.length; i++) {
			for (int j = i; j < f.length - 1; j++) {
				char first = f[i].charAt(0);
				char sec = f[j + 1].charAt(0);
				if (first > sec) {
					temp = f[j + 1];
					f[j + 1] = f[i];
					f[i] = temp;
				}
			}
			// adding file names in sorted form
			filenames.add(f[i]);
		}
		return filenames;
	}

}
