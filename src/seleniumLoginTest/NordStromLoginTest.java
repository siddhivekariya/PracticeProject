package seleniumLoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NordStromLoginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vekar\\Desktop\\Java\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.nordstrom.ca/signin?cm_sp=SI_SP_A-_-SI_SP_B-_-SI_SP_C&origin=tab&ReturnURL=");
		
		driver.findElement(By.name("email")).sendKeys("sdfghjkl");
		driver.findElement(By.id("account-check-next-button")).click();
		
		Thread.sleep(5000);
		
		String expected = "Enter the email address like this: name@email.com";
		WebElement actualErrMsg = driver.findElement(By.xpath("//p[contains(text(),'Enter the email address like this: name@email.com')]"));
		System.out.println(actualErrMsg);
		
		if(expected.equals(actualErrMsg))
			
	{
			System.out.println("Test Pass");
	}else {
		System.out.println("Test Fail");
	}
		
		driver.close();

	}

}
