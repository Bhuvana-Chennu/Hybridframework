package Testng_Listners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Listenres_demo {
	WebDriver driver;
	@BeforeClass
	void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
	}
	@Test(priority = 1)
	void testlogo() {
		boolean logo = driver.findElement(By.xpath("//a[@class='navbar-brand nav-logo']")).isDisplayed();
		Assert.assertEquals(logo, true);
	}
	
	@Test(priority = 3,dependsOnMethods = {"testurl"})
	void testhomepageTitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@Test(priority = 2)
	void testurl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@AfterClass
	void teardown() {
		driver.quit();
		
	}
	
	}


