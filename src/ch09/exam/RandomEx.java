package ch09.exam;

public class RandomEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = new int[3];
		while (true) {
			for (int i = 0; i < n.length; i++) {
				n[i] = (int)(Math.random()*3 + 1);
				System.out.print(n[i] + "\t");
			}
			System.out.println();

			if (n[0]==n[1] && n[1]==n[2]) {
				System.out.println("성공!");
				break;
			}
		}
	}

}
