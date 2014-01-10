/* 
 * Calculate fatorials for 1 through 10
 * Lesson at http://www.freejavaguide.com/corejava4.htm
 */

class FactorialTest {

	public static void main(String args[]) {

		int n;
		int i;
		long result;

		for (i=1; i <= 10; i++) {
			result = factorial(i);
			System.out.println(result);
		}
	}

	static long factorial (int n) {

		if (n < 0) {

			return -1;

		} else if ( n == 0) {

			return 1;

		} else {

			return n*factorial(n-1);

		}
	}
}
