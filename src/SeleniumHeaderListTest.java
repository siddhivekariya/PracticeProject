import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumHeaderListTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vekar\\Desktop\\Java\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		
		
		List<WebElement> womenLinks = driver.findElements(By.xpath("//div[@id='block_top_menu']/ul/li/a"));
		System.out.println(womenLinks.size());
		
		for(int i=0; i<womenLinks.size(); i++) {
		System.out.println(womenLinks.get(i).getText());
		}
		
		driver.close();

	}

}
