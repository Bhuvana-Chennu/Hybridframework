package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@type='text'][@placeholder='Search']")).sendKeys("grocery");
		//driver.findElement(By.xpath("//input[@type='text' and @placeholder='Search']")).sendKeys("grocery");
		//driver.findElement(By.xpath("//input[@type='text' or @placeholder='Search']")).sendKeys("grocery");
		//driver.findElement(By.xpath("//*[text()='Phones & PDAs']")).click();
		//System.out.println(driver.findElement(By.xpath("//h3[text()='Featured']")).getText());
		//driver.findElement(By.xpath("//input[starts-with(@name,'sea')]")).sendKeys("bhuv");
		System.out.println(driver.findElement(By.xpath("//div[@id='logo']/a/img ")).isDisplayed());

	}

}
