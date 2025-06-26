package Selenium_Test_D8;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Alerts {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		// 1. Normal Alert with Ok button
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
		//if multiple alerts in one page then
		Alert myalert= driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		
		Thread.sleep(2000);
		
		// 2. Confirmation Alert
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(2000);
		System.out.println(myalert.getText());
		//myalert.accept();
		myalert.dismiss();
		
		Thread.sleep(2000);
		
		// 3. Prompt Alert
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(2000);
		System.out.println(myalert.getText());
		myalert.sendKeys("Selenium Automation");
		Thread.sleep(2000);
		myalert.accept();
		//myalert.dismiss();

	}

}
