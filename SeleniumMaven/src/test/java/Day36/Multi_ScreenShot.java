package Day36;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multi_ScreenShot {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=0;i<=30;i++) {
			System.out.println(links.get(i).getText());
		}
		

	}

}
