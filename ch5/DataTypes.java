/**
 * Data Types
 * 
 * @author Ryan Kulyassa
 * @date 10/6
*/

public class DataTypes {
	public static void main(String[] args) {
		// symbolic constants
		final double PI = 3.14159;
		//PI = 3.14;
		// final variable
		int x = 7, y = 19;
		double d = 43.56;
		System.out.println(y / x);
		d = y / x; // divide as int but get stored
		// as double
		System.out.println(d);
		// 2.7
		d = (double) y / x;
		System.out.println(d);
		System.out.println(volume(3));
	} // main method ends
	// calculate the volume of a sphere and returns its value
	public static double volume(int radius) {
		double v = 4/3 * Math.PI * radius * radius * radius;
		v = (double)4/3 * Math.PI * Math.pow(radius, 3);
		v = 4.0/3 * Math.PI * Math.pow(radius, 3);
		v = 4/3.0 * Math.PI * Math.pow(radius, 3);
		v = 4.0/3.0 * Math.PI * Math.pow(radius, 3);
		v = Math.PI * Math.pow(radius, 3) * 4 / 3;
		v = 4 * Math.PI * Math.pow(radius, 3) / 3;
		return v;
	}
}