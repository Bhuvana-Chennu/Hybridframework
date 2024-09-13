package day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitly_wait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement txt_username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		txt_username.sendKeys("Admin");
		WebElement txt_pswd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		txt_pswd.sendKeys("admin123");
		WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'login')]")));
		login.click();
		driver.close();

	}

}
