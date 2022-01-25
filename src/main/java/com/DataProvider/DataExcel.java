package com.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataExcel {
	

	public WebDriver driver;
	
	// dataprovider parameter name to identify it uniquely
	
	@Test(dataProvider="loginData")
	public void TestLogin(String username ,String password) throws Exception {

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.findElement(By.id("txtUsername")).sendKeys("username");
	driver.findElement(By.id("txtPassword")).sendKeys("password");
	driver.findElement(By.name("Submit")).click();
	
	Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed()); 
	
	Thread.sleep(2000);
	driver.quit();
	}
	
	// The data provider name defaults to method name. if u dont provide dp in dpc  name it will take method name---- orelse testng exp will arise
	//The annotated method must return an Object[][] where each Object[] can be assigned the parameter list of the test method.
	//The @Test method that wants to receive data from this DataProvider needs to use a dataProvider name equals to the name of this annotation.
	// DataProvider always returns 2D array
	
	// data container
	@DataProvider(name ="loginData")

	public Object[][] loginData() {
		
		// data
		Object[][] data = new Object[2][2];
		
		// valid data
		data[0][0]= "Admin";
		data[0][1]= "admin123";
		
		// invalid data
		data[0][0]= "Admin";
		data[0][0]= "test123";
		
		return data;

	}

		/*@DataProvider()
	
		public void loginData1() {
	
		}
	
	
		@DataProvider()
	
		public void loginData2(){
	
		}*/
	
	
	
	
	
}

