package ch09.exam;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex03 {
	public static void main(String[] args) {
		//2 + 5 + 6 + 10
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(s);
		StringTokenizer st=new StringTokenizer(s,"+");
		int sum=0;
		while(st.hasMoreTokens()) {
			int num=Integer.parseInt(st.nextToken().trim());
			sum+=num;
		}
		System.out.println("합은 "+sum);	
	}

}
