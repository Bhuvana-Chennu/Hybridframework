package testng;

import org.testng.annotations.Test;

public class Sign_Up {
	@Test(priority=1,groups = {"regression"})
	void signupByEmail() {
		System.out.println("This is logout by email.....");
	}
	@Test(priority=2,groups = {"regression"})
	void signupByFacebook() {
		System.out.println("This is logout by facebook.....");
	}
	@Test(priority=3,groups = {"regression"})
	void signupByTwitter() {
		System.out.println("This is logout by twitter.....");
	}

}
