import java.io.*;

/**
 * Lesson at http://www.freejavaguide.com/corejava3.htm
 */

class NumberTest {

	public static void main (String[] args) throws IOException {

		BufferedReader stdin = new BufferedReader ( new InputStreamReader( System.in ) );

		String inS;
		int num;

		System.out.println("Enter an integer number");
		inS = stdin.readLine();
		num = Integer.parseInt( inS ); // convert inS to int using wrapper classes

		if ( num < 0 ) {
			System.out.println("The number " + num + " is negative");
			System.out.println("negative number is less than zero");
		} else {
			System.out.println("The number " + num + " is positive");
			System.out.println("positive numbers are greater ");
			System.out.println("or equal to zero ");
		}
		System.out.println("End of program");
	}

}
