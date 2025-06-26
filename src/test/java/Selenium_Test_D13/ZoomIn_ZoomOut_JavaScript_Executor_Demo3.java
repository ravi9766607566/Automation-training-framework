package Selenium_Test_D13;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomIn_ZoomOut_JavaScript_Executor_Demo3 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//ZoomOut
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='25%'");
		
		Thread.sleep(2000);
		//ZoomIn
		js.executeScript("document.body.style.zoom='125%'");

	}

}
