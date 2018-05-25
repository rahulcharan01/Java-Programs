
/**
 * @author Rahul
 *
 */
public class Addition {

	int a, b;

	/**
	 * This method adds two numbers.
	 *
	 * @param a
	 * @param b
	 * @return
	 */
	public int addNumbers(int a, int b) {
		this.a = a;
		this.b = b;
		return (a + b);
	}

	public static void main(String[] args) {
		System.out.println(new Addition().addNumbers(10, 20));

	}
}
