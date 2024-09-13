package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annoaion2_Demo {
	
	@BeforeClass
	
	void login()
	{
		System.out.println("This is login...");
	}
	
	@AfterClass
	
	void logout()
	{
		System.out.println("This is logout...");
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

}
