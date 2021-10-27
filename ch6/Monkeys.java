/**
 * Problem 6 - Monkeys
 * 
 * @author Ryan Kulyassa
 * @date 10/27
*/

import java.util.Scanner;

public class Monkeys {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("How many monkeys?");
  int numMonkeys = sc.nextInt();
  System.out.print("What is your lucky number? ");
  int luckyNumber = sc.nextInt();
  double cost;
  if (numMonkeys < 20) {
    cost = numMonkeys * 5.0;
  } else {
    cost = numMonkeys * 4.0;
  }
  if (luckyNumber == 7 || luckyNumber == 17) {
    cost *= 0.9;
  }
  System.out.println("The monkeys cost $" + cost);
  }
}