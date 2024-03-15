package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CLICKANDHOLD {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.webdriveruniversity.com/Actions/index.html");
		
		WebElement max = driver.findElement(By.id("click-box"));
		
		Actions ACT = new Actions(driver);
	
		ACT.clickAndHold(max).build().perform();
		
		
		

	}

}
