package ch10;
import java.util.ArrayList;
public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		int sum = 0;
		for(int i=0; i<al.size(); i++) {
			System.out.print(al.get(i) + " ");
			sum+=al.get(i);
		}
		System.out.println();
		System.out.println("합은" + sum + "입니다.");
	}

}
