package webelementcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	public static void main(String[] args) {
	
		
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver() ; 

driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

driver.findElement(By.id("gender-female")).click();


driver.findElement(By.id("FirstName")).sendKeys("sophia");
driver.findElement(By.id("LastName")).sendKeys("Rajendran");

WebElement dropdown = driver.findElement(By.name("DateOfBirthDay"));

Select sel = new Select (dropdown);

sel.selectByValue("17");    // select by value 

/////

WebElement dropdown1 = driver.findElement(By.name("DateOfBirthMonth"));

Select sel1 = new Select (dropdown1);

sel1.selectByValue("12");    // select by value 

////
WebElement dropdown11 = driver.findElement(By.name("DateOfBirthYear"));

Select sel11 = new Select (dropdown11);

sel11.selectByValue("1997");    // select by value 

////



}

	

	}


