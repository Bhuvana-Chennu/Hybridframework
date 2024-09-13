package Day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriver {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		String act_title = driver.getTitle();
		if(act_title.equals("Your Store")) {
			System.out.println("Test pass");
		}
		else
		{
			System.out.println("Test fail");
		}
		driver.close();
		
			
		
		
		

	}

}
