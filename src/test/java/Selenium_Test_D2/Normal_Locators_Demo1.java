package Selenium_Test_D2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Normal_Locators_Demo1 {

	public static void main(String[] args) throws InterruptedException 
	{
		try {
		// WebDriver driver = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com.gr/");
		driver.manage().window().maximize();
		
		// name Locator
		driver.findElement(By.name("search")).sendKeys("Mobile Devices");
		
//		WebElement search=driver.findElement(By.name("search"));
//		search.sendKeys("Tablets");
//		Thread.sleep(2000);
//		search.clear();
//		search.sendKeys("Leptops");
//		Thread.sleep(2000);
//		search.clear();
//		search.sendKeys("Charger");
		
		Thread.sleep(2000);
		
		// id Locator
		driver.findElement(By.id("form-currency")).click();
		Thread.sleep(2000);
		
		// linktext Locator
		driver.findElement(By.linkText("Components")).click();
		Thread.sleep(2000);
		
		// partialLinktext Locator
		driver.findElement(By.partialLinkText("Deskto")).click();
		Thread.sleep(2000);
		
		//classname Locator
		List <WebElement> list= driver.findElements(By.className("dropdown"));
		System.out.println(list.size()+" Lists");
		
		//tagname Locator
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size()+" Links");
		
		List<WebElement> images= driver.findElements(By.tagName("imgs"));
		System.out.println(images.size()+" Images");
	
		
		
		
	
	}catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		

	}

}
