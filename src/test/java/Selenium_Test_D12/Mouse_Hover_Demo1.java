package Selenium_Test_D12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// 
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://demo.opencart.com.gr/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement components=driver.findElement(By.xpath("//a[text()='Components']"));
		WebElement desktop=driver.findElement(By.xpath("//a[text()='Desktops']"));
		WebElement mp3=driver.findElement(By.xpath("//a[text()='MP3 Players']"));
		
		Actions act= new Actions(driver);
		// Mouse Hover operation
		//act.moveToElement(components).moveToElement(desktop).moveToElement(mp3).build().perform();
								//OR
		//act.moveToElement(components).moveToElement(desktop).moveToElement(mp3).perform();
								//OR
		act.moveToElement(components).build().perform();	//build()--->Createing a Action
		Thread.sleep(1000);
		act.moveToElement(desktop).perform();				//perform()--->Completing an action
		Thread.sleep(1000);
		act.moveToElement(mp3).perform();

	}

}
