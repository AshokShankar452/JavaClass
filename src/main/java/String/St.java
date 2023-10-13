package String;

public class St {

	public static void main(String[] args) {

		String c = new String ("india");
		String a = new String ("hellow");
		System.out.println(c);
		System.out.println(c.charAt(4));
		System.out.println(c.codePointAt(2));
		System.out.println(c.length());
		System.out.println(c.compareTo(a));
		System.out.println(a.isBlank());
		System.out.println(c.concat(a));
		System.out.println(a.indexOf("i"));
		
	}
}