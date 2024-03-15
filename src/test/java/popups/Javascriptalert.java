package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascriptalert {

	public static void main(String[] args) {
   
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.webdriveruniversity.com/Popup-Alerts/index.html");
		
    driver.findElement(By.id("button1")).click();
    
    Alert popup = driver.switchTo().alert();
    
    popup.accept();
    
    String message = popup.getText();
    
    System.out.println(message);
    
   
    
	}

}
