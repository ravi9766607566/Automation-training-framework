package Selenium_Test_D6;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigational_Methods {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fwishlist");
		
		
		//Difference between Get and Navigate
		//driver.get() --- accepts URL in string format only
		//driver.navigate().to() --- accepts URL in string format and URL object format also
		
		
		// navigate().to(url)
//		driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2Fwishlist");
		
		URL myurl= new URL("https://demo.nopcommerce.com/register?returnUrl=%2Fwishlist");
		driver.navigate().to(myurl);
		driver.manage().window().maximize();
		
		// navigate().back()
		driver.navigate().to("https://medimention.com/");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		// navigate().forward()
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		// navigate().refresh()
		Thread.sleep(3000);
		driver.navigate().refresh();


		

	}

}
