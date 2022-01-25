package com.dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownPart2 {
	
	public static WebDriver driver;
	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait( 20,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/reg/");
	driver.manage().window().maximize();
	
	WebElement Day = driver.findElement(By.id("day"));
	WebElement Month = driver.findElement(By.id("month"));
	WebElement Year = driver.findElement(By.id("year"));
	
	// select a day from list
	// select a month from list in a same way // assignment implement for month and year
	// select a year from list in a same way
	
	Select select = new Select(Day);
	select.selectByIndex(4);
	
	System.out.println(select.isMultiple());
	
	 List<WebElement> listDays = select.getOptions();
	 System.out.println(listDays.size());
	 
	 int totalDays = listDays.size();
	 System.out.println("total days are : "+totalDays);
	 
	 // to print all the values
	 
	 for(int i=0;i<listDays.size();i++) {
		 
		 String dayValue = listDays.get(i).getText();
		 System.out.println(dayValue);
		 if(dayValue.equals("15")) {
			 
			 listDays.get(i).click();
			 break;
		 }
	 }
	driver.close();
	} 
}