package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login_Page2 {
	
	WebDriver driver;
	Login_Page2(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	//Locators
	/*By username_loc=By.xpath("//input[@placeholder='Username']");
	By psswd_loc = By.xpath("//input[@placeholder='Password']");
	By login_loc = By.xpath("//button[text()=' Login ']");	*/
	
	
	//@FindBy(xpath="//input[@placeholder='Username']")
	@FindBy(how=How.XPATH,using = "//input[@placeholder='Username']")
	WebElement username_loc;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement psswd_loc;
	
	@FindBy(xpath = "//button[text()=' Login ']")
	WebElement login_loc;
	
	//Action methods
	
	public void Setusername(String user) 
	{
		username_loc.sendKeys(user);
	}
	
	public void SetPassword(String pswd)
	{
		psswd_loc.sendKeys(pswd);

	}
	
	public void ClickLogin()
	{
		login_loc.click();
	}
	
}
