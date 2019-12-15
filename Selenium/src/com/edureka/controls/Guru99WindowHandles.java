package com.edureka.controls;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Guru99WindowHandles {

	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sudv\\eclipse-workspace\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		System.out.println("clicked the hyperlink");	
		String parentwindow = driver.getWindowHandle();
		System.out.println("parent window is " + parentwindow);
		Set<String> allwindows = driver.getWindowHandles();
		Iterator<String> iter= allwindows.iterator();
		
		System.out.println("number of windows : " + allwindows.size());
		
		while(iter.hasNext())
		{
			String childwindow =  iter.next();
			System.out.println("Child window is  "+childwindow);
			if( !parentwindow.equalsIgnoreCase(childwindow)){
				System.out.println(" Switching to child window");
				driver.switchTo().window(childwindow);
				WebElement emailid = driver.findElement(By.xpath("//input[@name = 'emailid']"));
				emailid.sendKeys("sud.v@hotmail.com");
				driver.findElement(By.xpath("//input[@name = 'btnLogin']")).click();
				System.out.println("entered email address and clicked button");		
				driver.close();
				System.out.println("Clsed the child window");
	
				}		
		
		}
		
		System.out.println("Switching to parent window");
		driver.switchTo().window(parentwindow);
	}
}

	
