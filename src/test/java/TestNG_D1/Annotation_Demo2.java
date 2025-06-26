package TestNG_D1;

import org.testng.annotations.*;

public class Annotation_Demo2 
{
	@BeforeClass
	void login()
	{
		System.out.println("This is Login...");
	}
	
	@AfterClass
	void logout()
	{
		System.out.println("This is Logout...");
	}
	
	//@Test(invocationCount=4) // This Test will run 4 times
	@Test
	void addToCart()
	{
		System.out.println("This is Add to Cart...");
	}
	
	//@Test(enabled=false) // skip TC
	@Test
	void payment()
	{
		System.out.println("This is Payment...");
	}
	
	@Test
	void checkout()
	{
		System.out.println("This is Checkout...");
	}
}
