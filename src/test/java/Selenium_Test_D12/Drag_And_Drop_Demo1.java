package Selenium_Test_D12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop_Demo1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement rome=driver.findElement(By.id("box6"));
		WebElement italy= driver.findElement(By.id("box106"));
		
		Actions act = new Actions(driver);
		//Drag and Drop mouse operation
		act.dragAndDrop(rome, italy).perform();
		
		

	}

}
