package ch06;
/*4장 연습문제 01*/

class Song{
	String title;
	Song(){};
	
	public Song(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
}
public class SongEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song mySong = new Song("Nessun Dorma");
		Song YourSong = new Song("공주는 잠 못 이루고");
		System.out.println("내 노래는 "+mySong.getTitle());
		System.out.println("너 노래는 "+YourSong.getTitle());
	}

}
