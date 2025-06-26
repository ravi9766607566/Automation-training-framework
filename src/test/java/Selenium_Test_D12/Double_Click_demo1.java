package Selenium_Test_D12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click_demo1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement box_1=driver.findElement(By.id("field1"));
		WebElement button=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		box_1.clear();
		box_1.sendKeys("Welcome to Automation");
		
		Actions act = new Actions(driver);
		//Double Click Operation
		act.doubleClick(button).perform();
		
		//Verify and print Text is copied or not
				//Approch 1
		WebElement box_2=driver.findElement(By.id("field2"));
		if(box_1.getText().equals(box_2.getText()))
		{
			System.out.println("Text Copied...");
		}
		else
		{
			System.out.println("Text Not Copied");
		}
		
				//Approch 2 (Not working for only this website)
//		String attri_1= box_1.getDomAttribute("value");  // value ---> value is inspect of web page and value is attribute of field 1 element.
//		String attri_2=box_2.getDomAttribute("value");
//		if(attri_1.equals(attri_2))
//		{
//			System.out.println("Text Copied");
//		}
//		else
//		{
//			System.out.println("Text not Copied...");
//		}
	}

}
