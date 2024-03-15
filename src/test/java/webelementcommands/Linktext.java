package webelementcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Linktext {

	public static void main(String[] args) {

	
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver() ; 
		driver.get("https://www2.hm.com/en_in/index.html");	
		
		driver.findElement(By.linkText("Ladies")).click();
		driver.findElement(By.partialLinkText("")).click();
	
		
		

	}

}
