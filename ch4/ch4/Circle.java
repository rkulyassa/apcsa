/**
 * Circle
 * 
 * @author Ryan Kulyassa
 * @date 9/15
*/

public class Circle {
  private int r;

  public Circle(int r) {
    this.r = r;
  }

  public double getArea() {
    return Math.PI * Math.pow(r, 2);
  }
}