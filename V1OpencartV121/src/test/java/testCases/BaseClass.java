package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		
	}
	
	
	@AfterClass
	public void teardown()
	{
		
	driver.quit();
	}

	public String randomString()
	{
		String generatedstring = RandomStringUtils.randomAlphabetic(5);
		return generatedstring;
	}
	
	public String randonNumber()
	{
		String num =RandomStringUtils.randomNumeric(10);
		return num;
	}
	
	public String randomAlphanumeric()
	{
		String generatedstring = RandomStringUtils.randomAlphabetic(3);
		String generatednumber = RandomStringUtils.randomNumeric(3);
		return(generatedstring+"@"+generatednumber);
	}

}
