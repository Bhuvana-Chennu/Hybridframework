package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_dropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(@class,'oxd-button')]")).click();
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[3]")).click();
		//driver.findElement(By.xpath("//span[normalize-space()='Chief Financial Officer']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println(list.size());
		for(WebElement op:list) {
			System.out.println(op.getText());
		}
		
		
		
		

	}

}
