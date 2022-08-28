package websiteTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiWindowsTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vekar\\Desktop\\Java\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();  
		driver.get("https://www.savvynewcanadians.com/get-paid-to-test-websites/");
		
		driver.findElement(By.linkText("TryMyUI")).click();
		Thread.sleep(2000);
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		Iterator<String> itr = allWindows.iterator();
		String parentWindow = itr.next();
		String childWindow = itr.next();
		
		System.out.println(parentWindow);
		System.out.println(childWindow);
		
		Thread.sleep(3000);
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		driver.close();
		

		Thread.sleep(3000);
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		driver.close();
		
		
		
	}

}
