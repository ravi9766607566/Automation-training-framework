package TestNG_D1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Annotation_Demo4 
{
	@BeforeSuite
void bs()
{
	System.out.println("This is Before Suit Method");
}

	@AfterSuite
void as()
{
	System.out.println("This is After Suit Method");
}

}
