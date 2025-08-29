package ch09.exam;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			int[] arr=new int[3];
			for(int i=0; i<3; i++) {
				arr[i]=(int)(Math.random()*3)+1;
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			if(arr[0]==arr[1]&&arr[0]==arr[2]) {
				System.out.println("성공");
				break;
			}
			
		}

	}

}
