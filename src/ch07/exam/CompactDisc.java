package ch07.exam;

public class CompactDisc extends Product{
	private String albumTitle;
	private String singer;
	
	public CompactDisc(){};
	public CompactDisc(int id, String comment, String productor, int price, String albumTitle, String singer) {
		super(id, comment, productor, price);
		this.albumTitle = albumTitle;
		this.singer = singer;
	}
	
	public void display() {
		super.display();
		System.out.print(albumTitle+" "+singer+" ");
	}
	
}
