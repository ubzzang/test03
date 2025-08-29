package ch09.exam;

class Mypoint{
	int x;
	int y;
	public Mypoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return getClass().getName()+x+","+y;
	}
	
	
}

public class MyPointEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mypoint a = new Mypoint(3,20);
		System.out.println(a);
	}

}
