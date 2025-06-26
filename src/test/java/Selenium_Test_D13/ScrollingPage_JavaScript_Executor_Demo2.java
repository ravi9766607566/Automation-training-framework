package Selenium_Test_D13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage_JavaScript_Executor_Demo2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		// Scroll down by pixel number
		js.executeScript("window.scrollBy(0, 1000)", "");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(2000);
		// Scroll down to webelement
		WebElement ele=driver.findElement(By.xpath("//h2[text()='Static Web Table']"));
		js.executeScript("arguments[0].scrollIntoView();", ele);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(2000);
		// Scroll till end of the page
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(2000);
		// Scroll till initial (Top) Page
		js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		

	}

}
