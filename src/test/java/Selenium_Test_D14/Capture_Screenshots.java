package Selenium_Test_D14;


import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Screenshots {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		// Scroll down by pixel number
//		js.executeScript("window.scrollBy(0, 2000)", "");
		
		// Full Screenshots
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File target= new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");
		source.renameTo(target);
		
		// Capture Screenshot of specific section
		WebElement section= driver.findElement(By.xpath("//table[@id='taskTable']"));
		File sourceSec= section.getScreenshotAs(OutputType.FILE);
		File targetSec= new File(System.getProperty("user.dir")+"\\Screenshots\\section.png");
		sourceSec.renameTo(targetSec);
		
		// Capture Screenshot of WebElement
		WebElement element= driver.findElement(By.xpath("//h1[@class='title']"));
		File sourceEle= element.getScreenshotAs(OutputType.FILE);
		File targetEle= new File(System.getProperty("user.dir")+"\\Screenshots\\Element.png");
		sourceEle.renameTo(targetEle);

	}

}
