package Selenium_Test_D11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker_1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// Approch 1 : Enter date manually
//		driver.findElement(By.id("datepicker")).sendKeys("05/01/2025");
		
		// Approch 2 : Select date through Calender picker
		String year="2029";
		String month="November";
		String date="23";
		driver.findElement(By.id("datepicker")).click();
		
		while(true)
		{
			String currmonth= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String curryear= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(currmonth.equals(month) && curryear.equals(year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // Click on next button form calender.
		}
		
		List<WebElement> dat=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
		for(WebElement dt:dat)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
		
		//if we wants to previous date then in above need to enter previous month,year and day. after that write previous button click xpath.
		
		

	}

}
