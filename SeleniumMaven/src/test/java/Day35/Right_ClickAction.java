package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_ClickAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement button=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions ac= new Actions(driver);
		ac.contextClick(button).build().perform();
		
		//Click on copy
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		//close alert box
		driver.switchTo().alert().accept();
		
	}

}
