package Loops;

public class Nestedwhile {

	public static void main(String[] args) {
		int i=0;
		int j=0;
//		do {
//			System.out.println(i);
//			System.out.println(j);
//			j++;
//			i++;
//		}
//		while(i<=5 && j<=5);
//		
//		// TODO Auto-generated method stub
		
		while(i<=3) {
			while (j<=2) {
				System.out.println(j);
				j++;	
			}
			i++;
			System.out.println(i);
		}

	}

}
