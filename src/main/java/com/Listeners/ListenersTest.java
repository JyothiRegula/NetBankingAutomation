package com.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTest implements ITestListener {
	
	public void onFinish(ITestContext arg0) {					

	}		

	public void onStart(ITestContext arg0) {	
		
		
		BaseTest basetest = new BaseTest(null);
		basetest.launchBrowser();
		basetest.run();
		basetest.close();

	}		

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					

	}		

	public void onTestFailure(ITestResult arg0) {					


	}		

	public void onTestSkipped(ITestResult arg0) {					

	}		

	public void onTestStart(ITestResult arg0) {					

	}		

	public void onTestSuccess(ITestResult arg0) {					

	}		
			

}
