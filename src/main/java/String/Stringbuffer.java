package String;

public class Stringbuffer {

	public static void main(String[] args) {

		StringBuffer b = new StringBuffer("India");
		System.out.println(b.deleteCharAt(2));
		//System.out.println(b.insert(j, null));
		
		StringBuilder k = new StringBuilder("World");
		System.out.println(k.append(5));
	}

}
