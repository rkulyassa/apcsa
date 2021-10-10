/**
 * Cylinder
 * 
 * @author Ryan Kulyassa
 * @date 9/15
*/

public class Cylinder {
	private Circle base;
	private int height;

	public Cylinder(int r, int h) {
		base = new Circle(r);
		height = h;
	}

	public double getVolume() {
		return base.getArea() * height;
	}
}