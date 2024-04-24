package common;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import script.LoginScriptTest;

public class LoginTest extends LoginScriptTest{
	@Test
	public static void Login() {
		
		//handle parent
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//span[text()='Frontend']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		//handle child
		Set<String> child = driver.getWindowHandles();
		for(String Child:child) {
			if(!Child.equals(parent)) {
				
				driver.switchTo().window(Child);
				break;
			}
		}
		
	}
	@Test
	public static void LoginWithValidCredential() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys("ketanranatesting@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Testing@143");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}
	@Test
	public static void LoginWithInvalidCredential_1() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys("testing@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Testing@143");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}
	@Test
	public static void LoginWithInvalidCredential_2() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys("ketanranatesting@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Test@143");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}
	@Test
	public static void LoginWithOutEnterData() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys(Keys.TAB);
		driver.findElement(By.id("Password")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}

}
