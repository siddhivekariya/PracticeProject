package websiteTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultiBrowserTest {

	public static void main(String[] args) {
		WebDriver driver;
		String browser = "Firefox";
		
		
		if(browser.equals("chrome")) {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\vekar\\Desktop\\Java\\SeleniumJars\\ chromedriver.exe");
		driver = new ChromeDriver();
		}else if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\vekar\\Desktop\\Java\\SeleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else {
			System.setProperty("WebDriver.chrome.driver", "C:\\Users\\vekar\\Desktop\\Java\\SeleniumJars\\safaridriver.exe");
			driver = new SafariDriver();
		}
		
		driver.get("https://www.aldoshoes.com/ca/en");
	}

}
