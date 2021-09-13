/**
 * User Integer
 * 
 * @author Ryan Kulyassa
 * @date 9/9
*/

import java.util.Scanner;

public class UserInteger {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an Integer: ");
    int n = input.nextInt();
    System.out.println("2 * " + n + " = " + (n + n));
  }
}