package Assignments;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Selenium_Test_D9.Select_Dropdown;

public class Automation_Testing_Practice {
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Name, Email, Phone (Textbox)
		driver.findElement(By.id("name")).sendKeys("Ravi Sharma");
		driver.findElement(By.id("email")).sendKeys("ravisharma183@live.com");
		driver.findElement(By.id("phone")).sendKeys("9766607566");
		
		//Address (Textarea)
		driver.findElement(By.id("textarea")).sendKeys("Ganesh Nagar, Wadgaon Sheri, Pune, Maharastra 411014");
		
		// Gender (Radio Button)
		driver.findElement(By.name("gender")).click();
		
		// Days (MultiSelect Checkbox)
		List<WebElement> checkbox = driver.findElements(By.xpath("//div[@class='form-group'][4]//label[@class='form-check-label']"));
		for(WebElement check:checkbox)
		{
			if(check.getText().equals("Monday") || check.getText().equals("Wednesday") || check.getText().equals("Friday"))
			{
				check.click();
			}
		}
		
		// Country (Dropdown list)
		WebElement dropcountry = driver.findElement(By.id("country"));
		Select drop=new Select(dropcountry);
		drop.selectByVisibleText("India");
		
		//Colors and Sorted List (Select Listbox)
		WebElement colors1=driver.findElement(By.id("colors"));
		Select colors2=new Select(colors1);
		colors2.selectByIndex(0);
		colors2.selectByIndex(2);

		WebElement shortlist=driver.findElement(By.id("animals"));
		Select shortli = new Select(shortlist);
		shortli.selectByVisibleText("Cheetah");
		shortli.selectByVisibleText("Dog");
		shortli.selectByVisibleText("Lion");
		
		//Date Picker 1
		String date = "28";
		String month = "April";
		String year = "2020";
		driver.findElement(By.id("datepicker")).click();
		while(true)
		{
			String currmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String curryear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(currmonth.equals(month) && curryear.equals(year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		
		List<WebElement> dat=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
		for(WebElement dt:dat)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
		
		// Date Picker 2
		String date2="28";
		String month2="Apr";
		String year2="2021";
		driver.findElement(By.id("txtDate")).click();
		
		WebElement currmonth2=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select mondrop2=new Select(currmonth2);
		mondrop2.selectByVisibleText(month2);
		
		WebElement curryear2=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select yerdrop2=new Select(curryear2);
		yerdrop2.selectByVisibleText(year2);
		
		List<WebElement> dat2=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
		for(WebElement dt2:dat2)
		{
			if(dt2.getText().equals(date2))
			{
				dt2.click();
				break;
			}
		}
		
		//Subscribe to:
		driver.findElement(By.xpath("//a[@class='feed-link']")).click();
		Thread.sleep(3000);
		Set<String> WinId = driver.getWindowHandles();
		for(String Win:WinId)
		{
			String Title= driver.switchTo().window(Win).getTitle();
			if(Title.contains("Automation Testing Practice"))
			{
				break;
			}		
		}
		
		
		//Upload Single Files
		driver.findElement(By.id("singleFileInput")).sendKeys("D:\\Study Materials_Ravi\\API\\API Postman code.txt");
		driver.findElement(By.xpath("//button[text()='Upload Single File']")).click();
		
		//Upload Multiple Files
		driver.findElement(By.id("multipleFilesInput")).sendKeys("D:\\Study Materials_Ravi\\API\\API Postman code.txt");
		driver.findElement(By.id("multipleFilesInput")).sendKeys("D:\\Study Materials_Ravi\\API\\New 40.4 PROD APIs.xlsx");
		driver.findElement(By.id("multipleFilesInput")).sendKeys("D:\\Study Materials_Ravi\\API\\ODM Import using Postman.docx");
		driver.findElement(By.id("multipleFilesInput")).sendKeys("D:\\Study Materials_Ravi\\Manual Testing Notes\\Agile methology.JPEG");
		driver.findElement(By.xpath("//button[text()='Upload Multiple Files']")).click();
		
		
		//Static Web Table
		int rows= driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr")).size();
		int cols= driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th")).size();
		
		for(int r=1; r<=rows; r++)
		{
			for(int c=1; c<=cols; c++)
			{
				if(r==1)
				{
					String text=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/th["+c+"]")).getText();
					System.out.print(text+"\t");
				}
				else
				{
					String text=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td["+c+"]")).getText();
					System.out.print(text+"\t");
				}
			}
			System.out.println();
		}
		
		// Form Section 1
		driver.findElement(By.id("input1")).sendKeys("This is a paragraph in Section 1.");
		driver.findElement(By.id("btn1")).click();
		
		// Section 2
		driver.findElement(By.id("input2")).sendKeys("This is a paragraph in Section 2.");
		driver.findElement(By.id("btn2")).click();
		
		// Section 3
		driver.findElement(By.id("input3")).sendKeys("This is a paragraph in Section 3.");
		driver.findElement(By.id("btn3")).click();
		
	}
}
