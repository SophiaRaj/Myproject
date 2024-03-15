package Cssselectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class idbycss {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();   //this is used to call the web browser
		WebDriver 	driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.cssSelector("#user-name")).sendKeys("visual_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce"); 
		driver.findElement(By.cssSelector("#login-button")).click(); 
		
	}
	

}
