package ch06;

public class CircleEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[] c = new Circle[5];
		
		for(int i=0; i<c.length; i++) {
			c[i]=new Circle(i+1);
		}
		for(int i=0; i<c.length; i++) {
			System.out.println("c["+i+"]의 면적은"+c[i].getArea());
		}
	}

}
