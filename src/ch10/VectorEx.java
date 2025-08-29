package ch10;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vs = new Vector<>();
		vs.add("홍길동");
		vs.add("김다혜");
		vs.add("진영량");
		
		System.out.println(vs.contains("김길동"));
//		System.out.println(vs.elementAt(0)); //실제론 겟을 더 많이 씀
//		System.out.println(vs.get(0));
//		vs.remove("홍길동");
		
		Object[] arr = vs.toArray();
		for(Object a:arr) {
			System.out.println(a);
		}
		
		for(int i=0; i<vs.size(); i++) {
			System.out.println(vs.get(i));
		}
	}

}
