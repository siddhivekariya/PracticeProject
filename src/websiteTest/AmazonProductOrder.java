package websiteTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonProductOrder {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vekar\\Desktop\\Java\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&"); 

		//Login
		driver.findElement(By.id("ap_email")).sendKeys("vekariyasiddhi22@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Veksid01!");
		driver.findElement(By.id("signInSubmit")).click();
		
		String actualurl = "Amazon.ca: Low Prices – Fast Shipping – Millions of Items";
		String expectedUrl= driver.getTitle();
		System.out.println(expectedUrl);
		
		if(actualurl.equals(expectedUrl)) {
			System.out.println("test pass");
		}else {
			System.out.println("test fail");
		}
		
		//search product
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watch");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
		//verify user is on product page
		String watchexpectedTitle = "Amazon.ca: Low Prices – Fast Shipping – Millions of Items";
		String watchActualTitle = driver.getTitle();
		System.out.println(watchActualTitle);
		
		if(watchexpectedTitle.equals(watchActualTitle)) {
			System.out.println("pass");
		}else {System.out.println("fail");}
		
		
		//Select and add to cart
		driver.get("https://www.amazon.ca/Amazon-Essentials-Gold-Tone-AE-1000WTBN/dp/B07YQFY57B/ref=sr_1_1_sspa?crid=2DQ3AVPA88MLU&keywords=watch&qid=1661619458&sprefix=watch%2Caps%2C112&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEyNE1HTVNIV09UR001JmVuY3J5cHRlZElkPUEwNDMwMjQ3M1M2Mk0zS0ZNT09TOCZlbmNyeXB0ZWRBZElkPUEwMzAxNDkzOUxTSU1aWFBHWFBPJndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==");
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		
		String expAddToCartTitle = "Amazon.ca Shopping Cart";
		String actAddToCartTitle = driver.getTitle();
		System.out.println(actAddToCartTitle);
		if(actAddToCartTitle.equals(expAddToCartTitle)) {
			System.out.println("test pass");
		}else {
			System.out.println("test fail");
			}
		
		//procced to checkout
		driver.findElement(By.name("proceedToRetailCheckout")).click();
		
		//verify on checkout page
		String actulTitle = "Enter the shipping address for this order";
		String expectedTitle= driver.getTitle();
		System.out.println(expectedTitle);
		
		if(actulTitle.equals(expectedTitle)) {
			System.out.println("test pass");
		}else {
			System.out.println("test fail");
			}
	}

}
