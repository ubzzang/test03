package ch12;

class Outer1 {
	private int speed = 10;

	class MemberInner1 {
		public void move() {
//			int sno = 1;
//			String name = "홍길동";
//			String major = "컴공";
//			System.out.println("학번은 " + sno + "이고 이름은 " + name + "이며, 존공은 " + major + "입니다.");
//			System.out.printf("학번은 %d이고 이름은 %s이며, 전공은 %s입니다%n", sno, name, major);
//			System.out.println("인간형 유닛이 " + speed + " 속도로 이동합니다.");
			System.out.printf("인간형 유닛이 %d 속도로 이동합니다. \n", speed);
		}
	}
	public void getMarine() {
		MemberInner1 inner=new MemberInner1();
		inner.move();
	}
}

public class Ex01_Memberinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer1 out=new Outer1();
		out.getMarine();
		
		Outer1.MemberInner1 inner=out.new MemberInner1();
		inner.move();
	}

}
