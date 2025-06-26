package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class DragAndDropDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        Actions actions = new Actions(driver);

        // Map of capital IDs to country IDs
        Map<String, String> cityCountryMap = new HashMap<>();
        cityCountryMap.put("box1", "box101"); // Oslo -> Norway
        cityCountryMap.put("box2", "box102"); // Stockholm -> Sweden
        cityCountryMap.put("box3", "box103"); // Washington -> United States
        cityCountryMap.put("box4", "box104"); // Copenhagen -> Denmark
        cityCountryMap.put("box5", "box105"); // Seoul -> South Korea
        cityCountryMap.put("box6", "box106"); // Rome -> Italy
        cityCountryMap.put("box7", "box107"); // Madrid -> Spain

        // Loop through the map and perform drag and drop
        for (Map.Entry<String, String> entry : cityCountryMap.entrySet()) {
            WebElement capital = driver.findElement(By.id(entry.getKey()));
            WebElement country = driver.findElement(By.id(entry.getValue()));
            actions.dragAndDrop(capital, country).perform();
        }

    }
}
