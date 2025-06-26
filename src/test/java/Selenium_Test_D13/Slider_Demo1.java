package Selenium_Test_D13;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_Demo1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		List<WebElement>min_max=driver.findElements(By.xpath("//span[contains(@class,'ui-slider-handle')]"));
		
		System.out.println("Minimum Pointer Location "+min_max.get(0).getLocation());
		System.out.println("Maximum Pointer Location "+min_max.get(1).getLocation());
		
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(min_max.get(0), 120, 256).perform();
		System.out.println("Minium Pointer Location "+min_max.get(0).getLocation());
		
		act.dragAndDropBy(min_max.get(1), -145, 256).perform();
		System.out.println("Maximum Pointer Location "+min_max.get(1).getLocation());
		

	}

}
