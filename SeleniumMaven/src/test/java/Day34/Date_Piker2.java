package Day34;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Date_Piker2 {
	//user defined method for converting month from string to MONTH
	static Month ConvertMonth(String month) {
		HashMap<String,Month> monthmap= new HashMap<String,Month>();
		
		monthmap.put("Januaru", Month.JANUARY);
		monthmap.put("February", Month.FEBRUARY);
		monthmap.put("March", Month.MARCH);
		monthmap.put("April", Month.APRIL);
		monthmap.put("May", Month.MAY);
		monthmap.put("June", Month.JUNE);
		monthmap.put("July", Month.JULY);
		monthmap.put("August", Month.AUGUST);
		monthmap.put("September", Month.SEPTEMBER);
		monthmap.put("October", Month.OCTOBER);
		monthmap.put("November", Month.NOVEMBER);
		monthmap.put("December", Month.DECEMBER);
		
		Month vmonth = monthmap.get(month);
		if(vmonth==null) {
			System.out.println("Invalid month");
			
		}
		return vmonth;
		
		
	}
	static void Select_date(WebDriver driver,String reqYear,String reqMonth, String reqdate) {
		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select birthyear = new Select(year);
		birthyear.selectByVisibleText("2021");
		//Select month
		while(true) {
		String display_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		Month expected_month =ConvertMonth(reqMonth);
		Month curr_month = ConvertMonth(display_month);
		
		int result= expected_month.compareTo(curr_month); //compare to method returns the difference in integer format
		if(result<0) {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//past month
		}
		
		else if(result>0){
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//future month
			
		}
		
		else 
		{
			break;
			
		}
		
	   	List<WebElement> all_dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));
	   	
	   	for(WebElement dt: all_dates) {
	   		if(dt.getText().equals(reqdate)) {
	   			dt.click();
	   			break;
	   		}
	   	}
		
		
		

	}
		
	}

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		String reqYear="2021";
		String reqMonth="January";
		String reqdate="17";
		//	driver.switchTo().alert().accept();
		driver.switchTo().frame("frame-one796456169");
		Select_date(driver, reqYear, reqMonth, reqdate);
		
	}

}
