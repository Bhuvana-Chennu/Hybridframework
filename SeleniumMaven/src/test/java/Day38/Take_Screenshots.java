package Day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Take_Screenshots {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.nopcommerce.com/");
		//full page screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcefile =ts.getScreenshotAs(OutputType.FILE);
		//File targetfile = new File(System.getProperty("user.dir")+"\\ScreenShot\\fullpage.png");
		File targetfile = new File("C:\\Users\\Dell\\Pictures\\fullpage.png");
		sourcefile.renameTo(targetfile);
		WebElement grid = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		
		File source = grid.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"\\ScreenShot\\grid1.png");
		source.renameTo(target);
	}
	
}
