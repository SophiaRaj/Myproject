package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Modalpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.webdriveruniversity.com/Popup-Alerts/index.html");
			
	driver.findElement(By.id("button2")).click();
	
 driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
 
 
	    

	}

}
