package Day35;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Open_link_in_newtab {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.get("https://demo.nopcommerce.com/");
		WebElement register =driver.findElement(By.xpath("//a[text()='Register']"));
		Actions ac = new Actions(driver);
		//ac.keyDown(Keys.CONTROL).moveToElement(register).click().keyUp(Keys.CONTROL).perform();
		ac.keyDown(Keys.CONTROL).click(register).keyUp(Keys.CONTROL).perform();
		List<String> ids = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(ids.get(1)); //Switch to registration page
		driver.findElement(By.id("FirstName")).sendKeys("Bhuvana");
		driver.switchTo().window(ids.get(0)); //Switch to parent page
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("T-shirts");
		
		
		
	}

}
