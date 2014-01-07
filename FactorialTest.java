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

		int i;
		long result=1;

		for (i=1; i <= n; i++) {
			result *= i;
		}

		return result;
	}

}
