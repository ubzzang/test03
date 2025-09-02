package ch12;

interface Unit9{
	int calc(int a, int b);
}

public class Ex09_LambdaRule2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Unit9 unit;
		unit=(a,b)->{return a+b;};
		 //unit = a, b -> { return a + b; }; // 앞쪽소괄호생략안됨
		//unit = (a, b) -> return a + b;    // 뒤쪽중괄호생략안됨
		int num=unit.calc(10, 20);
		System.out.println(num);
		
		unit=(a,b)->a*b;
		System.out.println(unit.calc(10, 20));
	}

}
