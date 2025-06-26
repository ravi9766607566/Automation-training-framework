package Selenium_Test_D10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_Web_Table {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		int rows= driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		int cols= driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th")).size();
		
		for(int r=1; r<=rows; r++)
		{
			for(int c=1; c<=cols; c++)
			{
				if(r==1)
				{
					String text= driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/th["+c+"]")).getText();
					System.out.print(text+"\t");
				}
				else
				{
					String text= driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td["+c+"]")).getText();
							System.out.print(text+"\t");
				}
			}
			System.out.println();
		}
		
		

	}

}
