package testng;

import org.testng.annotations.Test;

public class Payment {
	
	@Test(priority = 1,groups= {"sanity","regression","functional"})
	void payinrupes() {
		System.out.println("This is payment in rupees);");
	}
	
	@Test(priority = 2,groups= {"sanity","regression","functional"})
	void payindollars() {
		System.out.println("This is payment in dollars");
	}

}
