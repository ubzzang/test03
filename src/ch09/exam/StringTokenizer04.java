package ch09.exam;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		Scanner sc = new Scanner(System.in);

		String opp = sc.nextLine();
		StringTokenizer st = new StringTokenizer(opp, "+");

		int n = st.countTokens();
		int c[] = new int[n];

		while (st.hasMoreTokens()) {
			for (int i = 0; i < n; i++) {
				String token = st.nextToken(); 
				token.trim();
				c[i] = Integer.parseInt(token);
				sum += c[i];
			}
		}
		System.out.println("합은" + sum);

	}

}
