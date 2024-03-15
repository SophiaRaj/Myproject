package webelementcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver() ; 

		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

		driver.findElement(By.id("gender-female")).click();


		driver.findElement(By.id("FirstName")).sendKeys("sophia");
		driver.findElement(By.id("LastName")).sendKeys("Rajendran");

	WebElement dropdown1 = driver.findElement(By.name("DateOfBirthDay")); 
	
	Select sel1 = new Select (dropdown1); 
	
	sel1.selectByValue("17");
	
	
	WebElement dropdown2 = driver.findElement(By.name("DateOfBirthMonth"));
	
	Select sel2 = new Select (dropdown2);
	
	sel2.selectByVisibleText("December");
	
	WebElement dropdown3 = driver.findElement(By.name("DateOfBirthYear"));
	
	Select sel3 = new Select (dropdown3); 
	
	sel3.selectByVisibleText("1997");
	
	driver.findElement(By.id("Email")).sendKeys("rsophia1997@gmail.com"); 


	driver.findElement(By.id("Company")).sendKeys("Innovative scientific research professional");

	driver.findElement(By.id("true")).click();


	driver.findElement(By.id("Password")).sendKeys("bowbow"); 
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Chase@1997"); 


	driver.findElement(By.id("register-button")).click();
	
	

	}}