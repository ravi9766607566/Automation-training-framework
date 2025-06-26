package Selenium_Test_D8;

import java.nio.channels.SelectableChannel;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_Frames {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//Frame 1
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.name("mytext1")).sendKeys("Welcome");
		
		driver.switchTo().defaultContent();
		
		//Frame 2
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.name("mytext2")).sendKeys("Automation");
		
		driver.switchTo().defaultContent();
		
		//Frame 3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.name("mytext3")).sendKeys("WebAutomation");
		
		driver.switchTo().frame(0);
		driver.findElements(By.xpath("//div[@class='AB7Lab Id5V1']")).get(0).click();
		driver.findElements(By.xpath("//span[@class='aDTYNe snByac n5vBHf OIC90c']")).get(2).click();
		driver.findElement(By.xpath("//div[@class='MocG8c HZ3kWc mhLiyf LMgvRb KKjvXb DEh1R']")).click();	
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebElement shorttxt= driver.findElement(By.xpath("//input[@class= 'whsOnd zHQkBf']"));
			shorttxt.click();
			shorttxt.sendKeys("This is short text");
		WebElement longtxt=driver.findElement(By.xpath("//textarea[@class='KHxj8b tL9Q4c']"));
			longtxt.click();
			longtxt.sendKeys("This is long text");
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		
		driver.switchTo().defaultContent();
		
		//Frame 4
		WebElement frame4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.name("mytext4")).sendKeys("Selenium with JAVA");
		
	}

}
