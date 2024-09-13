package testng;

import org.testng.annotations.Test;

public class Logout {
	@Test(priority=1)
	void logoutByEmail() {
		System.out.println("This is logout by email.....");
	}
	@Test(priority=2)
	void logoutByFacebook() {
		System.out.println("This is logout by facebook.....");
	}
	@Test(priority=3)
	void logoutByTwitter() {
		System.out.println("This is logout by twitter.....");
	}

}
