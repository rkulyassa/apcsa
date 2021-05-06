import java.util.Scanner;

class UserInput {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = input.next();

    System.out.print("Enter your age: ");
    int age = input.nextInt();

    System.out.printf("Hello " + name + ", you are " + age + " years old!");

    input.close();
  }
}
