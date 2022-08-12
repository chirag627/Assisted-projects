import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class mainMenu {
	static void mainMenuOptions() {

		System.out.println("\tMain Menu\n");
		List<String> options = new ArrayList<String>();

		options.add("Press 1 Retrieving the file names in an ascending order\n");
		options.add("Press 2 Business-level operations\n");
		options.add("Press 3 Close the application\n");

		Object[] optionArray = options.toArray();
		for (int i = 0; i < optionArray.length; i++) {
			System.out.println(optionArray[i]);
		}

		System.out.println("\nEnter the Option 1/2/3\n");
		Scanner sc = new Scanner(System.in);

		try {
			int optionSelected = sc.nextInt();
			System.out.println();
			if (optionSelected == 1 || optionSelected == 2 || optionSelected == 3) {
				switch (optionSelected) {

				// geting filenames in accending order
				case 1:
					functions f1 = new functions();
					f1.getFileNames(0);
					break;

				case 2:
					subMenu.subMenuOptions();
					break;
				case 3:
					functions.closeApp();
					break;

				}
			} else {
				System.err.println("\nSelect option is invalid, please choose an appropiate option to continue\n");
				mainMenu.mainMenuOptions();
			}
		} catch (InputMismatchException e) {
			System.err.println("\nSelect option is invalid, please choose an appropiate option to continue");
			mainMenu.mainMenuOptions();

		}

	}

}
