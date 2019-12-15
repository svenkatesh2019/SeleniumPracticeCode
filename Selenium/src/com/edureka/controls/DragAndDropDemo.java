package com.edureka.controls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudv\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		//driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-1.html");
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*
		WebElement cap1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement cntry1 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		
		*/
		
		//WebElement cap2 = driver.findElement(By.xpath("//*[@id=\"box1\"]"));
		//WebElement cntry2 = driver.findElement(By.xpath("//*[@id=\"dropBox\"]"));
		
		WebElement from = driver.findElement(By.xpath("//*[@id=\"box1\"]"));
		WebElement to = driver.findElement(By.xpath("//div[text()='Norway']"));
		
		Actions dragaction = new Actions(driver);
		
		//dragaction.dragAndDrop(cap1, cntry1).perform();
		//dragaction.dragAndDrop(cap2, cntry2).build().perform();
		dragaction.dragAndDrop(from,to).build().perform();
		
		
	}

}
