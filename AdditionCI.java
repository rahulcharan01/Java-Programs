import java.util.Scanner;

/**
 * @author Rahul
 *
 */
public class AdditionCI {
	int a, b, c;

	/**
	 *
	 */
	public void addNumbers() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number:");
		this.a = scanner.nextInt();
		System.out.println("Enter Second Number:");
		this.b = scanner.nextInt();
		this.c = this.a + this.b;
		System.out.println("The addition is:" + this.c);
	}

	public static void main(String[] args) {
		AdditionCI additionCI = new AdditionCI();
		additionCI.addNumbers();
	}
}
