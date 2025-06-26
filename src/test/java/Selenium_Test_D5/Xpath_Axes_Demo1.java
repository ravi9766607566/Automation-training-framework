package Selenium_Test_D5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Axes_Demo1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
		// Self Node
//		driver.findElement(By.xpath("//a[contains(text(),'Adani Ports & Speci')]/self::a")).click();
		
		// Parent Node
		String text= driver.findElement(By.xpath("//a[contains(text(),'Adani Ports & Speci')]/parent::td")).getText();
		System.out.println(text);
								//OR
//		driver.findElement(By.xpath("//a[contains(text(), 'Adani Ports & Speci')]/parent::td")).click();
		
		// Ancestor Node (parents above all elements)
		List<WebElement> ances_list= driver.findElements(By.xpath("//a[contains(text(),'Adani Ports & Speci')]/ancestor::*"));
		System.out.println(ances_list.size()+" Ancestor Node list size");
		
		// Descendants Node (Ancestor Child)
		List<WebElement> desc_list= driver.findElements(By.xpath("//a[contains(text(),'Adani Ports & Speci')]/ancestor::tr/descendant::*"));
		System.out.println(desc_list.size()+ " Descendants Node list size");
		
		// Child Node
		List<WebElement> child= driver.findElements(By.xpath("//a[contains(text(),'Adani Ports & Speci')]/ancestor::tr/child::*"));
		System.out.println(child.size()+" Child Node list size");
		
		// Following sibling Node
		List<WebElement> foll_sib = driver.findElements(By.xpath("//a[contains(text(),'Adani Ports & Speci')]/ancestor::tr/following-sibling::*"));
		System.out.println(foll_sib.size()+" Following sibling Node list size");
		
		// Preceding sibling Node
		List<WebElement> Prec_sib = driver.findElements(By.xpath("//a[contains(text(),'Adani Ports & Speci')]/ancestor::tr/preceding-sibling::*"));
		System.out.println(Prec_sib.size()+" Preceding sibling Node list size");
		
		// Following Node (We can see all the elements from web page through * also for tag wise as well)
		List<WebElement> following = driver.findElements(By.xpath("//a[contains(text(),'Adani Ports & Speci')]/following::a"));
		System.out.println(following.size()+" Total Links size through following mode");
		
		// Preceding Node
		List<WebElement> preceding = driver.findElements(By.xpath("//a[contains(text(),'Adani Ports & Speci')]/preceding::*"));
		System.out.println(preceding.size()+" Preceding Node list size");
		
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
