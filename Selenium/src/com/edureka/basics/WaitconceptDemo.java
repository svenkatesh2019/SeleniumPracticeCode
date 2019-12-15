package com.edureka.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import okio.Timeout;

public class WaitconceptDemo {

	public static void main(String[] args) {
		
		
		//ImplicitlyWait() method
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudv\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebElement username = driver.findElement(By.xpath("//input[contains(@aria-label,'Email or phone')]"));
		
		WebElement username = driver.findElement(By.id("identifierId"));
		
		username.sendKeys("sridevivenkatesh2017@gmail.com");
		driver.findElement(By.xpath("//span[starts-with(@class,'RveJvd')]")).click();
			
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Andal@16");
		
		WebElement nextButton= driver.findElement(By.xpath("//span[text()='Next']"));
		nextButton.click();
		
		//Explicitly wait method()
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.titleIs("Inbox (36) - sridevivenkatesh2017@gmail.com - Gmail"));
		
		WebElement compose = driver.findElement(By.xpath("//div[(@jslog='20510; u014N:cOuCgd,Kr2w4b')]"));
		
		wait.until(ExpectedConditions.visibilityOf(compose));
		
		compose.click();
		
		
		
		

		

	}

}
