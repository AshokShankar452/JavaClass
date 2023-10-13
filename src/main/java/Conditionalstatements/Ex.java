package Conditionalstatements;

public class Ex {

	public static void main(String[] args) {
		String a="Welcom To india";
		String b="welcom To Andhra";
		System.out.println(a);
		System.out.println(b);
		
		int a1=a.length();
		int b1=b.length();
		int count =0;
		
		if(a1 == b1) {
			System.out.println("The 2 strings are Equal");
		}
		else {
			System.out.println("The 2 strings are Not Equal");	
		}
		for (int i=0;i<a.length();i++) {
			count=count+1;
			
		}
		System.out.println(count);
		System.out.println(a1);

	}

}
