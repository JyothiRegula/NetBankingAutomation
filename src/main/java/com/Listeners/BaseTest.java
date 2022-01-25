package com.Listeners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	public BaseTest(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void launchBrowser() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait( 20,TimeUnit.SECONDS);
		
	}
	public void run() 
	{
		driver.get("https://www.instagram.com/");
		
	}
	public void close()
	{
		driver.close();
		
	}

}
