package TestNG_D1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondTest 
{
	WebDriver driver;
	
	@Test(priority=1)
	void openApp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://medimention.com/");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 2)
	void testTitle()
	{
		String exp_title= "Medi Mention - All Medical Solution";
		String act_title= driver.getTitle();
		if(exp_title.equals(act_title))
		{
			System.out.println("Test Passed...");
		}else
		{
			System.out.println("Test Failed...");
		}
	}
	
	@Test(priority = 3)
	void tearDown()
	{
		driver.quit();
	}

}
