import java.util.Scanner;

/**
 * @author Rahul
 *
 */
public class RectangleArea {
	double length, width, area;

	public double calculateArea(double length, double width) {
		return length * width;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		RectangleArea rectangleArea = new RectangleArea();
		System.out.println("Please enter length:");
		rectangleArea.length = scanner.nextDouble();
		System.out.println("Please enter width:");
		rectangleArea.width = scanner.nextDouble();
		rectangleArea.area = rectangleArea.calculateArea(rectangleArea.length, rectangleArea.width);
		System.out.println("The area of rectangle is:" + rectangleArea.area);
	}
}
