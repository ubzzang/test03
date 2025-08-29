package ch07;

/*final이 붙여져있으면 오버라이딩 못함..*/

class AA{
	public void fun1() {
		/*final이 붙여져있으면 오버라이딩 못함..*/
		System.out.println("AA의 fun1");
	}
	public void fun2() {
		System.out.println("AA의 fun2");
	}
}
class BB extends AA{
	public void fun1() {
		/*final이 붙여져있으면 오버라이딩 못함..*/
		System.out.println("BB의 fun1");
	}
	public void fun2() {
		System.out.println("BB의 fun2");
	}
}

public class FinalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
