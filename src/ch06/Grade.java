package ch06;

public class Grade {
	int sno;
	String name;
	int kor;
	int eng;
	int math;
	int avg;
	int rank=1;
	
	public Grade() {}
	
	public void display(){
		System.out.println(sno+"\t"+name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+avg+"\t"+rank);
	}
	
	public Grade(int sno, String name, int kor, int eng, int math) {
		this.sno=sno;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	public void setAvg() {
		avg=(this.kor+this.eng+this.math)/3;
	}
	
	public void setRank(Grade s) {
		if(s.avg>this.avg)
		rank++;
	}
}
