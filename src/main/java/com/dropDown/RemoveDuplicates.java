package com.dropDown;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RemoveDuplicates {
	
	public static WebDriver driver;
	
	@Test
	public static void dropDown() throws InterruptedException {
	 
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get( "file://E:/Users/JyothiRegula/eclipse-workspace/Team/HTML/MultipleSelectDropDown.html");
		Thread.sleep(2000);

		WebElement ddAddr = driver.findElement(By.id("Novotel")); 
		Select sel = new Select(ddAddr);
		
		// As it is ,with duplicates with order ------>LIST(I)
		/*	 List<WebElement> allOptions = sel.getOptions();
		 System.out.println("Welcome to list dropdown with duplicates: ");
		 for(int i=0;i<allOptions.size();i++)
		 {
			  WebElement oneOption = allOptions.get(i);
			  String text = oneOption.getText();
			  System.out.println(text);
		 } */
		 
		 // Remove duplicates i dont care about order---->Hashset(C)
		 
		// upcasting HashSet to Set(I)
		/*Set<String> allStr = new LinkedHashSet<String>();
		List<WebElement> allOptions = sel.getOptions();
		System.out.println("Welcome to Hashset dropdown without duplicates and order is maintained ");
		for(int i=0;i<allOptions.size();i++)
		{
			WebElement oneOption = allOptions.get(i);
			String text = oneOption.getText();
			allStr.add(text);
		}
		for(String str :allStr) 
		{
			System.out.println(str);
		} */

		
		// Remove duplicates i want care about sorted order---->Treeset(C)
		 
				// upcasting TreeSet to Set(I)
				/*Set<String> allStr = new TreeSet<String>();
				
				// getOptions is a method present in select class which is used to select all options
				List<WebElement> allOptions = sel.getOptions();
				System.out.println("Welcome to Treeset without duplicates and sorted order is maintained ");
				for(int i=0;i<allOptions.size();i++)
				{
					WebElement oneOption = allOptions.get(i);
					String text = oneOption.getText();
					allStr.add(text);
				}
				for(String str :allStr) 
				{
					System.out.println(str);
				} */
		
		for(int i=0;i<=7;i++)
		{
			sel.selectByIndex(i);
		}
		 List<WebElement> allselOps = sel.getAllSelectedOptions();
		System.out.println(allselOps.size());
		
		WebElement firstSelOp = sel.getFirstSelectedOption();
	    System.out.println(firstSelOp.getText());
		
	    // Every addr combinds into single addr
		 WebElement wrapElement = sel.getWrappedElement();
		 System.out.println(wrapElement.getText());
		 
		 
		 
		 
		
	}
}