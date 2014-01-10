/*
 * Prompt for name and say hello
 * Lesson at http://www.freejavaguide.com/corejava3.htm
 */

class HelloPrompt {

	public static void main (String args[]) {
		System.out.print("Hello ");

		if (args.length > 0) {
			System.out.println(args[0]);
		} else {
			System.out.println("whoever you are");
		}
	}
}
