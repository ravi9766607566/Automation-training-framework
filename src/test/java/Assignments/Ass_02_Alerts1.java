package Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_02_Alerts1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// Simple Alert
		driver.findElement(By.id("alertBtn")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//Confirmation Alert
		driver.findElement(By.id("confirmBtn")).click();
		Thread.sleep(2000);
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		//myalert.dismiss();
		
		//Prompt Alert
		driver.findElement(By.id("promptBtn")).click();
		Alert myalert2= driver.switchTo().alert();
		myalert2.sendKeys("This is Prompt Alert");
		Thread.sleep(3000);
		System.out.println(myalert2.getText());
		Thread.sleep(3000);
		myalert2.accept();

	}

}
