public class ConditionalStatements {
  public static void main(String[] args) {

    if (10 > 5) {
      System.out.println("10 is greater than 5.");
    }

    int number = 0b11;

    if (number < 1) {
      System.out.println("The number is less than one.");
    } else if (number == 1) {
      System.out.println("The number is one.");
    } else if (number == 2) {
      System.out.println("The number is two.");
    } else if (number == 3) {
      System.out.println("The number is three.");
    } else {
      System.out.println("The number is greater than three.");
    }
  }
}