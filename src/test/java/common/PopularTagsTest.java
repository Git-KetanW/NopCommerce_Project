package common;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import script.PopularTagsScriptTest;

public class PopularTagsTest extends PopularTagsScriptTest{
	@Test
	public static void TakeToTags() {
		
		//handle windows
		AddToCartTest.HandleWindows();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		Actions act = new Actions(driver);
		WebElement com = driver.findElement(By.xpath("(//a[text()='Computers '])[1]"));
	//Desktop
		act.moveToElement(com).perform();
		WebElement desktop = driver.findElement(By.xpath("(//a[text()='Desktops '])[1]"));
		act.moveToElement(desktop).click().perform();
		driver.navigate().back();
	}
	@Test
	public static void PopularTag() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		driver.findElement(By.linkText("awesome")).click();
		driver.findElement(By.linkText("Lenovo IdeaCentre 600 All-in-One PC")).isDisplayed();
		
	}

}
