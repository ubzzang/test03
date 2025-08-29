package ch07_2;
class Person{
	private String name;
	private String address;
	private String call;
	
	public Person(){};
	
	public Person(String name, String address, String call) {
		this.name = name;
		this.address = address;
		this.call = call;
	}
	
	public void display(){
		System.out.println(name + "" + address + " " + call);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call;
	}

}
class Customer extends Person{
	private int cno;
	private int mile;
	
	public Customer(String name, String address, String call, int cno, int mile) {
		super(name,address,call);
		this.cno = cno;
		this.mile = mile;
	}
	
	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public int getMile() {
		return mile;
	}

	public void setMile(int mile) {
		this.mile = mile;
	}

	public void Customerdisplay(){
		System.out.println(this.getName() + "" + this.getAddress() + " " + this.getCall() + " " + cno + " "+ mile);
	}
}
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person s1 = new Person("홍길동", "부산진구", "111-1111");
		s1.display();
		
		Customer c1 = new Customer("홍길동","부산진구","333-3333",1,10);
		
		c1.display();
		c1.Customerdisplay();
		
		Person p2 = c1; // p2는 Customerdisplay는 접근 못함 ,, -> 업캐스팅되서
		//p2는 Customer에 있는 함수들은 다 접근못함 
		
		//다운캐스팅
		Customer c3 = (Customer)p2;
		//Customer c4 = (Customer)s1; //이건안됨
	}

}
