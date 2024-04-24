package common;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import script.RegisterScriptTest;

public class RegisterTest extends RegisterScriptTest{
	@Test
	public static void Register() {
		
		//handling parent window
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@class='btn frontend-button']/span[text()='Frontend']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		//handling child window
		Set<String> allchild = driver.getWindowHandles();
		for(String child:allchild) {
			if(!child.equals(parent)) {
				
				driver.switchTo().window(child);
				break;
			}
		}
		
		driver.findElement(By.linkText("Register")).click();
	}
	@Test
	public static void EnterMadetoryFieldsOnly() {
		
		driver.findElement(By.name("FirstName")).sendKeys("Ketan");
		driver.findElement(By.id("LastName")).sendKeys("Walde");
		driver.findElement(By.id("Email")).sendKeys("ketanranatesting@gmail.com");
		driver.findElement(By.id("Newsletter")).click();
		driver.findElement(By.id("Password")).sendKeys("Testing@143");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Testing@143");
		driver.findElement(By.id("register-button")).click();
		
	}
	@Test
	public static void EnterAllFields() {
		
		driver.findElement(By.name("FirstName")).sendKeys("Ketan");
		driver.findElement(By.id("LastName")).sendKeys("Walde");
		//DOB
		WebElement Day = driver.findElement(By.name("DateOfBirthDay"));
		Select day = new Select(Day); //select day
		day.selectByVisibleText("5");
		
		WebElement Month = driver.findElement(By.name("DateOfBirthMonth"));
		Select month = new Select(Month);
		month.selectByValue("3");
		
		WebElement Year = driver.findElement(By.name("DateOfBirthYear"));
		Select year = new Select(Year);
		year.selectByVisibleText("1999");
		
		driver.findElement(By.id("Email")).sendKeys("ketanranatesting@gmail.com");
		//Company
		driver.findElement(By.id("Company")).sendKeys("Test");
	
		driver.findElement(By.id("Newsletter")).click();
		driver.findElement(By.id("Password")).sendKeys("Testing@143");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Testing@143");
		driver.findElement(By.id("register-button")).click();
	}
	@Test
	public static void NoDataEnter() {
		
		driver.findElement(By.name("FirstName")).sendKeys(Keys.TAB);
		driver.findElement(By.id("LastName")).sendKeys(Keys.TAB);
		driver.findElement(By.id("Email")).sendKeys(Keys.TAB);
		driver.findElement(By.id("Newsletter")).click();
		driver.findElement(By.id("Password")).sendKeys(Keys.TAB);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(Keys.TAB);
		driver.findElement(By.id("register-button")).click();
		
//		File pic = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //normal method
		File pic = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE); //method for full page
		File store = new File("C:\\Users\\ketan\\OneDrive\\Desktop\\Education\\My.jpg");
		try {
			FileHandler.copy(pic, store);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
