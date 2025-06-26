package Selenium_Test_D9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Select Options from drop-down
		WebElement dropcountry=driver.findElement(By.id("country"));
		Select drop=new Select(dropcountry);
		//drop.selectByValue("australia");
		//drop.selectByIndex(7);
		drop.selectByVisibleText("India");
		
		List<WebElement> options= drop.getOptions();
		System.out.println("Number of options : "+options.size());
		
		for(WebElement opt:options)
		{
			System.out.println(opt.getText());
		}		
		

	}

}
