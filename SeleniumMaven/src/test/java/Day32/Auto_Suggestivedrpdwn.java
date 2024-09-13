package Day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestivedrpdwn {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("bhuv");
		//List<WebElement> list = driver.findElements(By.xpath("//ul[@class='G43f7e']//li//div[@role='option']"));
		List<WebElement> list =driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().equals("Bhuvanagiri")) {
				list.get(i).click();
			}
		
		
		}
		
		
		
		
		
		
	}

}
