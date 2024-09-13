package testng.pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {
	
	@Test
	void xyz()
	{
		System.out.println("This is pqr from c3");
		
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("This is after suite method");
	}
	
	@BeforeSuite
	void bs()
	{
		System.out.println("This is before suite method");
	}

}
