/**
 * Read input from the user
 */

import java.io.*;

class ReadInput {

	public static void main (String args[]) {
		byte name[] = new byte[100];
		int nr_read = 0;

		System.out.println("Your name Please?");

		try {
			nr_read = System.in.read(name);
			System.out.print("Hello ");
			System.out.write(name,0,nr_read);
		} catch (IOException e) {
			System.out.println("Unable to get name.");
		}
	}
}
