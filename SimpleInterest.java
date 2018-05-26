import java.util.Scanner;

/**
 * @author Rahul
 *
 */
public class SimpleInterest {
	/**
	 * This method calculates the interest amount.
	 *
	 * @param principal
	 * @param rate
	 * @param years
	 * @return
	 */
	public static double calculateInterest(double principal, double rate, int years) {
		return (principal * (rate / 100) * years);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the principal amount");
		double principal = scanner.nextDouble();
		System.out.println("Please enter the rate of interest");
		double rate = scanner.nextDouble();
		System.out.println("Please enter the time in years");
		int years = scanner.nextInt();
		System.out.println("The interest amount is:" + calculateInterest(principal, rate, years));
	}
}
