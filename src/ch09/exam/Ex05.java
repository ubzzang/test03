package ch09.exam;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] str= {"가위","바위","보"};
		while(true) {
			System.out.print("가위(1),바위(2),보(3),끝내기(4)>>");
			int num1=sc.nextInt();
			if(num1==4)
				break;
			int num2=(int)(Math.random()*3)+1;
			System.out.println("사용자 "+str[num1-1]+": 컴퓨터 "+str[num2-1]);
			
			if(num2==1) num1=num1%3;
			if(num1==1) num2=num2%3;
			if(num1>num2)
				System.out.println("사용자가 이겼습니다");
			else if(num1==num2)
				System.out.println("비겼습니다.");
			else
				System.out.println("컴퓨터가 이겼습니다.");
			
		}

	}

}
