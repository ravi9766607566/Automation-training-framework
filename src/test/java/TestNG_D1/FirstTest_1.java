package TestNG_D1;

import org.testng.annotations.Test;

public class FirstTest_1 
{
	@Test(priority=1)
	void openApp()
	{
		System.out.println("Opening the Application...");
	}
	
	@Test(priority=2)
	void login()
	{
		System.out.println("Login to the Application...");
	}
	
	@Test(priority=3)
	void logout()
	{
		System.out.println("Logout from Application...");
	}
	

}
