package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MOVETOELEMENT {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.webdriveruniversity.com/Actions/index.html");
		
		WebElement drag = driver.findElement(By.xpath("//button[contains(text(),'Hover Over Me Third!')]"));
	
		
		Actions act = new Actions(driver);
		
		act.moveToElement(drag).build().perform(); 
		
	}

}
