package websiteTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FreeCRMTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vekar\\Desktop\\Java\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ui.freecrm.com/");
		
		driver.findElement(By.name("email")).sendKeys("vekariyasiddhi@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Siddhi@26");
		WebElement loginBtn =
			 driver.findElement(By.xpath("//*[normalize-space(text()) = 'Login']"));
			 JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click();", loginBtn);
		
			 String expectedTitle = "Cogmento CRM";
			 String actualTitle = driver.getTitle();
			 System.out.println(actualTitle);
			 
			 if(expectedTitle.equals(actualTitle)) {
				 System.out.println("Test Pass");
			 }else {
				 System.out.println("Test fail");
			 }
			 
		 WebElement main = driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"));
		 
		 Actions builder = new Actions(driver);
			builder.moveToElement(main).build().perform();

		
	}

}
