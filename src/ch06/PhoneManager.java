package ch06;

import java.util.Scanner;
public class PhoneManager {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원수>>");
		int n = sc.nextInt();
		Phone[] phones = new Phone[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("이름과 전화번호(번호는 연속적으로 입력)");
//			String name = sc.next();
//			String tel = sc.next();
			
			phones[i]=new Phone(sc.next(), sc.next());
		}
		
		System.out.println("저장되었습니다.");
		
		while(true) {
			System.out.println("검색할 이름 >>");
			String search = sc.next();
			if(search.equals("exit")) {
				break;
			}
			
			boolean flag=false;		
			for(int i=0; i<n; i++) {
				if(search.equals(phones[i].getName())){
					System.out.println(search+"의 번호는 "+phones[i].getTel());
					flag=true;
					break;
				}
			}
			if(!flag) {
				System.out.println(search+"이 없습니다.");
			}
		}
		System.out.println("종료되었습니다.");
	}

}
