package Selenium_Test_D4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Xpath_Demo1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		// Xpath with single attribute
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Electronic System");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='small-searchterms']")).clear();
		Thread.sleep(1000);
		
		// Xpath with multiple attribute
		driver.findElement(By.xpath("//input[@id='small-searchterms'][@type='text'][@name='q']")).sendKeys("Mobile Devices");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//*[@id='small-searchterms'][@type='text']")).clear();
		Thread.sleep(1000);
		
		// Xpath with Operators attribute (and, or attribute)
		driver.findElement(By.xpath("//input[@id='small-searchterms' and @name='q']")).sendKeys("Computer Systems");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='small-searchterms' and @name='q']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='small-searchterms' or @type='te']")).sendKeys("Washing Machine");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='small-searchterms' or @type='tex']")).clear();
		Thread.sleep(1000);
		
		//Xpath with inner text  ---> text()
		// link and inner text = yes
//		driver.findElement(By.xpath("//a[text()='Electronics ']")).click();
//		Thread.sleep(1000);
		
		// print only plain inner text
		String text = driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).getText();
		System.out.println(text);
		
		// Xpath with contains
		driver.findElement(By.xpath("//input[contains(@placeholder, 'rch store')]")).sendKeys("vender machine");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(@placeholder,'Searc')]")).clear();
		Thread.sleep(1000);
		
		// Xpath starts-with
		driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Search sto')]")).sendKeys("leptops");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[starts-with(@placeholder, 'Search stor')]")).clear();
		
		Thread.sleep(2000);
		driver.close();
		

	}

}
