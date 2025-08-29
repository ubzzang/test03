package ch09;

import java.util.StringTokenizer;

public class StringTokenizerEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="3+5";
		StringTokenizer st1 = new StringTokenizer(str,"+-*/%", true);
		int num1 = Integer.parseInt(st1.nextToken()); // 토큰은 무조건 문자형임 ~
		String op = st1.nextToken();
		int num2 = Integer.parseInt(st1.nextToken()); 
		
		System.out.println(num1);
		System.out.println(op);
		System.out.println(num2);
		
		switch(op) {
		case "+" : System.out.println(num1+num2); break;
		case "-" : System.out.println(num1-num2); break;
		case "*" : System.out.println(num1/num2); break;
		case "/" : System.out.println(num1/num2); break;
		case "%" : System.out.println(num1%num2); break;
		}
		
		String names = "홍길동, 김다혜,전영랑 이정은"; // 콤마다음 공백이 잇기도 하고~ 없기도 하고~ 콤마 자체가 없기도 하고~
		String[] arrStr = names.split(", "); // 스플릿은 무조건 한 덩어리
		StringTokenizer st = new StringTokenizer(names, ", ",true); // 콤마 or 공백 or 콤마공백 여러개 다 됨
		//토큰 만들때 true 들어가면 구분자자가 표시됨
		//구분자도 하나의 토큰으로 생각할 수 있음
		
		for(int i=0; i<arrStr.length; i++)
			System.out.println(arrStr[i]);
		
		System.out.println();
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
