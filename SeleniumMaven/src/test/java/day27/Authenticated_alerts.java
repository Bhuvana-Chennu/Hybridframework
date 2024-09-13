package day27;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticated_alerts {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("http://the-internet.herokuapp.com/basic_auth");
	driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");










}
}










