/**
 * Problem 7 - Number
 * 
 * @author Ryan Kulyassa
 * @date 10/27
*/

import java.util.Scanner;

public class Number {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Number?");
    int num = sc.nextInt();
    if (num >= 1 && num <= 100 && num % 3 == 0 || num % 5 == 0) {
      System.out.print("A");
    }
    if (num <= 50 && num % 2 == 0 || num % 7 == 0) {
      System.out.print("B");
    }
    if (num < 25 || num > 200) {
      System.out.print("C");
    }
    System.out.println("X");
  }
}