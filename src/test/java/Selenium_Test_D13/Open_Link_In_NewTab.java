package Selenium_Test_D13;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Open_Link_In_NewTab {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://medimention.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement homemenu = driver.findElement(By.xpath("//a[text()='Home']"));
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(homemenu).keyUp(Keys.CONTROL).perform();
		
		Set<String> winId= driver.getWindowHandles();
		System.out.println(winId);

	}

}
