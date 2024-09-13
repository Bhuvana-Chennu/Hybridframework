package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Second_class {
	WebDriver driver;
  @Test(priority=1)
  void openapp() {
	  driver=new ChromeDriver();  
	  driver.get("https://www.facebook.com/login/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(46));
	  
  }
  @Test(priority=2)
  void testlogo() {
	 boolean status =  driver.findElement(By.xpath("//img[@class='_97vu img']")).isDisplayed();
	 System.out.println("Logo is displayed or not: "+status);
	  
  }
  @Test(priority=3)
  void login() {
	  driver.findElement(By.id("email")).sendKeys("prabha654123@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("anushka");
	  driver.findElement(By.id("loginbutton")).click();
	  
  }
  
  @Test(priority=4)
  void closeapp() {
	  driver.close();
	  
  }
}
