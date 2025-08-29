package ch10;

import java.util.Vector;

class Student{
	private int sno;
	private String name;
	private String major;
	private int java;
	private int db;
	private int python;
	private double avg;
	private int rank;
	
	
	public Student() {};
	public Student(int sno, String name, String major) {
		super();
		this.sno = sno;
		this.name = name;
		this.major = major;
		this.java = java;
		this.db = db;
		this.python = python;
	}
	@Override
	public String toString() {
		return sno + " "+ name + " " + major;
	}
	
	
}

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Student> st = new Vector<>();
		st.add(new Student(1,"홍길동","컴공"));
		st.add(new Student(2,"이길동","컴공"));
		st.add(new Student(3,"김길동","컴공"));
		st.add(new Student(4,"김길동","컴공"));
		st.add(new Student(5,"김길동","컴공"));
		
		for(int i=0; i<st.size(); i++) {
			System.out.println(st.get(i));
		}
	}

}
