public class Loops {
  public static void main(String[] args) {

    // Prints every number from 0 to 5
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }

    // Prints even numbers from 0 to 10
    for (int i = 0; i <= 10; i += 2) {
      System.out.println(i);
    }

    // Prints each string in the array
    String[] words = {"Robbinsville", "High", "School"};
    for (String word : words) {
      System.out.println(word);
    }

    // Prints every number from 0 to 4
    int a = 0;
    while (a < 5) {
      System.out.println(a);
      a++;
    }

    // Prints every number from 3 to 5
    int b = 3;
    do {
      System.out.println(b);
      b++;
    }
    while (b < 6);
  }
}