package Selenium_Test_D11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Date_Picker_2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		String year="2019";
		String month="Nov";
		String date="23";
		driver.findElement(By.id("txtDate")).click();
		
		WebElement currmonth=driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select mondrop=new Select(currmonth);
		mondrop.selectByVisibleText(month);
		
		WebElement curryear=driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select yerdrop=new Select(curryear);
		yerdrop.selectByVisibleText(year);
		
		List<WebElement> dat=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
		for(WebElement dt:dat)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
		

	}

}
