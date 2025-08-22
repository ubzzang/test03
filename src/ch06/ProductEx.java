package ch06;

public class ProductEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		p1.setPno(1);
		p1.setName("컴퓨터");
		p1.setPrice(100);
		p1.setCompany("LG");
		p1.display();
		System.out.println("p1 name: "+p1.getName());
		
		Product p2 = new Product(2, "연필");
		p1.setPrice(200);
		p1.setCompany("동화");
		p2.display();
		
		Product p3 = new Product(3, "노트", 100, "문화");
		p3.display();
	}

}
