package com.ExtentReports;

import org.testng.ITestContext;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest extends TestBase implements ITestListener{
	
	 public void onFinish(ITestContext arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    public void onStart(ITestContext arg0) {					
	        // TODO Auto-generated method stub				
	        		 
	    }		

	    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    public void onTestFailure(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    public void onTestSkipped(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    public void onTestStart(ITestResult arg0) {					
	    	
	    	try {
				testBaseReport();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	    }		

	    public void onTestSuccess(ITestResult arg0) {
	    	extent.flush();
	         driver.close();
	    }		

}
