package ch07.exam;

import java.util.Scanner;

public class ProductInfo {
	static Scanner sc;
	static int cnt=0;
	static void input(Product[] p) {
		System.out.print("상품의 종류를 선택 >> 1. 책 | 2. 앨범 | 3. 회화책 >>");
		int num = sc.nextInt();
		
		System.out.print("상품설명:>>");
		sc.nextLine();
		String comment = sc.nextLine();
		System.out.print("생산자:>>");
		String productor = sc.next();
		System.out.print("가격:>>");
		int price = sc.nextInt();
		
		switch(num) {
			case 1: 
				System.out.println("책제목:>>");
				String title = sc.next();
				System.out.println("저자:>>");
				String author = sc.next();
				p[cnt]=new Book(++cnt, comment, productor, price, title, author);
				break;
			case 2:
				System.out.println("앨범타이틀:>>");
				String albumTitle = sc.next();
				System.out.println("가수이름:>>");
				String singer = sc.next();
				p[cnt]=new CompactDisc(++cnt, comment, productor, price, albumTitle, singer);
				break;
			case 3: 
				System.out.print("책제목:>>");
				title = sc.next();
				System.out.print("저자:>>");
				author = sc.next();
				System.out.print("언어:>>");
				String language = sc.next();
				p[cnt]=new ConversationBook(++cnt, comment, productor, price, title, author, language);
				break;
			default:
				System.out.println("입력오류");
		}
	}
	static void search(Product[] p) {
		System.out.print("상품아이디:>>");
		int id = sc.nextInt();
		boolean flag=false;
		for(int i=0; i<cnt; i++) {
			if(p[i].getId()==id) {
				p[i].display();
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("찾는 아이디가 없습니다.");
		}
	}
	static void allShow(Product[] p) {
		for(int i=0; i<cnt; i++) {
			p[i].display();
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		Product[] products = new Product[10];
		boolean flag=false;
		while(true) {
			System.out.println("1. 상품추가 | 2. 상품조회 | 3. 모든 상품조회 | 4. 끝내기");
			int num = sc.nextInt();
			switch(num) {
			case 1: input(products);break;
			case 2: search(products); break;
			case 3: allShow(products); break;
			case 4: flag=true; break;
			default:System.out.println("입력오류");
			}
			if(flag) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
