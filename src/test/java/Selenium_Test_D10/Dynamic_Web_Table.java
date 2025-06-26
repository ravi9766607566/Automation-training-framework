package Selenium_Test_D10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Web_Table {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		int rows=driver.findElements(By.xpath("//table[@id='taskTable']//tr")).size();
		int cols=driver.findElements(By.xpath("//table[@id='taskTable']/tbody/tr[1]/td")).size();
		
		List<WebElement> heading=driver.findElements(By.xpath("//table[@id='taskTable']//thead//th"));
		for(int i=0; i<=heading.size()-1; i++)
		{
			System.out.print(heading.get(i).getText()+"\t");
		}
		System.out.println();
		
		for(int r=1; r<=rows-1; r++)
		{
			for(int c=1; c<=cols; c++)
			{
					String text=driver.findElement(By.xpath("//table[@id='taskTable']//tbody/tr["+r+"]/td["+c+"]")).getText();
					System.out.print(text+"\t");
			}
			System.out.println();
		}
		
	}

}
