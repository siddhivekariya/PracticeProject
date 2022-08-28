package seleniumLoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import graphql.Assert;



public class AmazonLoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vekar\\Desktop\\Java\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&"); 

		String acualurl = "Amazon Sign In";
		String expectedurl= driver.getTitle();
		System.out.println(expectedurl);
		
		if(acualurl.equals(expectedurl)) {
			System.out.println("test pass");
		}else {
			System.out.println("test fail");
		}
		driver.findElement(By.id("ap_email")).sendKeys("vekariyasiddhi@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Siddhi@26");
		driver.findElement(By.id("signInSubmit")).click();
		
		String actualurl = "Amazon.ca: Low Prices – Fast Shipping – Millions of Items";
		String expectedUrl= driver.getTitle();
		System.out.println(expectedUrl);
		
		if(actualurl.equals(expectedUrl)) {
			System.out.println("test pass");
		}else {
			System.out.println("test fail");
		}
		
		driver.quit();
	
	}

}
