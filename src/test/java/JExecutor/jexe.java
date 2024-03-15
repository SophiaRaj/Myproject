package JExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jexe {

	public static void main(String[] args) throws InterruptedException{

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://html.com/input-type-file/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("windows.scrollTo(0,1000)"); 
		
  
		
		jse.executeScript("windows.scrollTo(0,-1500)"); 

	}

}
