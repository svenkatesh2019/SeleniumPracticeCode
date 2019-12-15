package com.edureka.controls;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoveringExample {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudv\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.dell.com/en-us");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String parentwindow = driver.getWindowHandle();
		System.out.println("parent window is " + parentwindow);
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"l1_0\"]"));
		WebElement laptop = driver.findElement(By.xpath("//*[@id=\"l2_0\"]/span"));
		WebElement image = driver.findElement(By.xpath("//*[@id=\"dell-masthead\"]/div[3]/nav/ul/li[1]/ul/li[1]/ul/li[1]/a/img"));
		
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		action.moveToElement(laptop).build().perform();
		image.click();
		
		Set<String> allwindows = driver.getWindowHandles();
		Iterator<String> iter= allwindows.iterator();
		System.out.println("number of windows : " + allwindows.size());
		while(iter.hasNext())
		{
			String childwindow =  iter.next();
			System.out.println("Child window is  "+childwindow);
			driver.switchTo().window(childwindow);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				System.out.println(" Switching to child window");
				WebElement anotherimage = driver.findElement(By.xpath("//*[@id=\"cat-tiles\"]/div/div[3]/a/div[2]/p"));
				action.moveToElement(anotherimage).click().build().perform();
				
				System.out.println("found image and clicked");
			
		}
		/*
	  String expectedTitle = "https://www.dell.com/en-us/shop/scc/sc/laptops?~ck=mn";
	  String actualtitle = driver.getCurrentUrl();
		
		if(expectedTitle.equalsIgnoreCase(actualtitle))
		{
			
			WebElement anotherimage = driver.findElement(By.xpath("//*[@id=\"cat-tiles\"]/div/div[2]/a/div[1]/img"));
			
			anotherimage.click();
		}
		*/
		
		
		
		

	}

}
