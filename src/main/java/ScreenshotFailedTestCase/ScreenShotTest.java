package ScreenshotFailedTestCase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

 @Listeners(CustomListener.class)
public class ScreenShotTest extends BaseTest {
	
	@BeforeMethod
	public void setUp() 
	{
		intialization();	
	}
	
	@AfterMethod
	public void tearDown() throws Throwable
	{
		
		Thread.sleep(2000);
		driver.quit();
	}
	@Test
	public void takeScreenshotTest() 
	{
		Assert.assertEquals(true,true);
	}
	
	
	

}
