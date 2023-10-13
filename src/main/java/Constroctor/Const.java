package Constroctor;

public class Const {                 //class name & constructor name should be same  

	char a = 'A';
	int  b = 420;
	char c = 'Y';
	public void show() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
Const() {
	a = 'A';
	int b = 220;
	c = 'N';
	System.out.println("constroctor initial values");
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
//}
//	
//	public static void main(String[] args) {
//		Const c = new Const();
//		c.show();
//		System.out.println("Lets use constroctor");
//		Const b = new Const();
//		b.show();
//		
	
		
	}
}
	
