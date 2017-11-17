package functional_programming_stream.Lab_9;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		//set up
		Book book = new Book("test", 3);
		List<BookCopy> copies = book.getCopies();
		copies.forEach(copy -> copy.changeAvailability());
		
		//test
		System.out.println(book.isAvailable());
	}

}
