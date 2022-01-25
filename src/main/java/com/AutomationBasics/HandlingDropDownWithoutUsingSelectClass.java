package com.AutomationBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDownWithoutUsingSelectClass {

	public static WebDriver driver;
	
	@Test
	public static void dropDown() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get( "http://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);

		/* using select class in real time application
		 * 
		 * WebElement skillsDropDown = driver.findElement(By.id("Skills"));
		Select skills = new Select(skillsDropDown);
		
		//1.selectByVisibleText() method
		skills.selectByVisibleText("Java");
		
		Thread.sleep(2000);

		//2. selectByValue() method
		skills.selectByValue("Android");

		Thread.sleep(2000);


		// 3. selectByIndex() method
		skills.selectByIndex(3);
		
		Thread.sleep(2000); */
		
		
		/* without using select class with hardcode
		 * 
		 * 
		 */
		
		// skills dropdown
		/*WebElement skillsDropDown = driver.findElement(By.id("Skills"));
		skillsDropDown.click();
		
		List<WebElement> skills = driver.findElements(By.cssSelector("#Skills>option"));

		for(WebElement skill : skills) 
		{
			if(skill.getText().equals("XHTML"))
			{
				 skill.click();
				 break;
			}
		}*/
		
		// Country dropdown
		
		/*WebElement countriesDropDown = driver.findElement(By.id("countries"));
		countriesDropDown.click();
		
		List<WebElement> countries = driver.findElements(By.cssSelector("#countries>option"));

		for(WebElement country : countries) 
		{
			if(country.getText().equals("Austrelia"))
			{
				 country.click();
				 break;
			}
		}*/

		/*// year dropdown
		WebElement yearDropDown = driver.findElement(By.id("yearbox"));
		yearDropDown.click();
		
		// findelements
		List<WebElement> years = driver.findElements(By.cssSelector("#yearbox>option"));

		for(WebElement year : years) 
		{
			if(year.getText().equals("2015"))
			{
				 year.click();
				 break;
			}
		}*/
		
		// helper method reusable method
		// softcode

		String yearDropDown= "//*[@id='yearbox']";
		String yearDropDownValues= "//*[@id='yearbox']/option";
		String year = "1920";
		
		
		selectDropDownValue(yearDropDown,yearDropDownValues,year);
			
		//selectDropDownValue( "//*[@id='yearbox']","//*[@id='yearbox']/option","2015");
			
	}
	
	// utility method--- generalisation
	@Test
	public static void selectDropDownValue(String dropdown, String dropdownValues,String value) {
		
		WebElement dropDownWebElement = driver.findElement(By.xpath(dropdown));
		dropDownWebElement.click();
		
		List<WebElement> WebElementsValues = driver.findElements(By.xpath(dropdownValues));

		for(WebElement WebElementValue : WebElementsValues) 
		{
			if(WebElementValue.getText().equals(value))
			{
				 WebElementValue.click();
				 break;
			}
		}
		

	}
	

}
