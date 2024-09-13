package Day41;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intrest_Caluclator {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.calculator.io/simple-interest-calculator/#differences-between-simple-interest-and-compound-interest-4");
		String filepath =System.getProperty("user.dir")+"\\Test_Data\\datadriventest.xlsx"; 
		int rowcount =Excel_Utility.getrowcount(filepath,"Sheet2");
		System.out.println(rowcount);
		
		
	
	}

}
