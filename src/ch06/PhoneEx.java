package ch06;

import java.util.Scanner;

/*4장 연습문제 02*/
public class PhoneEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("이름과 전화번호 입력");
		
		Phone ph1 = new Phone(sc.next(), sc.next());
		Phone ph2 = new Phone(sc.next(), sc.next());
		
		System.out.println(ph1.getName()+"의 번호 "+ph1.getTel());
		System.out.println(ph2.getName()+"의 번호 "+ph2.getTel());
		
		
	}

}
