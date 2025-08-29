package ch07;

class Employee {
	private int eno;
	private String name;
	private String dept;
	private int sal;

	public Employee() {
	}

	public Employee(int eno, String name, String dept, int sal) {
		super();
		this.eno = eno;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return eno + " " + name + " " + dept + " " + sal + " ";
	};

}

public class EmployeeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1, "홍길동", "영업", 500);
		System.out.println(e1.toString());
		System.out.println(e1);
	}

}
