package Resources;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("The test case is started :"+result.getName());
	}
    public void onTestSuccess(ITestResult result) {
    	// TODO Auto-generated method stub
    	System.out.println("The test case is passed :"+result.getName());
    }
    public void onTestFailure(ITestResult result) {
    	// TODO Auto-generated method stub
    	
    	System.out.println("The test case is failed :"+result.getName());
     }

}
