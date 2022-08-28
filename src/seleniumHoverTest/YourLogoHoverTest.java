package seleniumHoverTest;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class YourLogoHoverTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vekar\\Desktop\\Java\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		
		WebElement Women = driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[1]"));
		
		Actions hover = new Actions(driver);
		hover.moveToElement(Women).build().perform();
		
		Thread.sleep(2500);
		List<WebElement> allWomentList = driver.findElements(By.xpath("//div[@id='block_top_menu']/ul/li/a"));
		System.out.println(allWomentList.size());
		
		for(int i=0; i<allWomentList.size(); i++) {
			System.out.println(allWomentList.get(i).getText());
		}
		
		driver.close();

	}

}
