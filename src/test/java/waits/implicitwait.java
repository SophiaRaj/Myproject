package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicitwait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
	driver.get("https://malaysiavisa.imi.gov.my/evisa/evisa.jsp");

	}

}
