package Static;

public class Exp {
	static int a=5;
	static int b=9;
	static char k='B';
	public static void add() {
		int c =a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		int r = a+5;
		System.out.println(r);
		add();

	}

}
