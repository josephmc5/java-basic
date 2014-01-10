/**
 * Showing variable scope
 * From http://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html
 */

public class PassPrimitiveByValue {

	public static void main(String[] args) {

		int x = 3;

		passMethod(x);

		System.out.println("After invoking passMethod, x = " + x);

	}

	public static void passMethod(int p) {
		p = 10;
	}

}
