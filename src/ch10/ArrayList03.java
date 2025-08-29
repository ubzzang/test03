package ch10;

import java.util.ArrayList;

class Student02 {
	private int sno;
	private String name;
	private String major;

	public Student02() {
	};

	public Student02(int sno, String name, String major) {
		super();
		this.sno = sno;
		this.name = name;
		this.major = major;
	}

	@Override
	public String toString() {
		return sno + " " + name + " " + major;
	}

}

public class ArrayList03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student02> al = new ArrayList<>();
		al.add(new Student02(1,"홍길동","컴공"));
		al.add(new Student02(2,"이길동","컴공"));
		al.add(new Student02(3,"김길동","컴공"));
		al.add(new Student02(4,"김길동","컴공"));
		al.add(new Student02(5,"김길동","컴공"));
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
	}

}
