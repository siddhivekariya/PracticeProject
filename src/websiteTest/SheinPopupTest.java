package websiteTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SheinPopupTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vekar\\Desktop\\Java\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://ca.shein.com/Girls-Hooded-High-Low-Hem-Belted-Coat-p-3876581-cat-2004.html?url_from=caadplask2108311433353168110_ssc&cid=1894641337&setid=70874310435&adid=348020661499&pf=GOOGLE&gclid=CjwKCAjw2f-VBhAsEiwAO4lNeAwXK7Bdiurl4eTH_rzk2HI790iKHXs5_S2Pb3FzE92nzQhMdcfppRoC9RYQAvD_BwE");

		Thread.sleep(2000);
		List<WebElement> popup1 = driver.findElements(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/i[1]"));
		System.out.println(popup1.size());
		
		if(popup1.size()>0) {
			popup1.get(0).click();
		}
		
		Thread.sleep(2000);
		
		List<WebElement> popup2 = driver.findElements(By.xpath("//div[contains(text(),'GET 10% OFF')]"));
		System.out.println(popup2.size());
		
		if(popup2.size()>0) {
			popup2.get(0).click();
		} 
		driver.findElement(By.name("header-search")).sendKeys("Purse");
		driver.findElement(By.name("header-search")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//a[contains(text(),'Quilted Tassel Decor Coin Purse')]")).click();
		
	}

}
