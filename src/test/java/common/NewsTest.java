package common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import script.NewsScriptTest;

public class NewsTest extends NewsScriptTest{
	static JavascriptExecutor jse =(JavascriptExecutor)driver;
	@Test
	public static void NewsOptions() {
		
		//handle windows
		AddToCartTest.HandleWindows();
	}
	@Test
	public static void NewStore() {
		
		jse.executeScript("window.scrollBy(0,1000);");
		driver.findElement(By.linkText("New online store is open!")).click();
		driver.findElement(By.xpath("//div[@class='page-title']")).isDisplayed();
		
		//add comment
		driver.findElement(By.id("AddNewComment_CommentTitle")).sendKeys("Sample comment");
		driver.findElement(By.id("AddNewComment_CommentText")).sendKeys("This is sample");
		driver.findElement(By.name("add-comment")).click();
	}
	

}
