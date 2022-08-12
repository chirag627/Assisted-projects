package arithmeticCalculator;

public class Addition {

	void addition(double a, double b) {


		if ((a + b) % 1 == 0) {
			int c = (int) (a + b);
			System.out.println("Addition of " + (a%1==0? (int) a : a)+ " and " + (b%1==0? (int) b : b) + " is " + c);
		} else {
			double c = a + b;
			System.out.println("Addition of " +(a%1==0? (int) a : a)+ " and " + (b%1==0? (int) b : b) + " is " + c);

		}

	}
}
