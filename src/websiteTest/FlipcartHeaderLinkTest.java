package websiteTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipcartHeaderLinkTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vekar\\Desktop\\Java\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/"); 
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='_37M3Pb']/div/a"));
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());
		}

	}

}
