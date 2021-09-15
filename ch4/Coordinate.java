/**
 * Coordinate
 * 
 * @author Ryan Kulyassa
 * @date 9/13
*/

public class Coordinate {
  private double x;
  private double y;

  public Coordinate(double newX, double newY) {
    x = newX;
    y = newY;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public void setX(double newX) {
    x = newX;
  }

  public void setY(double newY) {
    y = newY;
  }
}