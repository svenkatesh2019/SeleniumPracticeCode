package com.edureka.controls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) {



		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudv\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.macys.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement mainmenu = driver.findElement(By.xpath("//span[text()='SHOP BY DEPARTMENT']"));
		WebElement menu=driver.findElement(By.xpath("//span[text()='beauty']"));
		WebElement menu2= driver.findElement(By.xpath("//a[text()='Concealer']"));
		Actions action = new Actions(driver);
		
		action.moveToElement(mainmenu).perform();
		action.moveToElement(menu).perform();
		menu2.click();
		
		String expectedtitle="Concealer Makeup - Macy's";
		
		String actualtitle = driver.getCurrentUrl();
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("navigated to the menu");
			
		}
		else
			System.out.println("did not navigate to the menu");
		}
	}


