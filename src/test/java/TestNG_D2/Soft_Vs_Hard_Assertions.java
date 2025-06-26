package TestNG_D2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Vs_Hard_Assertions 
{
	@Test
	void test_hardAssert()
	{
		System.out.println("Testing Before Assertion...");
		Assert.assertEquals(123, 123);
		System.out.println("Testing After Assertion...");
	}
	
	@Test
	void test_softAssert()
	{
		System.out.println("Testing Before Assertion...");
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(123, 127);
		System.out.println("Testing After Assertion...");
		sa.assertAll();   //Mandatory
	}

}
