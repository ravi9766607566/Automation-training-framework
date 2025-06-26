package TestNG_D2;

import org.testng.annotations.Test;

public class Grouping_Signup_Test_2 
{
	@Test(priority=1, groups= {"regression"})
void SignupByfb()
{
	System.out.println("This is Signup By Facebook");
}

	@Test(priority=2, groups= {"regression"})
void SignupByTwitter()
{
	System.out.println("This is Signup by Twitter");
}

	@Test(priority=3, groups= {"regression"})
void SignupByEmail()
{
	System.out.println("This is Signup by Email");
}
}
