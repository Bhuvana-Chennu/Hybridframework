package Day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor_Demo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		WebElement input = driver.findElement(By.id("name"));
		WebElement phone = driver.findElement(By.xpath("//input[@id='phone']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','Jhon')", input);
		
		js.executeScript("arguments[0].setAttribute('value','8897812849')", phone);
		
		WebElement radiobutton = driver.findElement(By.xpath("//input[@id='female']"));
		js.executeScript("arguments[0].click()", radiobutton);
	}

}
