package navigationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigationcommands {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver() ; // new chrome 
				
				
	driver.get("https://www.ismeindia.org/"); // get url 
	
	driver.navigate().to("https://www.amazon.in/");  // go to the page 
	
	driver.navigate().forward(); // used to go forward page
	
	driver.navigate().back();   //backward page
	
	driver.navigate().refresh();  // refresh the page 
	
	driver.getPageSource();
	
	driver.quit(); // quit the screen
	}

}
