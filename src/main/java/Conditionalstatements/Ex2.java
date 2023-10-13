package Conditionalstatements;

public class Ex2 {

	public static void main(String[] args) {
		String a="Welcom To India";
		String b="Namaste";
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.concat(b));
		String s = String.format("%s%s",a,b);
		String t = String.join("",a,b);
		System.out.println(s);
		System.out.println(t);
	    
	}
}
