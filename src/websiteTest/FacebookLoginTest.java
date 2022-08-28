package websiteTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\vekar\\Desktop\\Java\\SeleniumJars\\geckodriver.exe");
			//ClassName objet = new ClassName();
			FirefoxDriver driver = new FirefoxDriver(); //open firefox (constructor example
			driver.get("https://www.facebook.com"); 
			
			driver.findElement(By.name("email")).sendKeys("vekariyasiddhi@gmail.com");
			driver.findElement(By.name("pass")).sendKeys("vfghldbvf");
			driver.findElement(By.name("login")).click();

			Thread.sleep(3000);
			
			String expectedErr = "The password you’ve entered is incorrect. Forgot Password?";
			String actualErr = driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
			System.out.println(actualErr);
			
			if(expectedErr.equals(actualErr)) {
				System.out.println("Test pass");
			}else
			{
				System.out.println("test fail");
			}
	}

}
