package Cssselectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cssxpathcss {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		
	WebElement type =	driver.findElement(By.cssSelector("input[value = oneway]"));
	System.out.println(type.isSelected());	
	type.click();
		

	}

}
