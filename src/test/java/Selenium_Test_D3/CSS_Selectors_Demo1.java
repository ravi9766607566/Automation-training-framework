package Selenium_Test_D3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selectors_Demo1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//tag id  ---> tag#id (Tag is Optional)
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Electronics");
//		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Electronics");	
		WebElement search = driver.findElement(By.cssSelector("input#small-searchterms"));
		search.sendKeys("Electronics");
		Thread.sleep(2000);
		
		search.clear();
		Thread.sleep(1000);
		
		// tag class ---> tag.class (Tag is Optional)
//		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Mobile Devices");
		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Mobile Devices");
		Thread.sleep(2000);
		
		search.clear();
		Thread.sleep(1000);
		
		// tag attribute ---> tag[attribute='value'] (Tag is Optional)
//		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Computer Systems");
//		driver.findElement(By.cssSelector("[name=\"q\"]")).sendKeys("Computer Systems");
		driver.findElement(By.cssSelector("[name='q']")).sendKeys("Computer Systems");
		Thread.sleep(2000);
		
		search.clear();
		Thread.sleep(1000);
		
		// tag class attribute ---> tag.classname[attribute='value'] (Tag is Optional)
//		driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("Washing Machine");
		driver.findElement(By.cssSelector(".search-box-text[placeholder='Search store']")).sendKeys("Washing Machine");
		Thread.sleep(1000);
		
	}

}
