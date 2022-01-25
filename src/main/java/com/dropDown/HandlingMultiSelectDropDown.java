package com.dropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultiSelectDropDown {
	
public static WebDriver driver;
	
	@Test
	public static void dropDown() throws InterruptedException {
	//public static void main(String[] args) throws InterruptedException {
		
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.get( "file:///E:/Users/JyothiRegula/eclipse-workspace/Team/HTML/Dropdown.html");
		//Thread.sleep(2000);


		// select class is parameterised constructor --- WebElement
		//WebElement ddAddr = driver.findElement(By.id("Kritunga"));
		//Select sel = new Select(ddAddr);

		// by the options visibletext
		//sel.selectByVisibleText("Pulihora");
		// by the options value
		//sel.selectByValue("h");
		//sel.selectByIndex(7); // handle duplicate option
		//Thread.sleep(2000);
		//sel.selectByIndex(9);
		
		// this is for single select dropdown 
		//we can not perform deselect methods for singleselect dropdown
		//sel.selectByVisibleText("Poori");
		
		// deselection options applied only on Multi- Select DropDown
		//sel.deselectByVisibleText("Poori"); // java.lang.unsupportedOperationException
		
		driver.get("file://E:/Users/JyothiRegula/eclipse-workspace/Team/HTML/MultipleSelectDropDown.html");
		WebElement ddAddr = driver.findElement(By.id("Novotel")); 
		Select sel = new Select(ddAddr);
		ddAddr.click();
		
		// to know  is this single or multi select --- using isMultiple()
		if(sel.isMultiple()) {
			
			System.out.println("It is a Multi select dropdown");
		}
		else {
			System.out.println("It is a single select dropdown");
		}
		// There is no method to select all options
		// But we can use for loop to achieve  all
		for(int i=0;i<=4;i++) {
			 sel.selectByIndex(i);
		 }
		Thread.sleep(2000);
		 //sel.deselectByVisibleText("Dosa");
		 //sel.deselectByValue("b");
		 //sel.deselectByIndex(2);
		 sel.deselectAll();
		 driver.quit();

	}
}
