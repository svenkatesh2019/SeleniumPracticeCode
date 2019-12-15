package com.edureka.controls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoElemntAndMoreMouseActions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sudv\\eclipse-workspace\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		WebElement email= driver.findElement(By.xpath("//input[@id='email']"));
		Actions mouseaction = new Actions(driver);
		
		mouseaction.moveToElement(email).keyDown(email, Keys.SHIFT).sendKeys("sud.v@hotmail.com").keyUp(Keys.SHIFT).doubleClick().contextClick(email).build().perform();
		
	}

}
