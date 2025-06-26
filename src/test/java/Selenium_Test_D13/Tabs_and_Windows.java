package Selenium_Test_D13;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabs_and_Windows {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Selenium 4.x
		//Open New Tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://medimention.com/");
		
		//Open New window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://testautomationpractice.blogspot.com/");
	}

}
