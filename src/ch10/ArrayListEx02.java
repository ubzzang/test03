package ch10;
import java.util.ArrayList;

public class ArrayListEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("홍길1");
		al.add("홍길2");
		al.add("홍길3");
		al.add("홍길4");
		al.add("홍길5");
		
		for(int i=0; i<al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}
	}

}
