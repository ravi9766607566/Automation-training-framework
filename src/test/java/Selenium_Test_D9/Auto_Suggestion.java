package Selenium_Test_D9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']/li//div[@role='presentation']/span"));
		for(WebElement li:list)
		{
			if (li.getText().equals("selenium interview questions"))
			{
				li.click();
			}
		}

	}

}
