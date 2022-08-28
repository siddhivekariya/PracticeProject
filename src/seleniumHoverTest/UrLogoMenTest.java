package seleniumHoverTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class UrLogoMenTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vekar\\Desktop\\Java\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		
		WebElement dresses = driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(dresses).build().perform();
		
		Thread.sleep(2500);
		
		List<WebElement> allDresses = driver.findElements(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul/li/a"));
		System.out.println(allDresses.size());
		
		for(int i=0; i<allDresses.size(); i++){
			System.out.println(allDresses.get(i).getText());
		}

		driver.close();
	}

}
