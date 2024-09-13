package Parameterization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Demo {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		
	}
	
	@Test(dataProvider = "dp")
	void testlogin(String email,String pswd) throws InterruptedException 
	{
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pswd);
		driver.findElement(By.name("login")).click();
		boolean status = driver.findElement(By.xpath("//a[@aria-label='Facebook']")).isDisplayed();
		if(status==true) {
			
			
			Assert.assertTrue(true);
		
		
		}
		else {
			Assert.fail();
		}
		
	}
	
	
	@AfterClass
	void tearDown() 
	{
		driver.close();
		
	}
	@DataProvider(name="dp",indices= {0,1})
	Object[][] loginData() {
		
		Object[][] data = {
				
				{"prabha654123@gmail.com","anushka"},
				{"abcd@gmail.com","test102"},
				{"xuv@gmail.com","t12345"},
				{"abce@gmail.com","45678"},
				
				
						};
		return data;
		
		
	}
	


}