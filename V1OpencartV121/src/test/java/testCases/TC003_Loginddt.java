package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBase.BaseClass;
import Utility.Data_Providers;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class TC003_Loginddt extends BaseClass{
	@Test(dataProvider="LoginData", dataProviderClass = Data_Providers.class,groups="Datadriven") //getting data provider from different class
	public void verify_LoginDDT(String email,String pwd, String exp)
	{
		logger.info("******Statcting TC003_LoginDDT********");
		try
		{
		//Home Page
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
				
		//LoginPage
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(email);
		lp.setpaswword(pwd);
		lp.clicklogin();
				
		//AccountPage
		MyAccountPage macc = new MyAccountPage(driver);
		boolean targetpage = macc.isMyAccountPageExists();
		
		/* Data valid ----login success - test pass - logout //Assert.asserttrue(true)
		 * 				  login fail - test fail //Assert.asserttrue(false);
		 * 
		 * Data invalid-----login success - test fail - logout //Assert.asserttrue(false)
		 * 
		 * 					login fail - test pass  //Assert.asserttrue(true)
		 */
		
		
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(targetpage==true)
			{
				Assert.assertTrue(true);
				macc.clickLogout(); 
			}
			
			else 
			{
			
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equalsIgnoreCase("Invalid"))
		{
			Assert.assertTrue(false);
			macc.clickLogout();
		}
		
		else
		{
			Assert.assertTrue(true);	
		}
		}
		catch(Exception e) {
			Assert.fail();
		}
		logger.info("*******Ending of TC003_LoginDDT********");
	}

}
