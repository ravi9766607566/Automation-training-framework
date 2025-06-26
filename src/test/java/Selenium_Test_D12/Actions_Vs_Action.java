package Selenium_Test_D12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actions_Vs_Action {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement button=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		Action myaction = act.contextClick(button).build();
		 myaction.perform();
		

	}

}
