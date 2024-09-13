package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Demo {
	
	@Test
	void testtitle()
	{
		String exp_title="Log in to facebook";
		String act_title ="Log into facebook";
		/*
		 * if(exp_title.equals(act_title)) { System.out.println("test pass"); } else {
		 * System.out.println("Test failed"); }
		 */
		
	//	Assert.assertEquals(exp_title, act_title);
		if(exp_title.equals(act_title)) 
		{
			System.out.println("Test passed");
			Assert.assertTrue(true);	
		}
		else
		{
			System.out.println("Test failed");
			Assert.assertTrue(false);
		}
		
	}
	
	

}
