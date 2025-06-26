package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass_07_Slider {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> slider=driver.findElements(By.xpath("//span[contains(@class,'ui-slider-handle')]"));
		System.out.println("Minium Pointer Location "+slider.get(0).getLocation());
		System.out.println("Maximum Pointer Location "+slider.get(1).getLocation());
		
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(slider.get(0), 874, 2050).perform();
		System.out.println("Minium Pointer Location "+slider.get(0).getLocation());
		
		act.dragAndDropBy(slider.get(1), -1000, 2050).perform();
		System.out.println("Maximum Pointer Location "+slider.get(1).getLocation());

	}

}
