package browsercommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Homework1 {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	 String url = "https://www.easemytrip.com/" ; 
	 driver.get(url);
	 
driver.getTitle();
System.out.println(driver.getTitle());

driver.getCurrentUrl();
System.out.println(driver.getCurrentUrl());

driver.getPageSource();
System.out.println(driver.getPageSource());

driver.close();
driver.quit();
	 
		
		

}
}