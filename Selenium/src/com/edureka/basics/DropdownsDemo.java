package com.edureka.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropdownsDemo {
	
public static void main(String[] args) {
		

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sudv\\eclipse-workspace\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yatra.com");
		
		WebElement search=driver.findElement(By.xpath("//input[@type='submit']"));
		
		search.click();
		

}
}
