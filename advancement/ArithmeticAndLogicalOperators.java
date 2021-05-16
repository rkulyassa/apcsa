public class ArithmeticAndLogicalOperators {
  public static void main(String[] args) {

    // Basic Arithmetic

    int a = 7;
    int b = 5;

    System.out.println("The sum of 7 and 5 is " + (a + b));
    System.out.println("The difference of 7 and 5 is " + (a - b));
    System.out.println("The product of 7 and 5 is " + (a * b));
    System.out.println("The quotient of 7 and 5 is " + (a / b));
    System.out.println("The remainder of 7 and 5 is " + (a % b));

    // Logic Operators

    System.out.println(a > b); // true
    System.out.println(a == b); // false
    System.out.println((a > b) && (a != b)); // true
    System.out.println(((b + 3) > a) || false); // true
  }
}