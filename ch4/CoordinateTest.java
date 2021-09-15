/**
 * Coordinate
 * 
 * @author Ryan Kulyassa
 * @date 9/13
*/

public class CoordinateTest {
	public static void main(String[] args) {
		Coordinate one = new Coordinate(6, 7);
		one.setX(5);
		one.setY(5.7);
		System.out.println(one.getX());
		System.out.println(one.getY());
	}
}