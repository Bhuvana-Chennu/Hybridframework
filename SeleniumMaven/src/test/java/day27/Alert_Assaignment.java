package day27;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Assaignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> cb= driver.findElements(By.xpath("//table[@id='productTable']/descendant::input"));
		for(int i=0;i<cb.size();i++) {
			cb.get(i).click();
		}
		
		
				
				
				
				
				
	

		
	}

}
