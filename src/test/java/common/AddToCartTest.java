package common;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import script.AddToCartScriptTest;

public class AddToCartTest extends AddToCartScriptTest{
	static JavascriptExecutor jse;
	@Test
	public static void HandleWindows() {
		
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//span[text()='Frontend']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		Set<String> child = driver.getWindowHandles();
		for(String Childs:child) {
			if(!Childs.equals(parent)) {
				
				driver.switchTo().window(Childs);
				break;
			}
		}
		
	}
	@Test(priority=1)
	public static void AddToCart() {
		
		driver.findElement(By.name("q")).sendKeys("Nokia Lumia 1020");
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
		jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,800)");
		
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		
	}
	@Test(priority=2,dependsOnMethods= "AddToCart")
	public static void goToCart() {
		
		jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(800,0)");
		
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		
	}
	@Test(priority=3,dependsOnMethods="goToCart")
	public static void CartItem() {
		
		jse.executeScript("window.scrollBy(0,800)");
		
		WebElement gift = driver.findElement(By.id("checkout_attribute_1"));
		
		 Select slct = new Select(gift);
		 slct.selectByValue("1");
		 
		 driver.findElement(By.id("termsofservice")).click();
		 driver.findElement(By.name("checkout")).click();
		
	}

}
