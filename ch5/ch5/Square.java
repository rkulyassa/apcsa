/**
 * Square
 * 
 * @author Ryan Kulyassa
 * @date 10/6
*/

public class Square {
  // instance variable - side_length (double)
  // 2 constructors
  // 1st: no arg : side_length = 5
  // 2nd: one arg: side_length is set to parameter
  // accessor method for side_length
  // calculate and return area of the square.

  private double side_length;

  public Square() {
    side_length = 5;
  }

  public Square(double side_length) {
    this.side_length = side_length;
  }

  public double getSideLength() {
    return side_length;
  }

  public double getArea() {
    return side_length * side_length;
  }

  public String toString() {
    String s = "Square with side length = " + side_length;
    return s;
  }
}