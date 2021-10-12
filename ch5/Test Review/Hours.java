import java.util.Scanner;

public class Hours {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hours?");
		int hours = sc.nextInt();
		int days = hours / 24;
		int leftoverHours = hours % 24;
		System.out.println(hours + " hours = " + days + " days and " + leftoverHours + " hours");
	}
}