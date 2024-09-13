package day27;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Promtalert {

	public static void main(String[] args) {
		

		

			
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("https://the-internet.herokuapp.com/javascript_alerts");
				driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
				Alert myalert =driver.switchTo().alert();
				myalert.sendKeys("I am human");
				myalert.accept();
				

	
		


	}

}
