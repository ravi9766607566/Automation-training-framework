package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_08_Upload_File {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Select Single File
		driver.findElement(By.id("singleFileInput")).sendKeys("D:\\Study Materials_Ravi\\UC Uncodmy Class_Ravi\\API Class\\API Topics.txt");
		driver.findElement(By.xpath("//button[text()='Upload Single File']")).click();
		
		// Select Multiple Files
		driver.findElement(By.id("multipleFilesInput")).sendKeys("D:\\Study Materials_Ravi\\UC Uncodmy Class_Ravi\\API Class\\API POSTMAN Notes.txt");
		driver.findElement(By.id("multipleFilesInput")).sendKeys("D:\\Study Materials_Ravi\\UC Uncodmy Class_Ravi\\API Class\\Mapping.csv");
		driver.findElement(By.xpath("//button[text()='Upload Multiple Files']")).click();

	}

}
