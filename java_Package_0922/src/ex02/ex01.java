package ex02;

public class ex01 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("hello");
		sb.append("programming");
		System.out.println(sb);
		
		sb.insert(6, "JAVA");
		System.out.println(sb);
		
		sb.replace(1, 4, "GOOD");
		System.out.println(sb);
	
		sb.delete(1, 5);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
	}

}
