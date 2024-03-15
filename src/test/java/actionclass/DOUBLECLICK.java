package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DOUBLECLICK {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.webdriveruniversity.com/Actions/index.html");
		
		WebElement dc = driver.findElement(By.id("double-click")); 
		
		Actions act = new Actions(driver); //give the driver control and use action class 
		
		act.doubleClick(driver.findElement(By.id("double-click"))).build().perform() ;
		

		

	}

}
