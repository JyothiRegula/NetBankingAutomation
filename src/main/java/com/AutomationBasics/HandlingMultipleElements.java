package com.AutomationBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleElements {
	 
	@Test
	public void webElement() throws Exception {
	
	
	WebDriverManager.chromedriver().setup(); 
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://demo.guru99.com/test/newtours/");
	
	List<WebElement> noOfLinks = driver.findElements(By.tagName("a"));
	System.out.println(noOfLinks.size());
	
	for(WebElement links:noOfLinks) {
		System.out.println(links.getText());
	}
	
	driver.quit();
	
	}
}
