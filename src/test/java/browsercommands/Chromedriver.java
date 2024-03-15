package browsercommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chromedriver {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();   //this is used to call the web browser
	WebDriver 	driver = new ChromeDriver();   // tells to create new web page 	
		
	String url = "https://www.ismeindia.org//";   // prints the url 
	
	Thread.sleep(4000);  // used to slow down the process
	
    driver.get(url); // get command
	
		
	System.out.println(driver.getTitle()); // get title to call the title of the website 
	       //or another way to store it in string 
	String title = driver.getTitle() ; 
	System.out.println(title);
	
	Thread.sleep(4000);
	driver.getCurrentUrl(); // get current url 
	System.out.println(driver.getCurrentUrl()); // get current url calls the current url 
	
	Thread.sleep(4000); // used to slow down the process
	
	driver.getPageSource();
	
	System.out.println(driver.getPageSource());
	
	driver.close(); //closes the window 
	
		

	}

}
