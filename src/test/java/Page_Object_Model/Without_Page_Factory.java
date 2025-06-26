package Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Without_Page_Factory 
{
	WebDriver driver;
	Without_Page_Factory(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	By usertxt= By.name("username");
	By userpass= By.name("password");
	By loginbtn= By.xpath("//button[@type='submit']");
	
	//Actions methods
	
	public void setUser (String user)
	{
		driver.findElement(usertxt).sendKeys(user);
	}
	
	public void setPass (String pass)
	{
		driver.findElement(userpass).sendKeys(pass);
	}
	
	public void clickLogin()
	{
		driver.findElement(loginbtn).click();
	}
	
	

}
