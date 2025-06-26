package Selenium_Test_D6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_Methods {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fwishlist");
		driver.manage().window().maximize();
		
		// isDisplayed()
		WebElement logo =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(logo.isDisplayed());
		
		// isEnabled
		boolean srchEnabled = driver.findElement(By.id("small-searchterms")).isEnabled();
		System.out.println(srchEnabled);
		
		// isSelected 
		System.out.println();
		WebElement radsel= driver.findElement(By.id("gender-female"));
		System.out.println(radsel.isSelected()); // false = not selected 
		radsel.click();
		System.out.println(radsel.isSelected()); // true = selected
		
		

	}

}
