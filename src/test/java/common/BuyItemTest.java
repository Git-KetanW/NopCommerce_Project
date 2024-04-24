package common;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import script.BuyItemScriptTest;

public class BuyItemTest extends BuyItemScriptTest{
	static WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	static JavascriptExecutor jse = (JavascriptExecutor)driver;
	@Test
	public static void Windows() {
		
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//span[text()='Frontend']")).click();
		
		
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		Set<String> chld = driver.getWindowHandles();
		for(String Child:chld) {
			if(!Child.equals(parent)) {
				
				driver.switchTo().window(Child);
				break;
			}
		}
		//Login Account
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys("ketanranatesting@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Testing@143");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
	}
	@Test
	public static void Buy() {
		
		jse.executeScript("window.scrollBy(0,800)");
		
		driver.findElement(By.linkText("Apple MacBook Pro 13-inch")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart-button-4']")).click();
		driver.findElement(By.xpath("//span[@class='cart-label']")).click();
		
		jse.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.name("checkout")).click();
	}
		//Enter check-out details
	@Test
	public static void methodOne() {
			
			//method 01
			WebElement country = wait.until(ExpectedConditions.elementToBeClickable(By.id("BillingNewAddress_CountryId")));
			Select slc = new Select(country);
			slc.selectByVisibleText("Australia");
			driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Sydney");
			driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("House No. 08");
			driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("123456");
			driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("0987654321");
			driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
			
			driver.findElement(By.xpath("(//button[@type='button'])[10]")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[11]")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[12]")).click();
			
			jse.executeScript("window.scrollBy(0,500)");
			driver.findElement(By.xpath("(//button[@type='button'])[13]")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[13]"))).click();
	}
	@Test	
	public static void methodTwo() {
			
		//method 02
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[5]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[10]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[11]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[12]"))).click();
		
		jse.executeScript("window.scrollBy(0,500)");
//		driver.findElement(By.xpath("(//button[@type='button'])[13]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[13]"))).click();
	}
	
	@Test
	public static void Screenshot() {
		WebElement Click = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[1]")));
		File pic = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File source = new File("C:\\Users\\ketan\\OneDrive\\Desktop\\Novels\\Screenshot.jpg");
		try {
			FileHandler.copy(pic, source);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Click.click();
	
	}

}
