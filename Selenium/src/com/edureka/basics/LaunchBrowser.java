package com.edureka.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static WebDriver driver = null;
	

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudv\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		WebElement dataPolicy= driver.findElement(By.partialLinkText("Policy"));
		
		dataPolicy.click();
		Thread.sleep(10000);
		
			//driver.close();
		driver.quit();

	}

}
