package Selenium_Test_D1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class First_Test_Demo1 {

	public static void main(String[] args) throws InterruptedException 
	{
		// Launching the Browser
	    //WebDriver driver=new ChromeDriver();
		EdgeDriver driver=new EdgeDriver();
		   
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();

	}

}
