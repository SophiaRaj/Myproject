package webelementcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fileuploads {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
driver.navigate().refresh()		;
WebElement choose = driver.findElement(By.id("file-upload"));
choose.sendKeys("C:\\Users\\ASUS\\Desktop/sofa.txt");




WebElement upload=driver.findElement(By.id("file-submit"));

upload.click();
	}

}
