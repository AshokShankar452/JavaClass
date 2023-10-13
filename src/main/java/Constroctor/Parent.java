package Constroctor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent {
	static WebDriver driver;
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHOK SHANKAR\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			driver = new ChromeDriver();
	
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 AChild Web = new AChild(driver); 
		 Web.FbLogin();
		 AChild1 Web1 = new AChild1(driver);
		 Web1.pwd();
		 AChild1 Web3 = new AChild1(driver);
		 Web3.pwd();
		 
		 driver.get("https://www.instagram.com/");
		 BChild Web0 = new BChild(driver);
		 Web0.inst();
		 
			
		 		 
	}
	
}
