package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap_dropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//span[contains(@class,'multiselect-selec')]")).click();
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println(options.size());
		/*
		 * for(WebElement op:options) { System.out.println(op.getText()); }
		 */
		
		for(WebElement op:options) {
			String option = op.getText();
			if(option.equals("Python")||option.equals("jQuery")||option.equals("MySQL"))
			{
				op.click();
			}
			
			
			
		}
		
		
	}

}
