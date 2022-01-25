package com.ExtentReports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static  WebDriver driver;
	public  static ExtentReports extent;
	public  static ExtentHtmlReporter htmlreporter;
	
	
	public static void intialization() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait( 20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	public void testBaseReport() throws Exception 
	{
		System.out.println("extent report method from test base class");
		// start reporters
		htmlreporter = new ExtentHtmlReporter("extentReport.html");
		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);	
	}
	

}
