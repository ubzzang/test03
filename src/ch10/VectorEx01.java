package ch10;

import java.util.Vector;

public class VectorEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<>();
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(1, 40);
		v.remove(2);
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
//		System.out.println(v.get(0));
//		System.out.println(v.get(1));
//		System.out.println(v.get(2));
		System.out.println(v.size());
	}

}
