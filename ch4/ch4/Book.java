/**
 * Book
 * 
 * @author Ryan Kulyassa
 * @date 9/15
*/

public class Book {
	private int numPages;
	private int currentPage;

	public Book(int numPages) {
		this.numPages = numPages;
		currentPage = 1;
	}

	public int getNumPages() {
		return numPages;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void nextPage() {
		if (currentPage < numPages) {
			currentPage += 1;
		}
	}
}