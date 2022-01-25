package ScreenshotFailedTestCase;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends BaseTest implements ITestListener {
	
	
	public void onFinish(ITestContext arg0) {					
        			
        		
    }		

    public void onStart(ITestContext arg0) {					
         				
        		
    }		

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        
    }		

    public void onTestFailure(ITestResult arg0) {					
        	System.out.println("Failed test");
        	screenShot();
        		
    }		

    public void onTestSkipped(ITestResult arg0) {					
         				
        		
    }		

    public void onTestStart(ITestResult arg0) {					
         			
        		
    }		

    public void onTestSuccess(ITestResult arg0) {					
    	System.out.println("test successfully done");
    	screenShot();	
        		
    }		

}
