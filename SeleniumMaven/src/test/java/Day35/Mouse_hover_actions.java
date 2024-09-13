package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover_actions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.get("https://www.flipkart.com/");
		WebElement fashion=driver.findElement(By.xpath("//span[text()='Fashion']"));
		Thread.sleep(3000);
		WebElement ethinic=driver.findElement(By.xpath("//a[@class='_1BJVlg _11MZbx']//span[@class='_3Pzn-c']"));
		Actions ac = new Actions(driver);
		//ac.moveToElement(fashion).moveToElement(ethinic).click().build().perform();
		ac.moveToElement(fashion).moveToElement(ethinic).click().perform();
		
		
	}

}
