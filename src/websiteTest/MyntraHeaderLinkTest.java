package websiteTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyntraHeaderLinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vekar\\Desktop\\Java\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.myntra.com/"); 
		
		List<WebElement> hraderList = driver.findElements(By.xpath("//nav[@class='desktop-navbar']/div/div/div/a"));
		System.out.println(hraderList.size());
		
		for(int i=0; hraderList.size()>i; i++) {
			System.out.println(hraderList.get(i).getText());
		}
		
	}

}
