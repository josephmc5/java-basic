/**
 * File Output
 * Lesson at http://www.freejavaguide.com/file_streams.htm
 */

import java.io.*;

class FileOutput {

	public static void main(String args[]) {

		FileOutputStream out;
		PrintStream p;

		try {
			out = new FileOutputStream("myfile.txt");

			p = new PrintStream( out );

			p.println("This is written to a file myFile.txt");

			p.close();
		} catch (Exception e) {
			System.err.println("Error writing to the file myFile.txt");
		}	
	}

}
