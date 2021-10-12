/**
 * Chapter 5 Exercises, pg. 127  #12
 * 
 * @author Ryan Kulyassa
 * @date 10/4
*/

import java.util.Scanner;

public class FeetToInches {
  public static int toInches(int feet, int inches) {
    return feet*12 + inches;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter feet: ");
    int feet = sc.nextInt();
    System.out.print("Enter inches: ");
    int inches = sc.nextInt();
    System.out.println(toInches(feet, inches));
  }
}