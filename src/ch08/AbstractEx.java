package ch08;

/*추상 클래스*/
abstract class Shape{
	int x;
	int y;
	public void paint() {
		System.out.println("그리기");
	}
	/*추상 메소드*/
	abstract public void draw();
}

class Line extends Shape{
	/*****
	 추상 클래스를 상속받는 일반 클래스는 반드시 추상클래스속 추상 메소드를 구현해야함
	******/
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
}
class Rect extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
}

abstract class Abc{
	public void fun1() {
		System.out.println("Abc");
	}
}

public class AbstractEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*추상 클래스는 객체 안만들어짐*/
		Shape s1 = new Line();
		Shape s2 = new Rect();
		s1.paint();
		s1.draw();
		s2.paint();
		s2.draw();
	}

}
