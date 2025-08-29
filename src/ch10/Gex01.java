package ch10;

class ClassEx<E>{
	E i;
	
	public void set(E i) {
		this.i=i;
	}
	public E get() {
		return i;
	}
}

public class Gex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassEx<Integer> ia = new ClassEx<>();
		ia.set(10);
		System.out.println(ia.get());
		
		ClassEx<String> sa = new ClassEx<>();
		sa.set("java");
	}

}
