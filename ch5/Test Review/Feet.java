import java.util.Scanner;

public class Feet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many feet?");
		int feet = sc.nextInt();
		int miles = feet / 5280;
		int leftoverFeet = feet % 5280;
		System.out.println(feet + " feet = " + miles + " mile(s) and " + leftoverFeet + " feet");
		System.out.println("There are 5,280 feet in a mile");
	}
}