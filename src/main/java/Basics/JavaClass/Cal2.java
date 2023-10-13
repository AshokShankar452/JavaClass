package Basics.JavaClass;

public class Cal2 {
	static int a = 200;
	static int b = 150;
	static int c = 100;

	public static void sum() {
		int result_val = a + b + c;
		System.out.println(result_val);
	}

	public static void main(String[] args) {
		sum();
		mul();
	}

	static int e = 42;
	static int f = 58;
	static int g = 12;
	static int d = 29;

	// int a b c = 12 13 14;
	public static void mul() {
		int result_value = e * f * g * d;
		System.out.println(result_value);

	}
}
