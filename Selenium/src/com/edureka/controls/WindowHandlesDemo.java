package com.edureka.controls;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlesDemo {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudv\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement getelement = driver.findElement(By.xpath("//button[@class = 'btn btn-info']"));
		getelement.click();
		System.out.println("the website title is " + driver.getTitle());
		
		Set<String> listofwindows =  driver.getWindowHandles();
		Iterator<String> iter = listofwindows.iterator();
		
		String mainwindow = iter.next();
		String childwindow = iter.next();		
		
		System.out.println("Main window" + driver.getTitle());
		driver.get("http://www.google.com");
		
		driver.switchTo().window(childwindow);
		
		System.out.println(" Child window" + driver.getTitle());
		WebElement tab1  =driver.findElement(By.xpath("//*[@id=\"container\"]/header/div/div/div[2]/ul/li[2]/a"));

		Actions action = new Actions(driver);
		action.moveToElement(tab1).perform();
		
		driver.get("http://www.facebook.com");
		driver.switchTo().window(mainwindow);
		driver.get("https://www.edureka.co/");
		

	}

}
