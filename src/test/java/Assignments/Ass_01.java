package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_01 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size()+" Links");
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size()+" Images");
		
		driver.findElement(By.linkText("Cart")).click();
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Home ")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.partialLinkText("s6")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.id("signin2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("sign-username")).sendKeys("sharma962");
		driver.findElement(By.id("sign-password")).sendKeys("sharma962");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[id='signInModal'] div[class='modal-footer'] button:nth-child(1)")).click();
		
		driver.findElement(By.id("login2")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#loginusername")).sendKeys("sharma962");
		driver.findElement(By.cssSelector("#loginpassword")).sendKeys("sharma962");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[onclick='logIn()']")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.cssSelector("#logout2")).click();
		//driver.findElement(By.id("logout2")).click();
		//driver.findElement(By.linkText("Log out")).click();
		//driver.findElement(By.cssSelector("a[@id='logout2']")).click();
		driver.findElement(By.cssSelector("a[onclick='logOut()']")).click();
		
		
		
		
	}

}
