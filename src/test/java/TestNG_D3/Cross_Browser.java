package TestNG_D3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Browser 
{
WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br)
	{
		//Using Switch Case
		switch(br)
		{
		case "chrome": driver= new ChromeDriver(); break;
		case "edge": driver= new EdgeDriver(); break;
		default: System.out.println("Invalid browser name"); return;
		}
		
		//Using If else leader
//		if (br.equals("chrome"))
//		{
//			driver= new ChromeDriver();
//		}
//		else if (br.equals("edge"))
//		{
//			driver= new EdgeDriver();
//		}
//		else
//		{
//			System.out.println("Invalid browser name");
//		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test
	void testlogin() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
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

}

// In testing.xml file
//<suite name="Suite"> : means Serial testing it means browsers run one by one
//<suite name="Suite" parallel="tests"> : means parallel testing it means all browsers run at a time