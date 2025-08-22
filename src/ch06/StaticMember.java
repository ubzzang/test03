package ch06;

import java.util.Scanner;

class CurrencyCanverter{
	private static double rate;
	public static double toDollar(double won) {
		return won/rate;
	}
	public static double toKWR(double dollar) {
		return dollar*rate;
	}
	public static void setRate(double r) {
		rate=r;
	}
}

public class StaticMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("환율(1달러)>>");
		double rate = sc.nextDouble();
		CurrencyCanverter.setRate(rate);
		System.out.println("백만원은 $"+CurrencyCanverter.toDollar(1000000)+"입니다.");
		System.out.println("$100는"+CurrencyCanverter.toKWR(100)+"입니다.");
	}

}
