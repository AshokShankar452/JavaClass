package Basics.JavaClass;

public class Calu {

	static int a = 100;
	static int b = 500;
	public static void sum(){
		int c = a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		sum();  //method calling for above operation
		div();
	}
	static int d = 825;
	static int e = 15;
	public static void div() {
		int f = d/e;
		System.out.println(f);
		}
	
}