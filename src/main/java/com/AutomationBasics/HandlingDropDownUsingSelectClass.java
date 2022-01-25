package com.AutomationBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDownUsingSelectClass {
	

	public static WebDriver driver;
	@Test
	public static void dropDown() throws InterruptedException {
	//public static void main(String[] args) throws InterruptedException {
		
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get( "file:///E:/Users/JyothiRegula/eclipse-workspace/Team/HTML/Dropdown.html");
		Thread.sleep(2000);


		// select class is parameterised constructor --- WebElement
			WebElement ddAddr = driver.findElement(By.id("Kritunga"));
			Select sel = new Select(ddAddr);

		// 1) by the options of text selectByVisibleText() method
		 sel.selectByVisibleText("Pulihora");
		 
		// 2) by the options value selectByVisibleValue() method
		 sel.selectByValue("h");
		 
		 //3) selectByIndex() method
		 sel.selectByIndex(7); // handle duplicate option
		 Thread.sleep(2000);
		 
		sel.selectByIndex(9);
		
		// this is for single select dropdown 
		//we can not perform deselect methods for singleselect dropdown
		//sel.selectByVisibleText("Poori");
		
		// deselection options applied only on Multi- Select DropDown
		//sel.deselectByVisibleText("Poori"); // java.lang.unsupportedOperationException
	}	

}
