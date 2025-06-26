package Selenium_Test_D14;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Uploads {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Single File Upload
		//driver.findElement(By.id("filesToUpload")).sendKeys("D:\\Study Materials_Ravi\\API\\API Postman code.txt");
		
		// Multiple File Upload
		//Approch:01
		driver.findElement(By.id("filesToUpload")).sendKeys("D:\\Study Materials_Ravi\\API\\API Postman code.txt");
		driver.findElement(By.id("filesToUpload")).sendKeys("D:\\Study Materials_Ravi\\API\\New 40.4 PROD APIs.xlsx");
		driver.findElement(By.id("filesToUpload")).sendKeys("D:\\Study Materials_Ravi\\API\\ODM Import using Postman.docx");
		driver.findElement(By.id("filesToUpload")).sendKeys("D:\\Study Materials_Ravi\\Manual Testing Notes\\Agile methology.JPEG");
		
		//Approch:02
//		String path_1="D:\\Study Materials_Ravi\\API\\API Postman code.txt";
//		String path_2="D:\\Study Materials_Ravi\\API\\New 40.4 PROD APIs.xlsx";
//		String path_3="D:\\Study Materials_Ravi\\API\\ODM Import using Postman.docx";
//		String path_4="D:\\Study Materials_Ravi\\Manual Testing Notes\\\\Agile methology.JPEG";
//		driver.findElement(By.id("filesToUpload")).sendKeys(path_1+"\n"+path_2+"\n"+path_3+"\n"+path_4);
		
		//Validate/Verify files and print message
		List<WebElement> list=driver.findElements(By.xpath("//ul[@id='fileList']/li"));
		
		if(list.size()==4)
		{
			if (list.get(0).getText().equals("API Postman code.txt") && list.get(1).getText().equals("New 40.4 PROD APIs.xlsx") && list.get(2).getText().equals("ODM Import using Postman.docx") && list.get(3).getText().equals("Agile methology.JPEG"));
			{
				System.out.println("All Files Uploaded Successfully");
			}
//			else
//			{
//				System.out.println("All Files Not Uploaded Successfully");
//			}
		}else
		{
			System.out.println("All Files Not Uploaded");
		}
	}

}
