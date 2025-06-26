package TestNG_D2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assertions 
{
	@Test
	void test()
	{
//		Assert.assertEquals("Y", 'Y');  //Fail
//		Assert.assertNotEquals(123, 122); //Pass
//		Assert.assertTrue(true);  //Pass
//		Assert.assertTrue(125>120);  //Pass
//		Assert.assertTrue("Welcome".equalsIgnoreCase("welcome"));  //Pass
		
//		Assert.assertFalse(false);  //Pass
//		Assert.assertFalse(1200==1200);  //Fail
		
		Assert.fail();
	}
}
