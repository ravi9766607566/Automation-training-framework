package Selenium_Test_D8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes_Demo1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		//Select Specific Checkbox
//		driver.findElement(By.id("wednesday")).click();
		
		//Select all Checkboxs
//		List<WebElement> Checklist=driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
//		for (int i=0; i<=Checklist.size()-1; i++)
//		{
//			Checklist.get(i).click();		
//		}
		
		//Select all checkboxes with print day's names
		List<WebElement> Labellist=driver.findElements(By.xpath("//div[@class='form-group'][4]//label[@class='form-check-label']"));
//		for(int i=0; i<=Labellist.size()-1; i++)
//		{
//			Labellist.get(i).click();
//			System.out.println(Labellist.get(i).getText());
//		}
		
//		for(WebElement element:Labellist)
//		{
//			System.out.println(element.getText());
//			element.click();
//		}
		
		//Select first 3 Or Last 3 checkboxes
//		for(int i=0; i<3; i++)
//		{
//			Labellist.get(i).click();
//			System.out.println(Labellist.get(i).getText());
//		}
//		
//		for(int i=Labellist.size()-3; i<=Labellist.size()-1; i++)
//		{
//			Labellist.get(i).click();
//			System.out.println(Labellist.get(i).getText());
//		} 
		
		
		// OR only last 3 with for eachloop
		
		for(WebElement element:Labellist)
		{
			if(element.getText().equals("Thursday") || element.getText().equals("Friday") || element.getText().equals("Saturday"))
			{
			element.click();
			System.out.println(element.getText());
			}
		}
		
		

	}

}
