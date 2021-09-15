/**
 * Cylinder Test
 * 
 * @author Ryan Kulyassa
 * @date 9/15
*/

import java.util.Scanner;

public class CylinderTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter integer value for radius: ");
    int r = sc.nextInt();
    System.out.print("Enter integer value for height: ");
    int h = sc.nextInt();
    Cylinder cylinder = new Cylinder(r, h);
    System.out.println(cylinder.getVolume());
  }
}