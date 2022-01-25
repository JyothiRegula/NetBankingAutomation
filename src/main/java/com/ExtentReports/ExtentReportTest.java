package com.ExtentReports;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import ScreenshotFailedTestCase.CustomListener;

 @Listeners(CustomListener.class)
public class ExtentReportTest extends TestBase {
	
	@BeforeMethod
	public void setUp() 
	{
		intialization();	
	}
	
	@Test
	public void passTest() throws Exception {
		ExtentTest test = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName(),"Sample description");
		test.log(Status.INFO,"This step shows usage of log(status,details)");
		test.info(" this step shows usage of info(details)");
		//test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		//test.addScreenCaptureFromPath("screenshot.png");
		
	}
	 @AfterMethod
	public void tearDown() throws Exception {
		driver.close();
		
	}
	
	

}
