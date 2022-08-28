package seleniumLoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YourLogoLoginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vekar\\Desktop\\Java\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.findElement(By.id("email")).sendKeys("vekariyasiddhi@gamil.com");
		driver.findElement(By.id("passwd")).sendKeys("sdfghmj");
		driver.findElement(By.id("SubmitLogin")).click();
		
		Thread.sleep(3000);
		String expectedErrMsg = "There is 1 error";
		String actualErrMsg = driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/p[1]")).getText();
		System.out.println(actualErrMsg);
		
		if(expectedErrMsg.equals(actualErrMsg)) {
			System.out.println("We got err msg");
		}else {
			System.out.println("No msg :(");
		}
		
		String expectedErrMsg1 = "Authentication failed.";
		String actualErrMsg1 = driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/ol[1]/li[1]")).getText();
		System.out.println(actualErrMsg1);
		
		if(expectedErrMsg1.equals(actualErrMsg1)) {
			System.out.println("We got err msg of authenctiation");
		}else {
			System.out.println("No msg for authenctiation :(");
		}
		
		driver.close();
	}

}
