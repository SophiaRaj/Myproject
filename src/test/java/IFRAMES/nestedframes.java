package IFRAMES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nestedframes {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");
		
	

		int sizee = driver.findElements(By.tagName("iframe")).size(); //fetches the no of frames ; 
		
		System.out.println(sizee);
		
		WebElement parentframe = driver.findElement(By.tagName("frame1"));
		
		driver.switchTo().frame(parentframe); 
		
		WebElement childframe = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(childframe);

		
		driver.switchTo().defaultContent(); 
		
		
	}

}
