package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_Test {
	
	public static WebDriver driver=null;
	public static String str = "https://www.nopcommerce.com/en/demo";
	public static String str1 = "https://demo.nopcommerce.com/";

	@BeforeMethod
	public static void LaunchAUT() {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(str);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public static void TearDown() {	
		driver.quit();
	}

}
