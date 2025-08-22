package ch06;

public class Student {
	 static int sno=1;
	 private String name;
	 private String major;
	
	public Student() {};
	public Student(String name, String major) {
		sno++; //자동으로 번호 증가
		this.name = name;
		this.major = major;
	}
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void display() {
		System.out.println(sno+" "+name+" "+major);
	}
	public void changeMajor(String major) {
		System.out.println(name+" 전공변경 "+this.major+" >> "+ major);
		this.major=major;
		
	}
}
