package com.Filehandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownloadChrome {
	
	public WebDriver driver;
	@Test
	public void fd1() throws Exception {

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("http://demo.automationtesting.in/FileDownload.html");
	
	// Download text file

	driver.findElement(By.id("textbox")).sendKeys("Automation test scripts");
	Thread.sleep(2000);
	driver.findElement(By.id("createTxt")).click();
	driver.findElement(By.id("link-to-download")).click();
	 
	
	// Download pdf file
	driver.findElement(By.id("pdfbox")).sendKeys("Hello welcome to Automation pdf");
	Thread.sleep(2000);
	driver.findElement(By.id("createPdf")).click();
	driver.findElement(By.id("pdf-link-to-download")).click();
	Thread.sleep(2000);
	}
}
