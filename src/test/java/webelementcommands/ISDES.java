package webelementcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ISDES {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver() ; 

		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

WebElement checking = driver.findElement(By.id("Newsletter"));
checking.isEnabled();
System.out.println(checking.isEnabled());

WebElement checking1 = driver.findElement(By.id("Newsletter"));
checking1.isDisplayed();
System.out.println(checking1.isDisplayed());

WebElement checking2 = driver.findElement(By.id("Newsletter"));
checking2.isSelected();
System.out.println(checking2.isSelected());



	}

}
