package Page_Object_Model;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_Test_Case_WithPF 
{
	WebDriver driver;
	
	@BeforeClass
	void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test
	void testLogin()
	{
		With_Page_Factory wpf=new With_Page_Factory(driver);
		wpf.setUser("Admin");
		wpf.setpass("admin123");
		wpf.clickLogin();
		
		boolean dash = driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
		Assert.assertTrue(dash);
	}
	
	@AfterClass
	void teardown()
	{
		driver.quit();
	}
	

}
