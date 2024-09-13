package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Orange_hrm {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.get("https://www.orangehrm.com/");
		WebElement main=driver.findElement(By.xpath("//a[text()='Why OrangeHRM']"));
		WebElement sub =driver.findElement(By.xpath("//a[text()='Flexible Hosting']"));
		Actions ac= new Actions(driver);
		//ac.moveToElement(main).moveToElement(sub).click().build().perform();
		ac.moveToElement(main).moveToElement(sub).click().perform();

	}

}
