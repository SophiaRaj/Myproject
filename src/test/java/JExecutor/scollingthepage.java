package JExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scollingthepage {

public static void main(String[] args) {

          System.setProperty("webdriver.gecko.driver","D://Selenium    Environment//Drivers//geckodriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("https://www.amazon.in/");

          
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,350)", "");
         }
      

	}



