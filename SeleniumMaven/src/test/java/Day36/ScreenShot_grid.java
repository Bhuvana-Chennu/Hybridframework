package Day36;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot_grid {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		Set<String> id = driver.getWindowHandles();
		List<String> ids= new ArrayList(id);
		
				
		
		//New tab
		WebElement grid =driver.findElement(By.xpath("//div[@class='_8esl']"));
		File src = grid.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Dell\\Pictures\\Screenshots\\sagar.png");
		Files.copy(src, dest);
		System.out.println("ScreenShot captured sucessfully");
		
		//Switch to main tab
		
		WebElement grid1 =driver.findElement(By.xpath("//div[@class='_8esl']"));
		File src1 = grid.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("C:\\Users\\Dell\\Pictures\\Screenshots\\sagar.jpg");
		Files.copy(src1, dest1);
		System.out.println("ScreenShot captured sucessfully");
		
	}

}
 