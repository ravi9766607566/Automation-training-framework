package TestNG_D1;

import org.testng.annotations.*;

public class Annotation_Demo1 
{
	@BeforeMethod
	void login()
	{
		System.out.println("This is Login...");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("This is Logout...");
	}
	
	@Test
	void addToCart()
	{
		System.out.println("This is Add to Cart...");
	}
	
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
