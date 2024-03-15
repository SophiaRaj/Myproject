package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import browsercommands.Chromedriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrm {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver() ;
		
		driver.get("https://www.saucedemo.com/");
		
	    driver.findElement(By.id("user-name")).sendKeys("error_user"); 
		
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce"); 
		
		driver.findElement(By.id("login-button")).click();


		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.partialLinkText("shopping_cart_link")).click();
		
		
	}

}
