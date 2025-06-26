package ALM_Expert_Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALM_01 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://almbeta.hireats.com/#/home");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("UserName")).sendKeys("rsharma@qaindia.com");
		driver.findElement(By.id("password")).sendKeys("qaindia@007");
		Thread.sleep(2000);
		driver.findElement(By.id("userLoginBtn")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("setup")).click();
		driver.findElement(By.id("application")).click();

	}

}
