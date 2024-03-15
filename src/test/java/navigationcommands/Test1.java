package navigationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import browsercommands.Chromedriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.sonsaur.com/?gclid=Cj0KCQiAmNeqBhD4ARIsADsYfTcdHFUxdiiH1B13yUaJVzj9pnWCuO72lY3vydJ7LjQPSJSaTM-aBcEaAhy-EALw_wcB");
	
	driver.navigate().to("https://www.amazon.in/");
	
	driver.navigate().forward();
	
	driver.navigate().back();
	
	driver.navigate().refresh();
	
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
