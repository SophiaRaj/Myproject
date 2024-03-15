package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascriptconfirm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.webdriveruniversity.com/Popup-Alerts/index.html");
			
	    driver.findElement(By.id("button4")).click();
	    
	    Alert popup = driver.switchTo().alert();
	    
	    popup.dismiss();
	    
	    String message = popup.getText();
	    
	    System.out.println(message);

	}

}
