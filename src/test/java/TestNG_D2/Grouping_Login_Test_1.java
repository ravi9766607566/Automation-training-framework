package TestNG_D2;

import org.testng.annotations.Test;

public class Grouping_Login_Test_1
{
	@Test(priority=1, groups= {"sanity"})
void loginByfb()
{
	System.out.println("This is Login By Facebook");
}

	@Test(priority=2, groups= {"sanity"})
void loginByTwitter()
{
	System.out.println("This is Login by Twitter");
}

	@Test(priority=3, groups= {"sanity"})
void loginByEmail()
{
	System.out.println("This is Login by Email");
}

}
