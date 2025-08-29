package ch09.exam;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true) {
			String s1=sc.nextLine();
			if(s1.equals("exit"))
				break;
			String[] sArr=s1.split(" ");
			System.out.println("어절의 개수는 "+sArr.length);
			
			StringTokenizer st=new StringTokenizer(s1," ");
			int count=st.countTokens();
			System.out.println("어절의 개수는 "+count);
			
		}
		System.out.println("종료합니다.");

	}

}
