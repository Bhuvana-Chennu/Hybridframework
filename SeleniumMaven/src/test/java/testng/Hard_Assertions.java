package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hard_Assertions {
	SoftAssert sa;
	
	//@Test
	void test_hardassertion()
	{
		System.out.println("Testing......");
		System.out.println("Testing.....");
		
		
		Assert.assertEquals(1, 2); //hard assertion
		
		
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		

	}
	
	@Test
	void test_softassertion()
	{
		System.out.println("Testing......");
		System.out.println("Testing.....");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1, 2); //soft assertion
		
		
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		
		sa.assertAll();
		
	}

}
