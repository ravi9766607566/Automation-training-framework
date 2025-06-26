package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ass_04_Flipcart_Autosuggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("iphone16");
		Thread.sleep(3000);
		List<WebElement> list= driver.findElements(By.xpath("//div[@class='YGcVZO _2VHNef']")); //.get(1).click();
		System.out.println(list.get(1).getText());
		list.get(1).click();

	}
}
