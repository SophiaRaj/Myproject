package projects;

import java.sql.Driver;
import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ISME {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver() ;
		
		driver.get("https://www.ismeindia.org/");	
		
		Thread.sleep(8000); 
		
        driver.findElement(By.className("UFLd32")).click();
        
        driver.manage().window().maximize(); 
        
		
	
	}

}
