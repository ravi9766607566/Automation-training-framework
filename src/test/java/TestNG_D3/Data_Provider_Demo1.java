package TestNG_D3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Demo1 
{

	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="dataprovide1")
	void testlogin(String email, String pass)
	{
		driver.findElement(By.name("username")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		boolean dash=driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
		if(dash)
		{
			driver.findElement(By.xpath("//i[contains(@class, 'oxd-icon bi-caret')]")).click();
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			Assert.assertTrue(dash);
		}
		else
		{
			Assert.fail();
		}
	}
	
	@AfterClass
	void teardown()
	{
		driver.quit();
	}
	
	//Using Double Dimensional Array's
	@DataProvider(name="dataprovide1")
	//@DataProvider(name="dataprovide1", indices = { 0,2}) // how many rows we can run
	String [][] loginData()
	{
		String data[][]= {{"admins1","ad123"},
						  {"abcd","1234g"},
						  {"Admin","admin123"},
						  {"xyz123","123xyz"}};
		return data;
		
	}
	
	
}
