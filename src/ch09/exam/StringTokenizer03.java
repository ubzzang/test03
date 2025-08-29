package ch09.exam;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("문자를 입력하세요");
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				break;
			}
			StringTokenizer st = new StringTokenizer(str, " ");
			int count=st.countTokens();
			System.out.println("어절의 개수는 " + count);
			
		}
		
		System.out.println("종료합니다 ...");
	}

}
