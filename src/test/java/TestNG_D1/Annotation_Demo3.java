package TestNG_D1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Annotation_Demo3 
{
	@BeforeTest
void bt()
{
	System.out.println("This is Before Test Method...");
}

	@AfterTest
void at()
{
	System.out.println("This is After Test Method...");
}
}
