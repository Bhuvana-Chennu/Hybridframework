package Testng_Listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListners implements ITestListener{

	
	public void onStart(ITestContext context) {
	   System.out.println("Test execution started........");
	  }
	
	
	public void onTestStart(ITestResult result) {
	   System.out.println("Test started......");
	  }
	
	public void onTestSuccess(ITestResult result) {
	    System.out.println("Test passed.....");
	  }
	
	
	public void onTestFailure(ITestResult result) {
	    System.out.println("Test failed........");
	  }
	
	public void onTestSkipped(ITestResult result) {
	    System.out.println("Test skiped");
	  }
	
	public void onFinish(ITestContext context) {
	    System.out.println("Test execution is completed");
	  }
	
	
	
	
}
