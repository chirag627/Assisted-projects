package arithmeticCalculator;

public class Division {

	void division(double d, double g) {
		// TODO Auto-generated method stub
		try {
			System.out.println(d / g); // throw Exception
		} catch (ArithmeticException e) {
			// Exception handler
			System.out.println("Divided by zero operation cannot possible");
		}
	}

}
