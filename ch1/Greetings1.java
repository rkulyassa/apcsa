/**
 * description
 * 
 * @author Ryan Kulyassa
 * @date 9/9
*/

import java.util.Scanner;

public class Greetings1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		System.out.println("Hello, "+name+"! Welcome to AP Computer Science A!");
	}
}