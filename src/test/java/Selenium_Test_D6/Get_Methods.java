package Selenium_Test_D6;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Methods {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		//get(url) : Opens the url on the browser
		//driver.get("https://demo.opencart.com.gr/");
		driver.get("https://medimention.com/");
		
		//getTitle() : return title of the current page
		System.out.println(driver.getTitle());
		
		// getCurrentUrl() : return URL of the current page
		System.out.println(driver.getCurrentUrl());
		
		// getPageSource() : return sourse code of the current page
//		System.out.println(driver.getPageSource());
		
		// getWindowHandle() : return id of the current window also it's return every times different different
		System.out.println(driver.getWindowHandle());
		
		// getWindowHandles() : return id's of the multiple/all browser windows
		driver.findElement(By.xpath("//li[@class='facebook']")).click();
		driver.findElement(By.xpath("//li[@class='twitter']")).click();
		driver.findElement(By.xpath("//li[@class='google-plus']")).click();
		//System.out.println(driver.getWindowHandles());
		Set<String> windowId= driver.getWindowHandles();
		System.out.println(windowId);

	}

}
