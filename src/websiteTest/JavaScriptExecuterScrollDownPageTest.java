package websiteTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptExecuterScrollDownPageTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vekar\\Desktop\\Java\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();  
		driver.get("https://www.adidas.ca/en");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement contactUs = driver.findElement(By.linkText("Contact Us"));
		
	//	jse.executeScript(argument, args)

	}

}
