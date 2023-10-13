package Oops;

public abstract class Mobile {
	
   abstract void gaming();
   abstract void recording();                   // abstract method
   public void calls() {
	   System.out.println("calling is working");
   }
   public void music() {                       //concrete method
	   System.out.println("songs are playing");
   }
}
