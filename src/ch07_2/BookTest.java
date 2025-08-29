package ch07_2;


class Book{
	String title;
	int page;
	String author;
	
	public Book() {}

	public Book(String title, int page, String author) {
		super();
		this.title = title;
		this.page = page;
		this.author = author;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	};
	public void display() {
		System.out.println("책이름 : " + title +"\n" + "페이지수 : " + page +"\n" + "저자 : "+author);
	}
	
	
}

class Magazine extends Book{
	String date;
	
	public Magazine(String title, int page, String author,String date) {
		super(title, page, author);
		this.date = date;
	}
	public void display() {
		//super.display();
		System.out.println("책이름 : " + this.getTitle() +"\n" + "페이지수 : " + this.getPage() +"\n" + "저자 : "+this.getAuthor() +"\n" + "발매일 : "+date);
	}
	
}
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("홍길동전",50,"어쩌고");
		b1.display();
		
		Magazine m1 = new Magazine("홍길동전2",50,"어쩌고","2025-08-25");
		m1.display();
		
		b1 = m1; //업캐스팅
		b1.display();
	}

}
