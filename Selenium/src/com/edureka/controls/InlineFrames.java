package com.edureka.controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InlineFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudv\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		WebElement textbox = driver.findElement(By.xpath("//a[@href=\"#Multiple\"]"));
		textbox.click();
		
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\" ]"));
		
		driver.switchTo().frame(outerframe);
		//WebElement innerframe = driver.findElement(By.xpath("//iframe[@style=\"float: left;height: 250px;width: 400px\"]"));
		//driver.switchTo().frame(innerframe);
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("12345");
				
		
		
	}

}
