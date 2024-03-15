package actionclass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import browsercommands.Chromedriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RIGHTCLICK {

	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/context_menu");
	
	WebElement sophia = driver.findElement(By.id("hot-spot"));
	
	Actions act = new Actions (driver); 
	
	act.contextClick(sophia).build().perform();
	
	Alert alt = driver.switchTo().alert(); 
	
	alt.accept(); 
	
	
	
	
	
	
	}

}
