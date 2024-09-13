package day27;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//Normal alert with popup
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		if(myalert.getText().equals("I am a JS Alert")) {
		System.out.println("Test pass");
		}
		myalert.accept();
		
		/*//Confirmation alert ok and cancel button
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert myalert = driver.switchTo().alert();
		Thread.sleep(10);
		//myalert.accept(); close alert using ok button
		//myalert.dismiss(); close alert using cancel button
		if(myalert.getText().equals("I am a JS Confirm"))
		{
			System.out.println("Test pass");
		}
		myalert.dismiss();*/
		
	}

}
