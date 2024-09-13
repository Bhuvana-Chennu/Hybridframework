package Day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
		//new Select(driver.findElement(By.xpath("//select[@id='country']"))).selectByVisibleText("Germany");
		WebElement drpdwnct= driver.findElement(By.xpath("//select[@id='country']"));
		Select drpdwn = new Select(drpdwnct);
		drpdwn.selectByValue("uk");
		drpdwn.selectByIndex(7);
		
		
		
	}

}
