package websiteTest;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkTestOfUtestWebsite {
	WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vekar\\Desktop\\Java\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		//driver.get("https://everstylish.com/");
		driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
	//	driver.findElement(By.linkText("About Us")).click();
		
	//	wait.until(ExpectedConditions.urlToBe("https://everstylish.com/about"));
	//	String expectedUrl = "https://everstylish.com/about";
	//	String actualUrl = driver.getCurrentUrl();
	//	System.out.println(actualUrl);
		String expectedUrl = "Amazon Sign In";
		
		String title = driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", title);
		if(expectedUrl.equals(title)){
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Fail");
		}
	//	driver.close();
	}

}
