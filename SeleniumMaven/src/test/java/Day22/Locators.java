package Day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		//driver.findElement(By.partialLinkText("gin")).click();
		List<WebElement> header = driver.findElements(By.className("list-inline-item"));
		System.out.println(header.size());
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

	}

}
