package TestNG_D2;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency_Method 
{
	@Test(priority=1)
	void openApp()
	{
		Assert.assertTrue(true);  // Pass
	}
	
	@Test(priority=2, dependsOnMethods = {"openApp"})
	void login()
	{
		Assert.assertTrue(true);  // Pass
	}
	
	@Test(priority=3, dependsOnMethods = {"login"})
	void addToCart()
	{
		Assert.assertTrue(false);  // Fail
	}
	
	@Test(priority=4, dependsOnMethods = {"addToCart"})
	void payment()
	{
		Assert.assertTrue(true);  // skip
	}
	
	@Test(priority=5, dependsOnMethods= {"payment"})
	void checkout()
	{
		Assert.assertTrue(true);  // Skip
	}
	
	@Test(priority=6, dependsOnMethods= {"login", "checkout"})
	void logout()
	{
		Assert.assertTrue(true);  // Skip
	}

}
