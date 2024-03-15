package keyschord;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keysclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://the-internet.herokuapp.com/key_presses");
	    
	    WebElement sof = driver.findElement(By.id("target"));
	    
	    sof.sendKeys("sophia"); 
	    Thread.sleep(6000);
	    sof.sendKeys(Keys.ENTER);
	    Thread.sleep(6000);
	    sof.sendKeys(Keys.chord(Keys.COMMAND ,"c"));
	    Thread.sleep(6000);
	    sof.sendKeys(Keys.BACK_SPACE); 
	    Thread.sleep(6000);
	    sof.sendKeys(Keys.chord(Keys.COMMAND,"v"));
	    Thread.sleep(6000);
	    driver.quit();
	}

}
