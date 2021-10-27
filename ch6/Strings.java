/**
 * Problem 8 - Strings
 * 
 * @author Ryan Kulyassa
 * @date 10/27
*/

import java.util.Scanner;

public class Strings {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String first = sc.nextLine().toLowerCase();
    String second = sc.nextLine().toLowerCase();
    String third = sc.nextLine().toLowerCase();
    if (first.equals(second) && first.equals(third)) {
      System.out.println("Three of a kind");
    } else if (first.equals(second) || first.equals(third) || second.equals(third)) {
      System.out.println("Pair");
    } else {
      System.out.println("All different");
    }
  }
}