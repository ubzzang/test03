package ch09;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = " abc\t\n";
		System.out.println("1:"+x+"end");
		System.out.println("1:"+x.trim()+"end");
		
		String a = "Hello";
		System.out.println(a.hashCode());
		String b = "Java";
		String c = "Hello";
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");
		System.out.println(a.compareTo(c)); //0
		System.out.println(a.compareTo(b)); //-2 첫글자가 2개차이나서 자기가 더 작으면 음수로
		System.out.println(b.compareTo(a));  //2 첫글자가 2개차이나서 자기가 더 크면 양수로
		
		System.out.println(a==c);
		System.out.println(a.equals(c));
		System.out.println(e.equals(f));
		String s = a.concat("Java");
		a+="Java";
		
		System.out.println(a);
		System.out.println(a.hashCode());
	}

}
