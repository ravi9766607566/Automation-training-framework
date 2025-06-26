package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_03_Verify_Dropdown_Elements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[contains(@class, 'multiselect-se')]")).click();
		
		
		//Select value and verify 3 elements selected or not	
		
//		List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label[@class='checkbox']"));
//		for(WebElement opt:options)
//		{
//			if(opt.getText().equals("Python"))
//			{
//				opt.click();
//			}		
//		}
		
		driver.findElement(By.xpath("//input[@value='Python']")).click();
		
		String all_opt=driver.findElement(By.xpath("//span[contains(@class, 'multiselect-se')]")).getText();
		if(all_opt.contains("Python") && all_opt.contains("HTML") && all_opt.contains("CSS"))
		{
			System.out.println(all_opt+": Input Verified");
		}
		else
		{
			System.out.println("Input Incorrect");
		}
	}

}
