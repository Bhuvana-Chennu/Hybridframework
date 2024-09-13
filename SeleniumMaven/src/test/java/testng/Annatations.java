package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Annatations {
	
	@BeforeMethod
	void login()
	{
	 	System.out.println("This is login...");
	}
	
	@Test (priority = 1)
	void search() 
	{
		System.out.println("This is search method....");
	}
	
	@Test (priority = 2)
	void adv_search()
	{
		System.out.println("This is adv search.....");
	}
	
	@AfterMethod
	void logout() 
	{
		System.out.println("This is logout...");
	}

}
