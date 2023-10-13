package Constroctor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BChild {
	WebDriver driver;
	BChild(WebDriver driver) { 
		 this.driver= driver;
	}
	public void inst() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		password.click();
		password.sendKeys("123456");
	}

}
