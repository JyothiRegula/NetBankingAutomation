package ScreenshotFailedTestCase;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
	
	public static void intialization() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait( 20,TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
	}
	
	public void screenShot() 
	{
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File (System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshots\\insta5.jpg");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			 
			e.printStackTrace();
		}
	}
	
}
