package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assertion {

	@Test
	void test()
	{
		//Assert.assertEquals(123, 354);
		//Assert.assertEquals("123", 123);
		//Assert.assertEquals("xyz", "xyz");
		//Assert.assertNotEquals(123, 123);   //fail
		//Assert.assertNotEquals(123, 345);  //passed
		//Assert.assertTrue(true);  //pass
		//Assert.assertTrue(false);   //fail
		//Assert.assertTrue(1==2);   //fail
		//Assert.assertTrue(1==1);     //pass
		//Assert.assertFalse(1==2);  //pass
		//Assert.assertFalse(1==1);  //fail
		Assert.fail();
		
		
		
	}

}
