package com.Filehandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFile {
	public WebDriver driver;
	@Test
	public void fd() throws Exception {
		// additional setting for firefox browser
		
		// profile class
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference( "browser.helperApps.neverAsk.saveToDisk", "text/plain,application/pdf");// Mime type
		profile.setPreference( "browser.download.manager.showwhenstarting", false);
		profile.setPreference("pdfjs.disabled", true);
		
		//option class
		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(profile);
		
		
		
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver(option);
		driver.manage().window().maximize();
		
		
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		
		// Download text file
		
		driver.findElement(By.id("textbox")).sendKeys("Automation test scripts");
		Thread.sleep(2000);
		driver.findElement(By.id("createTxt")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("link-to-download")).click();
		 
		
		// Download pdf file
		driver.findElement(By.id("pdfbox")).sendKeys("Hello welcome to Automation pdf");
		Thread.sleep(2000);
		driver.findElement(By.id("createPdf")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pdf-link-to-download")).click();
		Thread.sleep(2000);
		 
		
		driver.close();
	}

}
