package Selenium_Test_D6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Methods {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://medimention.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[@class='facebook']")).click();
		driver.findElement(By.xpath("//li[@class='twitter']")).click();
		driver.findElement(By.xpath("//li[@class='google-plus']")).click();
		
		// close() :  Close Single Window/browser/tab
		Thread.sleep(2000);
		driver.close();
		
		// quit() : Close multiple Window/browser/tabs
		Thread.sleep(2000);
		driver.quit();
		

	}

}
