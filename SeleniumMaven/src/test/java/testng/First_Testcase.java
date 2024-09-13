package testng;

import org.testng.annotations.Test;

/*
 * 1)Open application
 * 2)Login
 * 3)Logout
 */

public class First_Testcase {
	@Test 
	void openapp()
	{
		System.out.println("open the app");
	}
	@Test (priority = 1)
	void login()
	{
		System.out.println("login to the app");
	}
	@Test (priority=2)
	void logout() 
	{
		System.out.println("logou the app");
	}

}
