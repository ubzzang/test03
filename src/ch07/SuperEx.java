package ch07;

class Person02{
	String name;
	int age;
	String gender;
	
	public Person02() {
		System.out.println("Person의 default 생성자");
	}
	public Person02(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public void display() {
		System.out.println(name+" "+age+" "+gender);
	}
}
class Student02 extends Person02{
	private int sno;
	private String major;
	
	public Student02() {
		System.out.println("Student defalut 생성자");
	}
	public Student02(int sno, String major, String name, int age, String gender) {
		super(name, age, gender);
		this.sno = sno;
		this.major = major;
	}
	public void studentDisplay() {
		System.out.print(sno+" "+major+" ");
		display();
	}
	
}
public class SuperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person02 p = new Person02("kim",20,"여자");
		p.display();
		
		Student02 s1 = new Student02();
		s1.studentDisplay();
		
		Student02 s2 = new Student02(1,"컴공","Hong",20,"남자");
		s2.studentDisplay();
	}

}
