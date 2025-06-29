package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass_05_DragAndDrop {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		WebElement Oslo = driver.findElement(By.id("box1"));
		WebElement Stockholm = driver.findElement(By.id("box2"));
		WebElement Washington = driver.findElement(By.id("box3"));
		WebElement Copenhagen = driver.findElement(By.id("box4"));
		WebElement Seoul = driver.findElement(By.id("box5"));
		WebElement Rome = driver.findElement(By.id("box6"));
		WebElement Madrid = driver.findElement(By.id("box7"));
		
		
		WebElement Italy=driver.findElement(By.id("box106"));
		WebElement Spain=driver.findElement(By.id("box107"));
		WebElement Norway=driver.findElement(By.id("box101"));
		WebElement Denmark=driver.findElement(By.id("box104"));
		WebElement SK=driver.findElement(By.id("box105"));
		WebElement Sweden=driver.findElement(By.id("box102"));
		WebElement US=driver.findElement(By.id("box103"));
		
		Actions act= new Actions(driver);
		act.dragAndDrop(Oslo, Norway).dragAndDrop(Stockholm, Sweden).dragAndDrop(Washington, US).dragAndDrop(Copenhagen, Denmark).dragAndDrop(Seoul, SK).dragAndDrop(Rome, Italy).dragAndDrop(Madrid, Spain).perform();
		

	}

}
