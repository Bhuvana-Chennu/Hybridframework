package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Key_board_Actions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.get("https://text-compare.com/");
		driver.findElement(By.xpath("//textarea[@name='text1']")).sendKeys("Hello Bhuvana");
		Actions ac = new Actions(driver);
		ac.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform(); //ctrl+A
		ac.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform(); //ctrl+C
		ac.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		ac.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform(); //ctrl+V
		
		
		
	}

}
