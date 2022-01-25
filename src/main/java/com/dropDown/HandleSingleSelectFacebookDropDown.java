package com.dropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleSingleSelectFacebookDropDown {
	
	public static WebDriver driver;
	
	@Test
	public static void setUp() throws InterruptedException {
	//public static void main(String[] args) throws InterruptedException {
		
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		// one way---1
		
		// select month drop down
		/*WebElement month_dropdown = driver.findElement(By.id("month"));
		// select class
		
		Select month_dd = new Select(month_dropdown);
		// it will select march
		
		month_dd.selectByIndex(1);
		
		Thread.sleep(3000);
		System.out.println("Feb");
		
		// it will select by value 8
		Thread.sleep(3000);
		month_dd.selectByValue("8");
		
		System.out.println("Aug");
		
		Thread.sleep(3000);
		
		//it will select by text 
		month_dd.selectByVisibleText("Dec");
		Thread.sleep(3000); */
		
		WebElement Day = driver.findElement(By.id("day"));
		WebElement Month = driver.findElement(By.id("month"));
		WebElement Year = driver.findElement(By.id("year"));
		
		// second way ----2
		
		// select day
		/*Select select1 = new Select(Day);
		select1.selectByVisibleText("2");
		Thread.sleep(3000);
		
		// select month
		Select select2 = new Select(Month);
		select2.selectByVisibleText("Mar");
		Thread.sleep(3000);
		
		// select year
		Select select3 = new Select(Year);
		select3.selectByVisibleText("2017");
		Thread.sleep(3000);
		System.out.println("Happy anniversary jyothisridhar");*/
		
		
		// thirdway---3
		
		System.out.println("Happy anniversary jyothisridhar");
		// reading a string from a file or excel
		
		String dob= "18-08-1994";
		String Arr[]= dob.split("-");
		
	
		selectValueFromDropDown(Day, "10");
	    selectValueFromDropDown(Month, "May");
		 selectValueFromDropDown(Year, "2020");
		 Thread.sleep(3000);
		System.out.println("method passed successfully");
		driver.close();
		 
		
	}
	
	// utility method or generic function
	public static void selectValueFromDropDown(WebElement element,String value) {
		
		
		Select select = new Select(element);
		select.selectByVisibleText(value);
		
		 
	}

	 
}
