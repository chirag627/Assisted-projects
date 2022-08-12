import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class subMenu {
	static void subMenuOptions() {

		List<String> subOptions = new ArrayList<String>();
		subOptions.add("Press 1 Add an user specified file\n");
		subOptions.add("Press 2 Delete an user specified file \n");
		subOptions.add("Press 3 Search a file\n");
		subOptions.add("Press 4 Return to the main context\n");

		Object[] subOptionArray = subOptions.toArray();
		for (int i = 0; i < subOptionArray.length; i++) {
			System.out.println(subOptionArray[i]);
		}
		System.out.println("\nEnter the Option 1/2/3/4\n");
		Scanner sc = new Scanner(System.in);
		functions f1 = new functions();

		try {
			int subMenuOptions = sc.nextInt();

			System.out.println();

			switch (subMenuOptions) {

			// geting filenames in accending order
			case 1:
				f1.addFile();
				break;

			case 2:
				f1.deleteFile();
				break;
			case 3:
				f1.searchFile();
				break;
			case 4:
				mainMenu.mainMenuOptions();
				break;
			default:
				System.err.println("\nSelect option is invalid, please choose an appropiate option to continue");
				subMenu.subMenuOptions();
				break;
			}

		} catch (InputMismatchException e) {
			System.err.println("\nSelect option is invalid, please choose an appropiate option to continue");
			subMenu.subMenuOptions();

		}

	}

}
