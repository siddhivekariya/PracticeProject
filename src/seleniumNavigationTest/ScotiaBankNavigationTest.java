package seleniumNavigationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScotiaBankNavigationTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vekar\\Desktop\\Java\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("https://auth.scotiaonline.scotiabank.com/online?oauth_key=23iIcbmQQa4&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5nb29nbGUuY29tXC8iLCJvYXV0aF9rZXkiOiIyM2lJY2JtUVFhNCIsImNvbnNlbnRfcmVxdWlyZWQiOmZhbHNlLCJyZWRpcmVjdF91cmkiOiJodHRwczpcL1wvd3d3LnNjb3RpYW9ubGluZS5zY290aWFiYW5rLmNvbVwvb25saW5lXC9sYW5kaW5nXC9vYXV0aGxhbmRpbmcuYm5zIiwiZXhwIjoxNjU1NzkxNTUxLCJpYXQiOjE2NTU3OTAzNTEsImp0aSI6Ijg0ODcxMTBhLTYyZGEtNDM3Ny05NjFlLTM4NzY5ZTUzYmJkOSIsImNsaWVudF9pZCI6IjhlZTkwYzM5LTFjNTItNGZmNC04YWU2LWE3YjU0YzUzOTkzMyIsImNsaWVudF9tZXRhZGF0YSI6eyJDaGFubmVsSUQiOiJTT0wiLCJBcHBsaWNhdGlvbkNvZGUiOiJINyJ9LCJpc3N1ZXIiOiJodHRwczpcL1wvcGFzc3BvcnQuc2NvdGlhYmFuay5jb20ifQ.RQs2IdfpLYMr17pNK5d_YBYC2IVMGbwzRP51QfB0G75KjFp0uxgeNdbOEkLxgmOP9qCn52vufDIhY4FrQ_RyvxbKnNGM8w7crzNWwrORPHEmVxNSF_Bp_n59Xu_PODU9jFeangefVeh0P0_dknWJBuul-PX_29Dd_kAYJFfBUL1P98sRTSDBay42DVM6rAHCBTyAI9ojv1_pDC9E7FUuzOX9rfWZRtYZPce858s2FValdAUZtMsJT0QNdZom-jX6QFi2jSIo5icyaV8v4hNgaN9ieQbgWH7PIdxGYBvM1bADCtf5DsglrNEcWVD5Klxvf75PBAbzcadSpclMba0WVA&preferred_environment="); 
		 Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Need help signing in?')]")).click();
		
		Thread.sleep(5000);
		
		//String wantedURL = "https://auth.scotiaonline.scotiabank.com/recovery/landing?lng=en-US&oauth_key=23iIcbmQQa4&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5nb29nbGUuY29tXC8iLCJvYXV0aF9rZXkiOiIyM2lJY2JtUVFhNCIsImNvbnNlbnRfcmVxdWlyZWQiOmZhbHNlLCJyZWRpcmVjdF91cmkiOiJodHRwczpcL1wvd3d3LnNjb3RpYW9ubGluZS5zY290aWFiYW5rLmNvbVwvb25saW5lXC9sYW5kaW5nXC9vYXV0aGxhbmRpbmcuYm5zIiwiZXhwIjoxNjU1NzkxNTUxLCJpYXQiOjE2NTU3OTAzNTEsImp0aSI6Ijg0ODcxMTBhLTYyZGEtNDM3Ny05NjFlLTM4NzY5ZTUzYmJkOSIsImNsaWVudF9pZCI6IjhlZTkwYzM5LTFjNTItNGZmNC04YWU2LWE3YjU0YzUzOTkzMyIsImNsaWVudF9tZXRhZGF0YSI6eyJDaGFubmVsSUQiOiJTT0wiLCJBcHBsaWNhdGlvbkNvZGUiOiJINyJ9LCJpc3N1ZXIiOiJodHRwczpcL1wvcGFzc3BvcnQuc2NvdGlhYmFuay5jb20ifQ.RQs2IdfpLYMr17pNK5d_YBYC2IVMGbwzRP51QfB0G75KjFp0uxgeNdbOEkLxgmOP9qCn52vufDIhY4FrQ_RyvxbKnNGM8w7crzNWwrORPHEmVxNSF_Bp_n59Xu_PODU9jFeangefVeh0P0_dknWJBuul-PX_29Dd_kAYJFfBUL1P98sRTSDBay42DVM6rAHCBTyAI9ojv1_pDC9E7FUuzOX9rfWZRtYZPce858s2FValdAUZtMsJT0QNdZom-jX6QFi2jSIo5icyaV8v4hNgaN9ieQbgWH7PIdxGYBvM1bADCtf5DsglrNEcWVD5Klxvf75PBAbzcadSpclMba0WVA";
		String wantedURL = "Need help signing in? | Scotiabank";
		String actualURL = driver.getTitle();
		System.out.println(actualURL);
		
		if(wantedURL.equals(actualURL)) {
			System.out.println("Test Pass");
			
		}else {
			System.out.println("Test Fail");
		}
		
		
		 Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(5000);
		String expectedTitle = "Sign in | Scotiabank";
		//String expectedTitle = "https://auth.scotiaonline.scotiabank.com/online?oauth_key=23iIcbmQQa4&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5nb29nbGUuY29tXC8iLCJvYXV0aF9rZXkiOiIyM2lJY2JtUVFhNCIsImNvbnNlbnRfcmVxdWlyZWQiOmZhbHNlLCJyZWRpcmVjdF91cmkiOiJodHRwczpcL1wvd3d3LnNjb3RpYW9ubGluZS5zY290aWFiYW5rLmNvbVwvb25saW5lXC9sYW5kaW5nXC9vYXV0aGxhbmRpbmcuYm5zIiwiZXhwIjoxNjU1NzkxNTUxLCJpYXQiOjE2NTU3OTAzNTEsImp0aSI6Ijg0ODcxMTBhLTYyZGEtNDM3Ny05NjFlLTM4NzY5ZTUzYmJkOSIsImNsaWVudF9pZCI6IjhlZTkwYzM5LTFjNTItNGZmNC04YWU2LWE3YjU0YzUzOTkzMyIsImNsaWVudF9tZXRhZGF0YSI6eyJDaGFubmVsSUQiOiJTT0wiLCJBcHBsaWNhdGlvbkNvZGUiOiJINyJ9LCJpc3N1ZXIiOiJodHRwczpcL1wvcGFzc3BvcnQuc2NvdGlhYmFuay5jb20ifQ.RQs2IdfpLYMr17pNK5d_YBYC2IVMGbwzRP51QfB0G75KjFp0uxgeNdbOEkLxgmOP9qCn52vufDIhY4FrQ_RyvxbKnNGM8w7crzNWwrORPHEmVxNSF_Bp_n59Xu_PODU9jFeangefVeh0P0_dknWJBuul-PX_29Dd_kAYJFfBUL1P98sRTSDBay42DVM6rAHCBTyAI9ojv1_pDC9E7FUuzOX9rfWZRtYZPce858s2FValdAUZtMsJT0QNdZom-jX6QFi2jSIo5icyaV8v4hNgaN9ieQbgWH7PIdxGYBvM1bADCtf5DsglrNEcWVD5Klxvf75PBAbzcadSpclMba0WVA&preferred_environment=";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test Pass");
			
		}else {
			System.out.println("Test Fail");
		}
		
		String ExpectedText = "Remember my username or card number";
		String checkTextPresent = driver.findElement(By.xpath("//div[contains(text(),'Remember my username or card number')]")).getText();
		System.out.println(checkTextPresent);
		if(ExpectedText.equals(checkTextPresent)) {
			System.out.println("Test Pass");
			
		}else {
			System.out.println("Test Fail");
		}
		
		driver.close();
		
	}

}
