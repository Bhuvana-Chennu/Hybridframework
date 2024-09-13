package Day39;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='SIvCob']//a"));
		System.out.println(list.size());
		TakesScreenshot ts = (TakesScreenshot) driver;
		for(int i=0;i<list.size();i++) {
			
			String name = list.get(i).getText();
			System.out.println(name);
			list.get(i).click();
			File source = ts.getScreenshotAs(OutputType.FILE);
			File target = new File("C:\\Users\\Dell\\Pictures\\Screenshots\\"+name+".png");
			source.renameTo(target);
			list = driver.findElements(By.xpath("//div[@id='SIvCob']//a"));
		}
			
			

	}

}
