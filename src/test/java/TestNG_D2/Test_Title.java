package TestNG_D2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Title 
{
	@Test
	void testTitle()
	{
		String exp_title="MyTitle";
		String act_title="MyTitle";
		
//		if(exp_title.equals(act_title))
//		{
//			System.out.println("Test Passed...");
//		}
//		else
//		{
//			System.out.println("Test Failed...");
//		}
		
		Assert.assertEquals(exp_title, act_title);
//		Assert.assertTrue(exp_title.equals(act_title));
	}
}
