package com.dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleElements {
	
	public static WebDriver driver;
	
	
	@Test
	public static void multipleWebElement() throws InterruptedException {
	//public static void main(String[] args) throws InterruptedException {
		
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///E:/Users/JyothiRegula/eclipse-workspace/Team/HTML/MultipleSelectDropDown.html");
		
		WebElement ddAddr = driver.findElement(By.id("Novotel")); 
		Select sel = new Select(ddAddr);
	 
		// handle multiple webelement
		List<WebElement> allOptions = sel.getOptions();
		int noOfOps = allOptions.size();
		System.out.println(noOfOps);
		for(int i=0;i<allOptions.size();i++) {
			 WebElement oneOption = allOptions.get(i);
			 String  text = oneOption.getText();
			 System.out.println(text);
			 
		}
	
	}
	
	
	
	
}
