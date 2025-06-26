package Selenium_Test_D13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Executor_Demo1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement txtemail=driver.findElement(By.id("email"));
		WebElement redfemale=driver.findElement(By.id("female"));
		
		//Alternate for sendkeys
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value','michael@john.com')", txtemail);
		
		// Alternate for Click
		js.executeScript("arguments[0].click()", redfemale);
		

	}

}
