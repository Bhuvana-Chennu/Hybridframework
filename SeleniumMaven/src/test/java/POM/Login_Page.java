package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {
	
	WebDriver driver;
	Login_Page(WebDriver driver){
		this.driver=driver;
		
	}
	//Locators
	By username_loc=By.xpath("//input[@placeholder='Username']");
	By psswd_loc = By.xpath("//input[@placeholder='Password']");
	By login_loc = By.xpath("//button[text()=' Login ']");	
	
	//Action methods
	
	public void Setusername(String user) 
	{
		driver.findElement(username_loc).sendKeys(user);
	}
	
	public void SetPassword(String pswd)
	{
		driver.findElement(psswd_loc).sendKeys(pswd);

	}
	
	public void ClickLogin()
	{
		driver.findElement(login_loc).click();
	}
	
}
