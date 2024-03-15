package webelementcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FUtest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver() ; 
		driver.get("https://the-internet.herokuapp.com/upload");
		
	WebElement choosefile = driver.findElement(By.id("file-upload"));
	choosefile.sendKeys("C:\\Users\\ASUS\\Desktop/loan docum.txt");
	
	WebElement uploadfile = driver.findElement(By.id("file-submit"));
	uploadfile.click();
	}

}
