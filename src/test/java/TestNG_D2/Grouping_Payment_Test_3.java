package TestNG_D2;

import org.testng.annotations.Test;

public class Grouping_Payment_Test_3 
{
	@Test(priority=1, groups= {"sanity","regression","functional"})
	void PaymentInDollars()
	{
		System.out.println("This is Payment in Dollars");
	}

		@Test(priority=2, groups= {"sanity","regression","functional"})
	void PaymentInRupees()
	{
		System.out.println("This is Payment in Rupees");
	}

}
