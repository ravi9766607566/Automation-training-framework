package Selenium_Test_D7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_Method_Demo1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(8));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement usertxt= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		usertxt.sendKeys("Admin");
		
		WebElement userpwd= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		userpwd.sendKeys("admin123");
		
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();

	}

}
