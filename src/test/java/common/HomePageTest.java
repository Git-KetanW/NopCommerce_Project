package common;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import script.HomePageSciptTest;

public class HomePageTest extends HomePageSciptTest{
	static JavascriptExecutor jse;
	@Test
	public static void TopRow(){
		
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@class= 'btn frontend-button']/span[text()='Frontend']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		//Handle child window
		Set<String> allchild = driver.getWindowHandles();
		for(String child:allchild) {
			if(!child.equals(parent)) {
		
				driver.switchTo().window(child);
				break;
				}
			}
		
		// Top Row Functionality
		driver.findElement(By.linkText("Register")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Log in")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Wishlist")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@class='ico-cart']/span[text()='Shopping cart']")).click();
		driver.navigate().back();
		
		WebElement currency = driver.findElement(By.xpath("//select[@id='customerCurrency']"));
		Select obj = new Select(currency);
		obj.selectByVisibleText("US Dollar");
		
		
		jse = (JavascriptExecutor)driver;
		WebElement page = driver.findElement(By.className("master-wrapper-page"));
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		driver.switchTo().window(parent);
		
	}

}
