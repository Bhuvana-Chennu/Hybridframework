package Day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Remove_Automatedmessage {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.nopcommerce.com/");
		String act_title = driver.getTitle();
		if(act_title.equals("nopCommerce demo store")) {
			System.out.println("Test pass");
		}
		else {
			System.out.println("Test fail");
		}
	}

}
