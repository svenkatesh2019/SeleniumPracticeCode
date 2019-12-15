package com.edureka.controls;



import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class WindowHandleFirefixDriver {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sudv\\eclipse-workspace\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		Dimension origsize = driver.manage().window().getSize();
		System.out.println("actual main window size is  " + origsize);
		Dimension dim = new Dimension(500,1000);
     	//Resize current window to the set dimension
     	driver.manage().window().setSize(dim);
			
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String parentwindow = driver.getWindowHandle();
		System.out.println("parent windowhandle is  "+ parentwindow);
		WebElement clickbutton = driver.findElement(By.id("button1"));
		
		
		
		for(int count = 0;count <2;count++)
		{
			//Actions action = new Actions(driver);
			//action.moveToElement(clickbutton).click().perform();
			//Point p = clickbutton.getLocation();
			//action.moveToElement(clickbutton).moveByOffset(p.y, p.y).click().perform();
			clickbutton.click();
		
			System.out.println("count is " + count );
		}
		
		Set<String> allwindows = driver.getWindowHandles();
		Iterator<String> i1 = allwindows.iterator();
		
		while(i1.hasNext())
		{
			String childwindow = i1.next();
			if(!parentwindow.equalsIgnoreCase(childwindow))
				{
				
				    System.out.println("child window is " + childwindow);
					driver.switchTo().window(childwindow);
					driver.get("http://www.facebook.com");
				}
			
			
		}
		
		 System.out.println("switching to parent window  "+parentwindow);
		 driver.switchTo().window(parentwindow);
		 driver.manage().window().maximize();
		 
		
		}
		
		
	}

