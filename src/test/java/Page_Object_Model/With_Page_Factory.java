package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class With_Page_Factory 
{
	WebDriver driver;
	
	With_Page_Factory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	@FindBy(name="username")
	WebElement txtuser;
	
	@FindBy(name="password")
	WebElement txtpass;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbtn;
	
	public void setUser(String user)
	{
		txtuser.sendKeys(user);
	}
	
	public void setpass(String pass)
	{
		txtpass.sendKeys(pass);
	}
	
	public void clickLogin()
	{
		loginbtn.click();
	}

}
