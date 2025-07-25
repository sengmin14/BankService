package dto;

//Book 상속받아서 작성
public class Magazine extends Book{
	private int year;
	private int month;
	
	public Magazine() {}

	// 단축키로 생성해보기
	public Magazine(String bNo, String title, String author, String publisher, int price, String description, int year,
			int month) {
		super(bNo, title, author, publisher, price, description);
		this.year = year;
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	@Override
	public String toString() {
		return "Magazine [" + super.toString() +  ", year=" + year + ", month=" + month + "]";
	}
	
}