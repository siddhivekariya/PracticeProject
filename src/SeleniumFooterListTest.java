import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFooterListTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vekar\\Desktop\\Java\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ultimateqa.com/complicated-page");
		
		List<WebElement> allList = driver.findElements(By.xpath("//ul[@id='menu-footer-menu']/li/a"));
		System.out.println(allList.size());

		for(int i=0; i<allList.size(); i++){
			System.out.println(allList.get(i).getText());
		}
		
		driver.close();
	}

}
