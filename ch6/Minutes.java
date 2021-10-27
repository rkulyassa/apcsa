/**
 * Problem 5 - Minutes
 * 
 * @author Ryan Kulyassa
 * @date 10/27
*/

import java.util.Scanner;

public class Minutes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many minutes is the call?");
		int length = sc.nextInt();
		double cost;
		if (length <= 2) {
			cost = 1.5;
		} else if (length < 10) {
			cost = 1.5 + 0.5 * (length - 2);
		} else {
			cost = 5.5 + 0.25 * (length - 10);
		}
		System.out.println("A " + length + " minute call costs " + cost);
	}
}