package arithmeticCalculator;

import java.util.Scanner;

public class Main {

	static {
		System.out.println();
		System.out.println("Welcome to the Arithmetic Calculator");
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println();

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		String n;
		int o = 0;
		boolean flag2=true;
		

		while (flag2) {
			System.out.println("Operations");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Division");
			System.out.println("4. Multiplication");
			System.out.println("5. Exit");

			System.out.println("Choose the operation to perform (1/2/3/4/5)");
			System.out.println();

			do {
				n = sc.next();
				try {
					o = Integer.parseInt(n);
					flag = false;
				} catch (NumberFormatException e) {
					System.out.println("Enter only integer value");
					flag = true;
				}
			} while (flag);

			switch (o)

			{

			case 1:
				System.out.println("Enter 2 Numbers to add");
				double x = sc.nextDouble();
				double y = sc.nextDouble();
				Addition a = new Addition();
				a.addition(x, y);
				break;
			case 2:
				System.out.println("Enter 2 Numbers to Substraction");
				double b = sc.nextDouble();
				double c = sc.nextDouble();
				Subtraction s = new Subtraction();
				s.subtraction(b, c);
				break;
			case 3:
				System.out.println("Enter 2 Numbers to division");
				double d = sc.nextDouble();
				double e = sc.nextDouble();
				Division d2 = new Division();
				d2.division(d, e);
				break;
			case 4:
				System.out.println("Enter 2 Numbers to multipy");
				double f = sc.nextDouble();
				double g = sc.nextDouble();
				Multiply m2 = new Multiply();
				m2.multiply(f, g);
				break;
			case 5:
				flag2=false;
				
			default:
				flag2=false;

			}


			System.out.println();
			System.out.println();
		}
		
		System.out.println("Thanks for using arithmetic Calculator");

	}
}