/**
 * Square Test
 * 
 * @author Ryan Kulyassa
 * @date 10/6
*/

public class SquareTest {
  public static void main(String[] args) {
    Square s = new Square(7.5);
    System.out.println(s);
    // 1) printing the object prints the memory location
    // 2) using the object inside the print statement, calls its toString() method
    System.out.println(s.getArea());
  }
}