package service;


import java.util.ArrayList;

import dto.Book;

public interface BookService {
	void addBook(Book nBook);
	ArrayList<Book> getAllBook();
	Book searchBookBybNo(String bNo);
	ArrayList<Book> searchBookByTitle(String title);
	ArrayList<Book> onlySearchBook();
	ArrayList<Book> onlySearchMagazine();
	ArrayList<Book> magazineOfThisYearInfo(int year);
	ArrayList<Book> searchBookByPublisher(String publisher);
	ArrayList<Book> searchBookByPrice(int price);
	int getTotalPrice();
	int getAvgPrice();
}
