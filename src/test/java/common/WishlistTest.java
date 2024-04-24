package common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import script.WishScriptTest;

public class WishlistTest extends WishScriptTest{
	static JavascriptExecutor jse;
	@Test
	public static void wishListwithLogin() {
		//handle windows
		AddToCartTest.HandleWindows();
		//login
		LoginTest.LoginWithValidCredential();
		
		driver.findElement(By.id("small-searchterms")).sendKeys("htc");
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		jse = (JavascriptExecutor)driver;
		
		jse.executeScript("window.scrollBy(0,650);");
		driver.findElement(By.linkText("HTC One M8 Android L 5.0 Lollipop")).click();
		jse.executeScript("window.scrollBy(0,300);");
		driver.findElement(By.id("add-to-wishlist-button-18")).click();
	}
	@Test
	public static void wishListwithoutLogin() {
		//handle windows
		AddToCartTest.HandleWindows();
		
		driver.findElement(By.id("small-searchterms")).sendKeys("htc");
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		jse = (JavascriptExecutor)driver;
		
		jse.executeScript("window.scrollBy(0,650);");
		driver.findElement(By.linkText("HTC One M8 Android L 5.0 Lollipop")).click();
		jse.executeScript("window.scrollBy(0,300);");
		driver.findElement(By.id("add-to-wishlist-button-18")).click();
	}
	@Test
	public static void wishListByIcon() {
		
		AddToCartTest.HandleWindows();
		
		driver.findElement(By.id("small-searchterms")).sendKeys("htc");
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		jse = (JavascriptExecutor)driver;
		
		jse.executeScript("window.scrollBy(0,650);");
		driver.findElement(By.linkText("HTC One M8 Android L 5.0 Lollipop")).click();
		jse.executeScript("window.scrollBy(0,300);");
		driver.findElement(By.xpath("(//button[@title='Add to wishlist'])[1]")).click();
	}
}
