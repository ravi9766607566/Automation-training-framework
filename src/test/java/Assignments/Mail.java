package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mail {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=175&ct=1744200421&rver=7.5.2211.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26cobrandid%3dab0455a0-8d03-46b9-b18b-df2f57b9e44c%26deeplink%3dowa%252f0%252f%253fstate%253d1%2526redirectTo%253daHR0cHM6Ly9vdXRsb29rLmxpdmUuY29tL21haWwvMC8%26RpsCsrfState%3dedb9911d-3721-985a-ed86-78b251c8662f&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=ab0455a0-8d03-46b9-b18b-df2f57b9e44c");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='usernameEntry']")).sendKeys("ravisharma183@live.com");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.xpath("//input[@id='passwordEntry']")).sendKeys("Yahoo183@");
		//driver.findElement(By.xpath("//button[text()='Next']")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		

	}

}
