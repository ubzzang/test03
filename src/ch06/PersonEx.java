package ch06;

class Person{
	String name;
	int age;
	String gender;
    public Person(){}
	
	
	public void display() {
		System.out.println(name+" "+age+"세 "+ gender);
	}
	
	public Person(String name, int age, String gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
}
public class PersonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		Person kim=new Person("kim",15,"여자");
		
		p.name="홍길동";
		p.age=24;
		p.gender="남자";
		
		p.display();
		kim.display();
	}

}
