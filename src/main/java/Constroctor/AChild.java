package Constroctor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AChild {
	
	 WebDriver driver;
     public AChild( WebDriver driver) {
	       this.driver= driver;
}

   public void FbLogin() {
	   WebElement email = driver.findElement(By.xpath("//input[@id=\"email\"]"));
	   email.click();
	   email.sendKeys("ashokshankar.143@gmail.com");
  }

}
