package Controller;


import java.util.ArrayList;

import dto.Book;
import service.BookManagerServiceImpl;

public class BookController {
	
	BookManagerServiceImpl bookManagerService = new BookManagerServiceImpl();
	
	public void bookSave(Book nBook) {
		bookManagerService.addBook(nBook);
	}
	
	public ArrayList<Book> bookList() {
		return bookManagerService.getAllBook();
	}
	
	public Book bookSearchBybNo(String bNo) {
		return bookManagerService.searchBookBybNo(bNo);
	}
	
	public ArrayList<Book> bookSearchByTitle(String title) {
		return bookManagerService.searchBookByTitle(title);
	}
}
