package seleniumLoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RogersLoginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vekar\\Desktop\\Java\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.rogers.com/consumer/profile/signin");
		
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("cvbnjkllkjhgvfvgbhjkl");
		driver.findElement(By.id("password")).sendKeys("sdfvg");
		driver.findElement(By.xpath("//button[@title='Sign in']")).click();
		
		Thread.sleep(2000);
		String expectedErrMsg = "Username and/or password is not recognized. Don’t remember? Try Forgot username or Forgot password.";
		String actualErrMsg = driver.findElement(By.xpath("//p[@class='text-body mb-0 mw-content']")).getText();
		System.out.println(actualErrMsg);
		
		if(expectedErrMsg.equals(actualErrMsg)) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Fail");
		}
		
		driver.quit();
		
		
		

	}

}
