package com.AutomationBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlerts {
	
	WebDriver driver;
	@Test
	public void alert() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		// accept()
		//dismiss()
		// sendKeys()
		//getText()
		
		// Simple Alert
		/*
		driver.findElement(By.id("alertBox")).click();
		 Alert simpleAlert= driver.switchTo().alert();
		 System.out.println(simpleAlert.getText());
		 Thread.sleep(1000);
		 simpleAlert.accept();
		 Thread.sleep(2000); */
		
		// confirmation alert
		/*driver.findElement(By.id("confirmBox")).click();
		Alert confirmationAlert = driver.switchTo().alert();
		System.out.println(confirmationAlert.getText());
		Thread.sleep(2000);
		confirmationAlert.dismiss();
		System.out.println(driver.findElement(By.id("output")).getText());*/
		
		
		// prompt alert
		driver.findElement(By.id("promptBox")).click();
		Alert promptAlert = driver.switchTo().alert();
		System.out.println(promptAlert.getText());
		promptAlert.sendKeys("jyothi regula");
		promptAlert.accept();
		System.out.println(driver.findElement(By.id("output")).getText());
				
		
		
		
		 
		 driver.close();
		 
	}
	
	 
	
	

}
