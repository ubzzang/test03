package ch06;


public class CircleEx {
	public int radius;
	public String name;
	
	public CircleEx() {}
	public CircleEx(int r) {
		radius=r;
	}
	public CircleEx(String n) {
		name=n;
	}
	public CircleEx(int r, String n) {
		radius=r;
		name=n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza=new Circle();
		pizza.radius=10;
		pizza.name="자바피자";
		double area=pizza.getArea();
		
		Circle c1=new Circle(5);
		c1.name="동그라미";
		area=c1.getArea();
		System.out.println(c1.name+"의 면적은"+area);
		
		Circle c2=new Circle("원");
		c2.radius=5;
		area=c2.getArea();
		System.out.println(c2.name+"의 면적은"+area);
		
		Circle c3=new Circle(4,"원2");
		area=c3.getArea();
		System.out.println(c3.name+"의 면적은"+area);
		
		System.out.println("반지름"+pizza.radius);
		System.out.println("이름"+pizza.name);
		System.out.println("면적"+area);
		
		
	}

}
