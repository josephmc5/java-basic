/**
 * Write the Fahrenheit to Celsius table in a file
 * Lesson at http://www.freejavaguide.com/file_streams.htm
 */

import java.io.*;

class FahrToCelsius{

	public static void main(String args[]) {

		double fahr, celsius;
		double lower, upper, step;

		lower = 0.0;
		upper = 300.0;
		step = 20.0;

		fahr = lower;

		try {
			FileOutputStream fout = new FileOutputStream("test.out");

			PrintStream myOutput = new PrintStream(fout);

			while (fahr <= upper) {
				celsius = 5.0 * (fahr - 32.0) / 9.0;
				myOutput.println(fahr + " " + celsius);
				fahr = fahr + step;
			}
		} catch (IOException e) {
			System.out.println("Error: " + e);
			System.exit(1);
		}
	}
}
