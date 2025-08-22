package ch06;

public class MethodEx02 {
	static int sum(int a, int b) {
		return a+b;
	}	
//	static double sum(int a, int b) {
//		return (double)a+b; // 메소드 오버로딩 안됨 ,, 파라미터가 달라야함
//		//ex - sum(1,2) 하면 뭘불러야할지 모름.
//	}
	static int sum(int a, int b, int c) {
		return a+b+c;
	}
	static double sum(double a, double b) {
		return a+b*0.5;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(1,2));
		System.out.println(sum(1,2,3));
		System.out.println(sum(1.2,3)); // 더블로되잇는거 받음
	}
}
