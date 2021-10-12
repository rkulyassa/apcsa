import java.util.Scanner;

public class Balloons {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many?");
		int balloons = sc.nextInt();
		int cost = balloons / 5 * 7 + balloons % 5 * 2;
		System.out.println(balloons + " balloons cost $" + cost);
	}
}