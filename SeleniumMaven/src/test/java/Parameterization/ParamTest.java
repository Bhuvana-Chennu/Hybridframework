package Parameterization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String br,String url) {
		switch(br.toLowerCase()) 
		{
		case "chrome": driver = new ChromeDriver(); break;
		case "edge": driver = new EdgeDriver(); break;
		case "firefox":driver = new FirefoxDriver(); break;
		default:System.out.println("Invalid browser"); return; //Return will exit from the entire code
		}
		
		
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	void testlogo() {
		boolean logo = driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']")).isDisplayed();
		Assert.assertEquals(logo, true);
	}
	
	@Test(priority = 2)
	void testTitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@Test(priority = 3)
	void testurl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@AfterClass
	void teardown() {
		driver.close();
		
	}

}
