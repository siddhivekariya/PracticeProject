package SuggestionList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipcartSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vekar\\Desktop\\Java\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("ipnone");
		
		Thread.sleep(2000);
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1']/li"));
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size(); i++){
			System.out.println(allLinks.get(i).getText());
		}
		
		
		
		

	}

}
