package ch07;

class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}

public class ShapeEx {
	static void func(Shape p) {
		p.draw();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shape s1 = new Shape();
		Shape s1 = new Shape(); func(s1); //업캐스팅의 장점 
		Line s2 = new Line(); func(s2);
		Rect s3 = new Rect(); func(s3);
		
		Shape[] s = new Shape[3]; //업캐스팅을 하면 배열에 담아서 처리할 수 있다.
		s[0] = new Shape();
		s[1] = new Line();
		s[2] = new Rect();
		//s1.draw();
		
//		Shape s2 = new Line();
//		s2.draw();
//		
//		Shape s3 = new Rect();
//		s3.draw();
		
		for(Shape ss:s) {
			ss.draw();
		}
	}

}
