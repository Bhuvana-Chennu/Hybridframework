package AirIndia;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.get("https://www.airindia.com/");
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		WebElement ele = driver .findElement(By.xpath("//input[@id='From']"));
		ele.clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='From']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//ngb-typeahead-window[@role='listbox']"));
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.size());
			System.out.println(list.get(i).getText());
			list.get(i).click();
		list.clear();
			driver.findElement(By.id("To")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@id='ngb-typeahead-1-1']")).click();
			
			
		}

	}

}
