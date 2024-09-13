package Day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Pickers {
	
	
	static void SelectFutureDate(WebDriver driver,String month,String year,String date) {
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		while(true) {
			String curr_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String curr_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(curr_month.equals(month)&& curr_year.equals(year)) {
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td//a"));
		for(WebElement dt:dates) {
			if(dt.getText().equals(date)) {
				dt.click();
				break;
	}
		}
		
	}
	static void SelectPreviousDate(WebDriver driver,String month,String year,String date) {
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		while(true) {
			String curr_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String curr_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(curr_month.equals(month)&& curr_year.equals(year)) {
				break;
			}
		
			driver.findElement(By.xpath("//a[@data-handler='prev']")).click();
		}
			List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td//a"));
			for(WebElement dt:dates) {
				if(dt.getText().equals(date)) {
					dt.click();
					break;
		}
			}
			
		
	}
	

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/datepicker/");
		//switch to frame()
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		//Method 1 using send keys
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("22/05/2024");
		
		//Method2 using date picker
		String year ="2021";
		String month="May";
		String date ="10";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
			//SelectFutureDate(driver, month, year, date);
			SelectPreviousDate(driver, month, year, date);
		
		

	}
	
}

