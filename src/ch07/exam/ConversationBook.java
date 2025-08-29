package ch07.exam;

public class ConversationBook extends Book{
	private String language;
	
	public ConversationBook(){};
	public ConversationBook(int id, String comment, String productor, int price, String author, String title, String language) {
		super(id,comment,productor,price,title,author);
		this.language = language;
	}
	public void display() {
		super.display();
		System.out.print(language+" ");
	}
}
