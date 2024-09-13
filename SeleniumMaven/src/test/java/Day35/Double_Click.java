package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.switchTo().frame("iframeResult");
		WebElement box1=driver.findElement(By.id("field1"));
		WebElement box2=driver.findElement(By.id("field2"));
		WebElement button=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		box1.clear();
		box1.sendKeys("Bhuvana");
		String text=box1.getAttribute("value");
		System.out.println(text);
		Actions ac = new Actions(driver);
		ac.doubleClick(button).perform();
		if(text.equals("Bhuvana")) {
			System.out.println("Text copied...");
		}
		else {
			System.out.println("Text notcopied correctly....");	
		}
		
	}

}
