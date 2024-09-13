package Day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Scrooling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		WebElement ele =driver.findElement(By.xpath("//h2[text()='Pagination Table']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Scroll upto given pixel
		//js.executeScript("window.scrollBy(0,1400)", "");
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//Scroll upto particular web element
		//js.executeScript("arguments[0].scrollIntoView();", ele);
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//Scroll upto end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//Scroll up
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		

	}

}