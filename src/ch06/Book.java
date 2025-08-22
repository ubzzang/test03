package ch06;

public class Book {
	String title;
	String author;
	void show() {System.out.println("title"+" "+author);}
	
	public Book(String t) { //생성자
		title=t;
		//author="작자미상";
	}
	
	public Book() {
		this("","");
		System.out.println("생성자 호출됨");
	}
	
	public Book(String t, String a) { //생성자
		title=t; author=a;
	}
	
	public static void main(String[] args) {
		Book littlePrice=new Book("어린왕자","생텍쥐페리");
		Book loveStroty=new Book("춘향전");
		Book emptyBook = new Book("춘향전");
		
		System.out.println(littlePrice.title+" "+littlePrice.author);
		System.out.println(loveStroty.title+" "+loveStroty.author);
		emptyBook.show();
	
	}
}
