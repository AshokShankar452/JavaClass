package Constroctor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AChild1 {
	WebDriver driver;
	AChild1(WebDriver driver) { 
		 this.driver= driver;
		 
	 }
	public void pwd() {
		WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		password.click();
		password.sendKeys("123456");
		
	}

}
