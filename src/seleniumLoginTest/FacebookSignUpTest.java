package seleniumLoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUpTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vekar\\Desktop\\Java\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/"); 

		driver.findElement(By.xpath("//a[@rel='async']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Siddhi");
		driver.findElement(By.name("lastname")).sendKeys("Patel");
		driver.findElement(By.name("reg_email__")).sendKeys("siddhivekariya@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("siddhivekariya@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Patel@0101");
		
		WebElement dropbox = driver.findElement(By.id("month"));
		Select s = new Select(dropbox);
		s.selectByVisibleText("Oct");
		
		WebElement dropbox1 = driver.findElement(By.id("day"));
		Select e = new Select(dropbox1);
		e.selectByVisibleText("26");
		
		WebElement dropbox2 = driver.findElement(By.id("year"));
		Select l = new Select(dropbox2);
		l.selectByVisibleText("1995");
		
		
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("websubmit")).click();
		
		driver.close();
		
		
	}

}
