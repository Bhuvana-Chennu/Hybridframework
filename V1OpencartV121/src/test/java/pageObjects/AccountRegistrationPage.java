package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtfirstname;
	

	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtlastname;
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtemail;

	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txtnumber;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtpassword;
	
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txtcnfmpassword;
	
	@FindBy(xpath = "//label[text()='Yes']")
	WebElement clicknewsltter;
	
	@FindBy(xpath = "//input[@name='agree']")
	WebElement clickcheckbox;
	
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement cliccontinue;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	
	
	public void setFirstname(String fname) {
		txtfirstname.sendKeys(fname);
	}
	
	public void setLastname(String lname) {
		txtlastname.sendKeys(lname);
	}
	
	public void setEmail(String email) {
		txtemail.sendKeys(email);
	}
	
	public void setNumber(String num) {
		txtnumber.sendKeys(num);
	}
	
	public void setPassword(String pswd) {
		txtpassword.sendKeys(pswd);
	}
	
	public void setConfirmPswd(String pswd) {
		txtcnfmpassword.sendKeys(pswd);
	}
	
	public void clickRadiobutton() {
		clicknewsltter.click();
	}
	
	public void clickCheckkbox() {
		clickcheckbox.click();
	}
	
	public void clickContinue() {
		 cliccontinue.click();
		//cliccontinue.submit();
		
		//sol2
	//	Actions ac = new Actions(driver);
		//ac.moveToElement(cliccontinue).click().perform();
	}
	
	public String getConfirmationmsg()
	{
		try
		{
		return msgConfirmation.getText();
		}
		
		catch(Exception e)
		{
			return e.getMessage();
		}
		
	}
}
