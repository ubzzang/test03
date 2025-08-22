package ch06;

import java.util.Scanner;

/*4장 연습문제 3번*/
class Rect{
	private int width, height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int getArea() {return width*height;}
}
public class RectEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect[] rects = new Rect[4];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<rects.length; i++) {
			System.out.println("너비와높이");
			int width = sc.nextInt();
			int height = sc.nextInt();
			
			rects[i]=new Rect(width, height);
		}
		System.out.println("저장하였습니다.");
		
		int sum=0;
		
		for(int i=0; i<rects.length; i++) {
			sum+=rects[i].getArea();
		}
		
		System.out.println("사각형 전체의 합은 "+sum);
		
		sc.close();
	}

}
