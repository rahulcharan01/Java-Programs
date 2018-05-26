import java.util.Scanner;

/**
 * @author Rahul
 *
 */
public class SquareArea {
	/**
	 * This method calculates the area of square.
	 *
	 * @param side
	 * @return
	 */
	public static double calculateArea(double side) {
		return side * side;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double side = 0.0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of side:");
		side = scanner.nextDouble();
		System.out.println("Area of square is:" + calculateArea(side));
	}
}
