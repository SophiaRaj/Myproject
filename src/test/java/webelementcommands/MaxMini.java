package webelementcommands;

import java.awt.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MaxMini {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver() ; 
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		// for maximize screen size 
		
		driver.manage().window().maximize();
		
		// for minimize size 
		
		System.out.println(driver.manage().window().getSize()); // this prints the size 
		Dimension d = new Dimension (200,200);
		
		
		// position
		System.out.println(driver.manage().window().getPosition());
		Point p = new Point (2,2);
		driver.manage().window().setPosition(p);
	}

}
