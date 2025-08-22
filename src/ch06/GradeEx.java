package ch06;

import java.util.Scanner;

public class GradeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grade student[] = new Grade[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<student.length; i++) {
			int sno=sc.nextInt();
			String name=sc.next();
			int kor=sc.nextInt();
			int eng=sc.nextInt();
			int math=sc.nextInt();
			
			student[i]=new Grade(sno,name,kor,eng,math);
			student[i].setAvg();
					
		}
		for(int i=0; i<student.length; i++) {
			for(int j=0; j<student.length; j++) {
				student[i].setRank(student[j]);
			}
		}
		for(Grade s:student) {
			s.display();
		}
		
	}

}
