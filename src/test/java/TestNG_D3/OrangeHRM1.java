package TestNG_D3;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestNG_D3.OrangeHRM2_MyListner.class)
public class OrangeHRM1 
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
	
	@Test(priority=1)
	void testTitle()
	{
		Assert.assertEquals("OranHRM", driver.getTitle());
	}
	
	@Test(priority=2, dependsOnMethods= {"testTitle"})
	void testURL()
	{
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Assert.assertTrue(url.equals(driver.getCurrentUrl()));
	}
	
	@Test(priority=3)
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
