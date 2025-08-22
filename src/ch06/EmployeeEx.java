package ch06;

import java.util.Scanner;


public class EmployeeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee emp[] = new Employee[5];
		
		for(int i=0; i<emp.length; i++) {
			System.out.println("번호,이름,부서,직급,월급 입력하세요>>");
			int empno = sc.nextInt();
			String name = sc.next();
			String dept = sc.next();
			String position=sc.next();
			int sal = sc.nextInt();
			emp[i] = new Employee(empno,name,dept,position,sal);
		}
		
		for(Employee e:emp) {
			e.display();
		}
	}

}
