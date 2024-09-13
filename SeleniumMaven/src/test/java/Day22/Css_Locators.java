package Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class Css_Locators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("apple");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector("input.search-text")).sendKeys("apple");
		//driver.findElement(By.cssSelector(".search-text")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("apple");
		//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("apple");
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("apple");
		
		
		

	}

}
