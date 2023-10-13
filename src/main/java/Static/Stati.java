package Static;

public class Stati {
	static int a=5;
	static int b=4;
	static int c=3;
	public static void sum() {
		int s = a+b;
		System.out.println(s);
	}

	public static void main(String[] args) {
		System.out.println("sum value");
		sum();
		int k=a+41;
		System.out.println("the k value");
		System.out.println(k);
		
		
	}

}
