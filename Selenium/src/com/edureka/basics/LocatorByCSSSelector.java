package com.edureka.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByCSSSelector {

public static WebDriver driver = null;
	

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudv\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		WebElement someElement = driver.findElement(By.cssSelector("button[type='submit']"));
		//someElement.sendKeys("12345");
		someElement.click();

	}

}
