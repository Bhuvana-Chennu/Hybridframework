package Testng_Listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent_Repot implements ITestListener 
{
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	
	
	public void onTestStart(ITestResult result) 
	{
		 sparkReporter = new ExtentSparkReporter(System.getProperty("User.dir")+"\\reports\\myReport.html");
		 sparkReporter.config().setDocumentTitle("Automation Report");
		 sparkReporter.config().setReportName("functional Testing");
		 sparkReporter.config().setTheme(Theme.DARK);
		 
		 extent = new ExtentReports();
		 extent.attachReporter(sparkReporter);
		 extent.setSystemInfo("computername","localhost" );
		 extent.setSystemInfo("Envionment", "QA");
		 extent.setSystemInfo("", null);
		
		 
		  }
		
		public void onTestSuccess(ITestResult result) {
		   
		  }
		
		
		public void onTestFailure(ITestResult result) {
		    
		  }
		
		public void onTestSkipped(ITestResult result) {
		   
		  }
		
		public void onFinish(ITestContext context) {
		   
		  }
}
