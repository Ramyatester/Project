package testNGTestcase;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TrackTestExecution implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		
		System.out.println("onTestStart>>");
		
	}


	public void onTestSuccess(ITestResult result) {
		
		System.out.println("onTestSuccess>> PASSED");
		
	}
public void onTestFailure(ITestResult result) {
		
		System.out.println("Failed for "+result.toString());
		
	}
}
