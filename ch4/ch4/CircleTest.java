/**
 * Circle Test
 * 
 * @author Ryan Kulyassa
 * @date 9/15
*/

import java.util.Scanner;

public class CircleTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter integer value for radius: ");
    int r = sc.nextInt();
    Circle circle = new Circle(r);
    System.out.println(circle.getArea());
  }
}