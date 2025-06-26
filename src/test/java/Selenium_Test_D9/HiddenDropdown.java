package Selenium_Test_D9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropdown {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));	
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		
		driver.findElements(By.xpath("//input[@placeholder='Type for hints...']")).get(0).sendKeys("Ravindra Sharma");
		driver.findElements(By.xpath("//input[@placeholder='Type for hints...']")).get(1).sendKeys("Mkumar");
		
		driver.findElements(By.xpath("//input[@class='oxd-input oxd-input--active']")).get(1).sendKeys("0066");
		
		driver.findElements(By.xpath("//div[@class='oxd-select-text--after']")).get(0).click();
		driver.findElement(By.xpath("//span[text()='Full-Time Contract']")).click();
		
		driver.findElements(By.xpath("//div[@class='oxd-select-text--after']")).get(1).click();
		driver.findElement(By.xpath("//span[text()='Current and Past Employees']")).click();
		
		driver.findElements(By.xpath("//div[@class='oxd-select-text--after']")).get(2).click();
		//Print all values which is in dropdown
		List<WebElement> options= driver.findElements(By.xpath("//div[@role='listbox']//span"));
//		for(int i=0; i<=options.size()-1; i++)
//		{
//			System.out.println(options.get(i).getText());
//		}
		for(WebElement opt:options)
		{
			System.out.println(opt.getText());
		}

		driver.findElement(By.xpath("//span[text()='Chief Financial Officer']")).click();
		
		driver.findElements(By.xpath("//div[@class='oxd-select-text--after']")).get(3).click();
		driver.findElement(By.xpath("//span[text()='Engineering']")).click();
		

	}

}
