package Selenium_Test_D9;

import java.io.ObjectInputStream.GetField;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap_Dropdown {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[contains(@class, 'multiselect-se')]")).click();
		
		//Single value select
		driver.findElement(By.xpath("//input[@value='Python']")).click();
		
		//Select All values
		//List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]"));

//		List<WebElement> options= driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//input[@type='checkbox']"));
//		for(WebElement opt:options)
//		{
//			if(!opt.isSelected())
//			{
//				opt.click(); //All Selected
//			}
//		}
		
		//Select Multiple Values and verify input selected
		List<WebElement> options1=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label[@class='checkbox']"));
		for(WebElement opt1:options1)
		{
			System.out.println(opt1.getText());
			if(opt1.getText().equals("Java") || opt1.getText().equals("C#") || opt1.getText().equals("Oracle"))
			{
				opt1.click();
			}
		}

		
//		for(int i=0; i<=options1.size()-1; i++)
//		{
//			
//			if(options1.get(i).getText().equals("Java") || options1.get(i).getText().equals("C#") || options1.get(i).getText().equals("Oracle"))
//			{
//				options1.get(i).click();
//				System.out.println(options1.get(i).getText());
//			}
//		}
		
		System.out.println();
		
		//verify input selected values
		String all_opt=driver.findElement(By.xpath("//span[contains(@class, 'multiselect-se')]")).getText();
		if(all_opt.contains("6"))
		{
			System.out.println("6 selected, Input verified");
		}
		else
		{
			System.out.println("Input Incorrect");
		}


	}

}
