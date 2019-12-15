package com.edureka.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoXPath {
	
	public static WebDriver driver = null;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudv\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		WebElement fname = driver.findElement(By.xpath("//input[@id='u_0_f']"));
		WebElement emailTextbox = driver.findElement(By.id("email"));
		emailTextbox.sendKeys("123@test.com");
		fname.sendKeys("sridevi");
	
		//handling dynamic web elements using contains method
		WebElement passwordTxtBox = driver.findElement(By.xpath("//label[contains(text(),'Cus')]"));
	
		System.out.println(passwordTxtBox.getText());
		
		WebElement lname=driver.findElement(By.xpath("//input[contains(@id,'u_0_h')]"));
		lname.sendKeys("venkatesh");
		
		//creating xpath using starts-with 
		WebElement submitButton = driver.findElement((By.xpath("//button[starts-with(text(),'Sign')]")));
		//submitButton.click();
		
		WebElement getLink = driver.findElement(By.xpath("//a[starts-with(@href, '/legal/')]"));
		
		getLink.click();
		
	}

}
