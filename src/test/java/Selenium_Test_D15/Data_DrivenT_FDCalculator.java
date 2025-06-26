package Selenium_Test_D15;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Data_DrivenT_FDCalculator {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		
		String path= System.getProperty("user.dir")+"\\TestData\\FDCal.xlsx";
		int rows= ExcelUtils.getRowCount(path, "Sheet1");
		
		for(int i=1; i<=rows; i++)
		{
			//read data from excel
			String princ= ExcelUtils.getCellData(path, "Sheet1", i, 0);
			String rateofIntrest= ExcelUtils.getCellData(path, "Sheet1", i, 1);
			String Per1= ExcelUtils.getCellData(path, "Sheet1", i, 2);
			String per2= ExcelUtils.getCellData(path, "Sheet1", i, 3);
			String freq= ExcelUtils.getCellData(path, "Sheet1", i, 4);
			String exp_mat= ExcelUtils.getCellData(path, "Sheet1", i, 5);
			
			driver.findElement(By.id("principal")).sendKeys(princ);
			driver.findElement(By.id("interest")).sendKeys(rateofIntrest);
			driver.findElement(By.id("tenure")).sendKeys(Per1);
			
			Select dropPer= new Select(driver.findElement(By.id("tenurePeriod")));
			dropPer.selectByVisibleText(per2);
			Select dropFre= new Select(driver.findElement(By.id("frequency")));
			dropFre.selectByVisibleText(freq);
			
			List<WebElement> button= driver.findElements(By.xpath("//div[@class='CTR PT15']/a"));
			button.get(0).click();
			
			String act_val= driver.findElement(By.xpath("//span[@id='resp_matval']/strong")).getText();
			
			if(Double.parseDouble(exp_mat)==Double.parseDouble(act_val))
			{
				System.out.println("Test Passed");
				ExcelUtils.setCellData(path, "Sheet1", i, 7, "Passed");
				ExcelUtils.fillGreenColor(path, "Sheet1", i, 7);
			}else
			{
				System.out.println("Test Failed");
				ExcelUtils.setCellData(path, "Sheet1", i, 7, "Failed");
				ExcelUtils.fillRedColor(path, "Sheet1", i, 7);
			}
			button.get(1).click();	
			//driver.navigate().refresh();
		}
		driver.quit(); 
	}

}
