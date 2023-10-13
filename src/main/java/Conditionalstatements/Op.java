package Conditionalstatements;

public class Op {


	public static void main(String[] args) {

		 int a=100;
		 int b=5;
		 int c=0;
		//int a,b,c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		if  ((a<b)&&(c<b)) {
			System.out.println("B is big");
		}
		else if ((a>b)&&(a>c)) {
				System.out.println("A is big");
			}
		else if ((c<a)&&(c<b)) {
			     System.out.println("C is Big");	
			}
		}

	}


