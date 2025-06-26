package Selenium_Test_D8;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Authentication_Alert_Popup {

	public static void main(String[] args) 
	//Main URL : https://the-internet.herokuapp.com/basic_auth
	//Enter Username and Pwd in popup - syntex : https://username:password@the-internet.herokuapp.com/basic_auth
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		

	}

}
