import java.util.Scanner;

public class Flowers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many flowers? ");
		int flowers = sc.nextInt();
		int cost = flowers / 12 * 70 + flowers % 12 * 7;
		System.out.println(flowers + " flowers cost $" + cost);
	}
}