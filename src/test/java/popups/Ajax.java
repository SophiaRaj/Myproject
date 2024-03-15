package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajax {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.webdriveruniversity.com/Popup-Alerts/index.html");
			
	driver.findElement(By.id("button3")).click();
	
	Thread.sleep(8000); 
	
	driver.findElement(By.id("button1")).click();

	}

}
