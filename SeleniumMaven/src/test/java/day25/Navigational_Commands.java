package day25;

import java.net.MalformedURLException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigational_Commands {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://demo.opencart.com/");
		//driver.navigate().to("https://demo.opencart.com/");
		//URL myurl = new URL("https://demo.opencart.com/");
		//driver.navigate().to(myurl);
		driver.navigate().to("https://demo.opencart.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
	}

}
