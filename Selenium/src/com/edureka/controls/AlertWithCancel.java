package com.edureka.controls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertWithCancel {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sudv\\eclipse-workspace\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		System.out.println("clciked alert with Ok");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//button[contains(text(),'click the button')])[2]")).click();
		System.out.println("clciked on the alert box");
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		
	}

}
