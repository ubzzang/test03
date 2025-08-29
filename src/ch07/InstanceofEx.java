package ch07;

public class InstanceofEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person  p1 = new Person();
		Person p2 = new Student();
		Person p3 = new Researcher();
		Person p4 = new Professor();
		
		System.out.println(p1 instanceof Person);
		System.out.println(p2 instanceof Person);
		System.out.println(p2 instanceof Student);
		System.out.println(p3 instanceof Person);
		System.out.println(p3 instanceof Researcher);
		System.out.println(p4 instanceof Person);
		System.out.println(p4 instanceof Student);
	}

}
