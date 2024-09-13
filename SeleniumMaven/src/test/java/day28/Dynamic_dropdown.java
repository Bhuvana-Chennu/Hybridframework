package day28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_dropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//a[text()=' Coimbatore (CJB)']-----xpath for departure
		//a[text()=' Kolkata (CCU)']------xpath for arrival
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		/*driver.findElement(By.xpath("//a[text()=' Coimbatore (CJB)']")).click();
		driver.findElement(By.xpath("(//a[text()=' Kolkata (CCU)'])[2]")).click();*/
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[text()=' Coimbatore (CJB)']")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[text()=' Kolkata (CCU)']")).click();
		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[text()='16']")).click();

	}

}
