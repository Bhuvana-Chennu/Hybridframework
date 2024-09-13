package day27;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Boxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		// driver.findElement(By.xpath("//input[@id='sunday']")).click();
		// Select all check boxes
		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//input[@class='form-check-input'and @type='checkbox']"));

		/*
		 * for(WebElement c:checkboxes) { c.click();
		 * 
		 * }
		 */
		/*
		 * for(int i=4;i<checkboxes.size();i++) { checkboxes.get(i).click(); } for(int
		 * i=0;i<3;i++) { checkboxes.get(i).click(); }
		 */
		// Unselect check boxes if they are selected
		
		  for(int i= 0;i<checkboxes.size();i++) {
			  checkboxes.get(i).click(); 
			  }
		  
		  
				/*
				 * Thread.sleep(10); for(int i=0;i<checkboxes.size();i++) {
				 * if(checkboxes.get(i).isSelected()) { checkboxes.get(i).click(); } }
				 */

	}

}
