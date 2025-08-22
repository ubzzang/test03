package ch06;

public class Product {
	private int pno;
	private String name;
	private int price;
	private  String company;
	
	public Product() {} //디폴트 생성자
	
	public Product(int pno, String name) {
		this.pno = pno;
		this.name = name;
	}
	
	public Product(int pno, String name, int price, String company) {
		super();
		this.pno = pno;
		this.name = name;
		this.price = price;
		this.company = company;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void display() {
		System.out.println(pno + " " + name + " " + price + " " + company);
	}
}
