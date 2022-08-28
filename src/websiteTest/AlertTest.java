package websiteTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vekar\\Desktop\\Java\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();  
		driver.get("https://www.softwaretestingo.com/print-auto-suggestion-list-selenium/");
		
		Thread.sleep(3000);
		driver.findElement(By.id("normal-slidedown"));

		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		
		al.accept();


	}

}
