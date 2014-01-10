/**
 * Read file from program args
 * Lesson at http://www.freejavaguide.com/file_streams.htm
 */

class ReadFile {

	public static void main(String args[]) {
		String thisLine;

		for (int = 0; i < args.length; i++) {

			try{

				while ((thisLine = myInput.readLine()) != null) {

					System.out.println(thisLine);
				}

			} catch (Exception e) {
				System.out.println("Error: " + e);
			}
		}
	}

}
