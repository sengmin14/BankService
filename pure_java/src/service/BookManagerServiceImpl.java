package service;

import java.util.ArrayList;

import dto.Book;

public class BookManagerServiceImpl implements BookService {

	public ArrayList<Book> list = new ArrayList<Book>();
	
	@Override
	public void addBook(Book nBook) {
		list.add(nBook);
	}

	@Override
	public ArrayList<Book> getAllBook() {
		return list;
	}

	@Override
	public Book searchBookBybNo(String bNo) {
		Book b = null;
		
		for(Book sb : list) {
			if(sb.getbNo().equals(bNo)) {
				b = sb;
			}
		}
		
		return b;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		ArrayList<Book> titleList = new ArrayList<>();
		
		for(Book b : list) {
			if(b.getTitle().contains(title)) {
				titleList.add(b);
			}
		}
		
		return titleList;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotalPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getAvgPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
