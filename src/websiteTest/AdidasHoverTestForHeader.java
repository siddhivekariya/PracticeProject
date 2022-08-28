package websiteTest;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AdidasHoverTestForHeader {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vekar\\Desktop\\Java\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://www.adidas.ca/en/account-login");
		
		Thread.sleep(3000);
		WebElement men = driver.findElement(By.xpath("//div[@class='main-menu___1xu8m']/div[1]"));
		
		Actions menlinks = new Actions(driver);
		menlinks.moveToElement(men).build().perform();
		
		Thread.sleep(3000);
		List<WebElement> allmenlinks = driver.findElements(By.xpath("(//div[@class='main-line']/div)[1]/ul/li"));
		System.out.println(allmenlinks.size());
		
		//driver.close();
		
	
		
	}

}
