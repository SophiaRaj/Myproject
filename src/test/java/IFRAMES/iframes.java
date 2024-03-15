package IFRAMES;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class iframes {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		
		WebElement sof = driver.findElement(By.id("frame1"));

		int sizee = driver.findElements(By.tagName("iframe")).size(); //fetches the no of frames ; 
		
		System.out.println(sizee);
		
		driver.switchTo().frame(sof);
		
		String max = driver.findElement(By.id("sampleHeading")).getText(); 
		
		System.out.println(max);
	}

}
