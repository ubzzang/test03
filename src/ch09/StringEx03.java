package ch09;

public class StringEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb.hashCode());
		System.out.println(sb.capacity());
		sb.append(" is pencil.");
		System.out.println(sb.capacity());
		System.out.println(sb.hashCode());
		// sb = "This is pencil."
		sb.insert(7, " my");
		System.out.println(sb);
		sb.replace(8, 10, "your");
		// sb = "This is my pencil."
		// sb = "This is your pencil."
		System.out.println(sb);
		sb.append("StringBuffer 용량크기 변경");
		// "This is your pencil." 출력
		System.out.println(sb.capacity());
		System.out.println(sb.hashCode());
		String str = sb.toString();
	}

}
