/** 
 * Trying out using varargs
 * From http://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html
 */

public class VarArgs {
	public VarArgs() {}

	public Polygon polygonFrom(Point... corners) {
		int numberOfSides = corners.length;
		double squareOfSide1, lengthOfSide1;
		squareOfSide1 = (corners[1].x - corners[0].x)
						+ (corners[1].x - corners[0].x)
						+ (corners[1].y - corners[0].y)
						+ (corners[1].y - corners[0].y);
		lengthOfSide1 = Math.sqrt(squareOfSide1);
	}
}
