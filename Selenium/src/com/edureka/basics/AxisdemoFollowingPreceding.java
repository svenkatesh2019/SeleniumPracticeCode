package com.edureka.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AxisdemoFollowingPreceding {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudv\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='year']/preceding-sibling::select/option[@value='5']"));

		month.click();

		WebElement months = driver.findElement(By.xpath("//select[@id='month']/following::select/option[@value='27']"));
		months.click();
		
		driver.findElement(By.xpath("//select[@id='month']/following::select/option[@value='2006']")).click();
		
		driver.findElement(By.xpath("//select[@id = 'day']/following-sibling::select/option[@value='2016']")).click();
		System.out.println("grouping and indexing web elements");
		
		driver.findElement(By.xpath("(//option[@value = '10'])[1]")).click();
		
	}

}
