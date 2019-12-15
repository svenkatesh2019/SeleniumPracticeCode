package com.edureka.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YatraDepartureDate {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudv\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yatra.com");
		
		WebElement search=driver.findElement(By.xpath("//input[@type='submit']"));
		
		search.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement departdate = driver.findElement(By.xpath("//div[contains(@class,'input-holder pb-2 depart')]"));
		departdate.click();
		WebElement pickdate= driver.findElement(By.xpath(" //section[@id='flightSRP']//div[10]//p[1]//span[1]"));
		pickdate.click();
		

	}

}
