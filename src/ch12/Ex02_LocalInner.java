package ch12;

class HumanCam2{
	private int speed=10;
	
	public void getMarine() {
		class Marine2{
			public void move() {
				System.out.printf("인간형 유닛이 %d 속도로 이동합니다", speed);
			}
		}
		
		Marine2 inner = new Marine2();
		inner.move();
	}
}

public class Ex02_LocalInner {
	public static void main(String[] args) {
		
		HumanCam2 hc=new HumanCam2();
		hc.getMarine();
		
//		HunamCam2.Marine2 inner = hc.new Marine2();
		//지역 내부 클래스라서 안됨 ..
		
	}
	
}
