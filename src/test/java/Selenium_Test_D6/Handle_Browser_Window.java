package Selenium_Test_D6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Browser_Window {

	public static void main(String[] args) throws InterruptedException 
	{
		// Switch between the diffrent tabs/windows
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://medimention.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//li[@class='facebook']")).click();
		driver.findElement(By.xpath("//li[@class='twitter']")).click();
		driver.findElement(By.xpath("//li[@class='google-plus']")).click();
		
		Set<String> winId= driver.getWindowHandles();
		
		//Approach 1
//		List<String> winlist= new ArrayList(winId);
//		
//		String win_1= winlist.get(0);
//		String win_2= winlist.get(1);
//		String win_3= winlist.get(2);
//		String win_4= winlist.get(3);
//		
//		Thread.sleep(2000);
//		System.out.println(driver.getTitle());
//		driver.switchTo().window(win_2);
//		Thread.sleep(2000);
//		System.out.println(driver.getTitle());
//		driver.switchTo().window(win_3);
//		Thread.sleep(2000);
//		System.out.println(driver.getTitle());
//		driver.switchTo().window(win_4);
//		System.out.println(driver.getTitle());
//		
//		Thread.sleep(2000);
//		driver.quit();
		
		// Approach 2
//		for (String win:winId)
//		{
//			String Title=driver.switchTo().window(win).getTitle();
//			System.out.println(Title);
//		}
		
		// Approach 3 with continue work on other tab
		for (String win:winId)
		{
			String Title=driver.switchTo().window(win).getTitle();
			if(Title.contains("Google"))
			{
				break;
			}
			Thread.sleep(3000);
		}
		driver.findElement(By.xpath("//a[contains(text(), 'announced')]")).click();
		
		Thread.sleep(2000);
		driver.quit();
		

	}

}
