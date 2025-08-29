package ch10.exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

import ch07.exam.Book;
import ch07.exam.CompactDisc;
import ch07.exam.ConversationBook;
import ch07.exam.Product;

public class ProductInfoHashMap {
	static HashMap<Integer, Product> map;
	static Scanner sc;
	static int cnt=0;
	
	static void input() {
		while(true) {
			System.out.print("상품의 종류를 선택:1 책|2 앨범|3 회화책|4 입력종료>>");
			int num=sc.nextInt();
			if(num==4)
				break;
			System.out.print("상품설명:>>");
			sc.nextLine();
			String comment=sc.nextLine();
			System.out.print("생산자>>");
			String productor=sc.next();
			System.out.print("가격>>");
			int price=sc.nextInt();
			
			switch(num) {
			case 1: 
				System.out.print("책제목>>");
				String title=sc.next();
				System.out.print("저자>>");
				String author=sc.next();
				map.put(++cnt, new Book(cnt,comment,productor,price,title,author));
				break;
			case 2:
				System.out.print("앨범제목>>");
				String albumTitle=sc.next();
				System.out.print("가수>>");
				String singer=sc.next();
				map.put(++cnt, new CompactDisc(cnt, comment,productor,price,albumTitle, singer));
				break;
			case 3:
				System.out.print("책제목>>");
				title=sc.next();
				System.out.print("저자>>");
				author=sc.next();
				System.out.print("언어>>");
				String language=sc.next();
				map.put(++cnt, new ConversationBook(cnt,comment,productor,price,title,author,language));
				break;
			default:
					System.out.println("입력오류");
			}
		}
		System.out.println("데이터입력 종료");
		
	}
	static void search() {
		while(true) {
			System.out.print("상품아이디>>");
			int key=sc.nextInt();
			if(key==0)
				break;
			boolean flag=map.containsKey(key);
			if(flag)
				map.get(key).display();
			else
				System.out.println("찾는 값이 없습니다.");
		}
		System.out.println("검색종료");
		
	}
	static void allShow() {
		Set<Integer> keys=map.keySet();
		Iterator<Integer> it=keys.iterator();
		
		while(it.hasNext()) {
			Integer key=it.next();
			map.get(key).display();;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		map=new HashMap<>();
		sc=new Scanner(System.in);
				
		boolean flag=false;
		while(true) {
			System.out.println("1 상품추가|2 상품조회|3 모든 상품조회|4 끝내기");
			int num=sc.nextInt();
			switch(num) {
			case 1: input(); break;
			case 2: search();break;
			case 3: allShow();break;
			case 4: flag=true;break;
			default:System.out.println("입력오류");
			}
			if(flag)
				break;
		}
		System.out.println("프로그램 종료");

	}

}
