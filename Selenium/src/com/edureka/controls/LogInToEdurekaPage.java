package com.edureka.controls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInToEdurekaPage {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudv\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.edureka.co/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Log In']")).click();
		
		WebElement username = driver.findElement(By.id("si_popup_email"));
		WebElement password = driver.findElement(By.id("si_popup_passwd"));
		
		
		username.sendKeys("sud.v@hotmail.com");
		Thread.sleep(3000);
		password.sendKeys("Andal@17");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'WORK WITH US')]")));
		
		
		driver.findElement(By.xpath("//span[@class='user_name']")).click();
		driver.findElement(By.xpath("//a[text()='My Profile']")).click();
		driver.findElement(By.xpath("//a[@id='personal_details']//i[@class='icon-pr-edit']")).click();
		
		WebElement role = driver.findElement(By.xpath("//input[@name='currentrole']"));
		role.sendKeys(Keys.chord(Keys.CONTROL, "a"),"automation tester");
		
		
		WebElement continuebutton = driver.findElement(By.xpath("//button[@class='btn btn-default pull-right verify-continue-btn']"));
		continuebutton.click();
				
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='changes-saved']")));
				
		continuebutton.click();
		String nextpage = "My Profile | Edureka";
		if( driver.getTitle()!= nextpage)
				{
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='changes-saved']")));
			
					continuebutton.click();
				}
		
		//driver.findElement(By.xpath("//button[@class='btn btn-default pull-right verify-continue-btn']")).click();
				
		driver.findElement(By.xpath("//a[contains(text(),'Professional')]")).click();
		WebElement companyname = driver.findElement(By.xpath("//input[@placeholder='Enter Company Name']"));
		companyname.sendKeys(Keys.chord(Keys.CONTROL,"a"),"fiserv");
		System.out.println("fiserv");
		//Actions mouseaction = new Actions(driver);
		
	    //mouseaction.moveToElement(companyname).keyDown(companyname, Keys.SHIFT).sendKeys("fiserv").keyUp(role, Keys.SHIFT).perform();
		
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='changes-saved']")));
	    
	    WebElement nextbutton = driver.findElement(By.xpath("//button[@class='btn pull-right onboarding-primary-button']"));
	    nextbutton.click();
	    
	    System.out.println(driver.getTitle());
	    Select salary = new Select(driver.findElement(By.xpath("//select[@name='lastDrawnSalaryUS']")));
	    salary.selectByIndex(4);
	    System.out.println("here");
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='changes-saved']")));
	    nextbutton.click();
	    System.out.println("career intersts page " + driver.getTitle());
	    
	}
	

}
