package Selenium_Test_D5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Dynamic_Attributes {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		for(int i=0; i<5; i++)
		{
			WebElement button = driver.findElement(By.xpath("//button[@name='start' or @name='stop']"));
			button.click();
			System.out.println(button.getText());
			Thread.sleep(1000);
		}
		
		WebElement header = driver.findElement(By.xpath("//div[@id='header-inner']/div/h1"));
		System.out.println(header.getText());
		
		WebElement text = driver.findElement(By.xpath("//div[@id='header-inner']/div[2]/p/span"));
		System.out.println(text.getText());
		
		driver.close();

	}

}
