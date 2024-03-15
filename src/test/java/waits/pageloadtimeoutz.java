package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pageloadtimeoutz {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	driver.navigate().to("https://www2.hm.com/en_in/index.html");
	}

}
