package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TC0001_AccountRegstrationTest extends BaseClass {
	
	
	@Test
	public void verify_account_registration()
	{
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		regpage.setFirstname(randomString().toUpperCase());
		regpage.setLastname(randomString().toUpperCase());
		regpage.setEmail(randomString()+"@gmail.com");
		regpage.setNumber(randonNumber());
		
		String password = randomAlphanumeric();
		regpage.setPassword(password);
		regpage.setConfirmPswd(password);
		regpage.clickRadiobutton();
		regpage.clickCheckkbox();
		regpage.clickContinue();
		String msg = regpage.getConfirmationmsg();
		Assert.assertEquals(msg, "Your Account Has Been Created!");
	}
	
	

}
