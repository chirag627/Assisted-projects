package emailValidation;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailValidation {
static void Search( String searchEmail) {
	ArrayList<String> list = new ArrayList<String>();
	// Instantiating an ArrayList object
	list.add("chirag@gmail.com");
	list.add("sujal@gmail.com");
	list.add("mayank@gmail.com");
	list.add("yash@gmail.com");
	String regex = "^(.+)@(.+)$";
	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(searchEmail);
	if (matcher.matches()) {
		for (int i = 0; i < list.size(); i++) {
			if (list.contains(searchEmail)) {
				System.out.println("The Email " + searchEmail + " found in ArrayList");
				break;
			} else {
				System.out.println("The Email " + searchEmail + " doesn\'t found in ArrayList");
				break;
			}
		}
	} else {
		System.out.println("Email is not in correct format");
	}
	System.out.println();
	System.out.println("------------------------------");

}
	public static void main(String[] args) {
	
		while (true) {
			System.out.println("Please Enter the Email to be searched from ArrayList");

			Scanner sc = new Scanner(System.in);
			String searchEmail = sc.nextLine();
			emailValidation.Search(searchEmail);
			}
	}
}