/**
 * Book Test
 * 
 * @author Ryan Kulyassa
 * @date 9/15
*/

public class BookTest {
  public static void main(String[] args) {
    Book book = new Book(3);
    book.nextPage();
    System.out.println(book.getCurrentPage());
    book.nextPage();
    System.out.println(book.getCurrentPage());
    book.nextPage();
    System.out.println(book.getCurrentPage());
  }
}