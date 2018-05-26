import java.util.Scanner;

/**
 * @author Rahul
 *
 */
public class CircleArea {
	final static double pie = 3.14;

	/**
	 * @param radius
	 * @return
	 */
	public static double calculateArea(double radius) {
		return (pie * radius * radius);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter radius:");
		double area = calculateArea(scanner.nextDouble());
		System.out.println("The area of circle is:" + area);
	}
}
