package com.edureka.controls;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnchorTagToFindAllLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudv\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
		
		  List<WebElement> alllinks = driver.findElements(By.tagName("a"));

		  for(WebElement link:alllinks)
		  { 
			  //System.out.println("all Links : - " + link.getText());
			   String linkname = link.getText();
			  
			  if( linkname != ""| linkname!=null)
				  
				  System.out.println(link.getText());
				  
		  
		  }
		  
	}

}
