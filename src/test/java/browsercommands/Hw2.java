package browsercommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hw2 {

	public static void main(String[] args) {
	
     WebDriverManager.chromedriver().setup();
     
     ChromeDriver driver = new ChromeDriver(); 
     
     String url = "https://www.everstage.com/" ; 
     
     driver.get(url); 
     

	
     driver.getPageSource();
     System.out.println(driver.getPageSource());
     
     driver.getCurrentUrl(); 
     System.out.println(driver.getCurrentUrl());
	
     driver.getTitle();
     System.out.println(driver.getTitle());
     
     driver.close();
     
     driver.quit();
	}

}
