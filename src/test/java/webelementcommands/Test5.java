package webelementcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5 {

	public static void main(String[] args) {
	
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    
   driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
   
   driver.navigate().to("https://www.amazon.in/");
   
   driver.navigate().back();
   
   driver.findElement(By.id("gender-female")).click();
   driver.findElement(By.name("FirstName")).sendKeys("Sophia");
   driver.findElement(By.name("LastName")).sendKeys("Rajendran");
   
   WebElement dropdown1 = driver.findElement(By.name("DateOfBirthDay")); 
	
	Select sel1 = new Select (dropdown1); 
	
	sel1.selectByValue("17");
	
  WebElement dropdown2 = driver.findElement(By.name("DateOfBirthMonth"));
  Select sel2 = new Select (dropdown2);
  sel2.selectByVisibleText("December");
  
  WebElement dropdown3 = driver.findElement(By.name("DateOfBirthYear"));
  Select sel3 = new Select (dropdown3);
  sel3.selectByVisibleText("1997");
  
  driver.findElement(By.id("Email")).sendKeys("rsof1997@gmail.com");
  
  driver.findElement(By.id("Company")).sendKeys("isrpm");
  
  driver.findElement(By.id("Newsletter")).click();
	}

}
