package Day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//div[@class='SDkEP']"));
		ele.click();
		
		 
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='UUbT9 EyBRub']"));
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			
		}

	}

}
