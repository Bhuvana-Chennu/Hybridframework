package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="input-email")
	WebElement emailtext;
	
	@FindBy(id="input-password")
	WebElement passwordtext;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	WebElement loginlink;
	
	
	public void setEmail(String email) {
		emailtext.sendKeys(email);
	}
	
	public void setpaswword(String pswd) {
		passwordtext.sendKeys(pswd);
	}
	
	public void clicklogin() {
		loginlink.click();
	}
}
