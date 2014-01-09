/**
 * Catching out of bounds
 * Lesson at http://www.freejavaguide.com/corejava5.htm
 */

public class OutOfBounds {

	public static void main(String args[]){
		int i =0;

		String Box [] = {"Book", "Pen", "Pencil"};

		while(i<4){

			try{
				System.out.println(Box[i]);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Subscript Problem " + e);
				i++;
			} finally {
				System.out.println("This is always printed.");
			}
			i++;
		}
	}
}
