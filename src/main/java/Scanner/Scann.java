package Scanner;

import java.util.Scanner;

public class Scann {

	public static void main(String[] args) {
		 Scanner A = new Scanner (System.in);
		 System.out.println("Enter the String");
		 String k =A.nextLine();
		 System.out.println("String is   " +k);
		 
		for (int i = 0; i < k.length(); i++)
		    {   
			    char letter = k.charAt(i);
		      
		      if (letter == 'o' && ((i != 0) && (i != k.length())))
		        {
		    	    	
		        	System.out.println("selected character index is " +i);
		            System.out.println(k.intern());
		        } 
	 }

}
}