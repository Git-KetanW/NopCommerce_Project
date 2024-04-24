package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import script.OtherHomeScreenOptionsScriptTest;

public class OtherHomeScreenOptionsTest extends OtherHomeScreenOptionsScriptTest{

	@Test
	public static void computers() {
		
		AddToCartTest.HandleWindows();
	//Computer category
		Actions act = new Actions(driver);
		WebElement com = driver.findElement(By.xpath("(//a[text()='Computers '])[1]"));
	//Desktop
		act.moveToElement(com).perform();
		WebElement desktop = driver.findElement(By.xpath("(//a[text()='Desktops '])[1]"));
		act.moveToElement(desktop).click().perform();
		driver.navigate().back();
	//Notebook
		act.moveToElement(com).perform();
		WebElement notebook = driver.findElement(By.xpath("(//a[text()='Notebooks '])[1]"));
		act.moveToElement(notebook).click().perform();
		driver.navigate().back();
	//Software
		act.moveToElement(com).perform();
		WebElement sofware = driver.findElement(By.xpath("(//a[text()='Software '])[1]"));
		act.moveToElement(sofware).click().perform();
		driver.navigate().back();
	}
	@Test
	public static void electroniX() {
		Actions act1 = new Actions(driver);
		WebElement electronics = driver.findElement(By.xpath("(//a[text()='Electronics '])[1]"));
		act1.moveToElement(electronics).perform();
		
		act1.moveToElement(electronics).perform();
		WebElement camera = driver.findElement(By.xpath("(//a[text()='Camera & photo '])[1]"));
		act1.moveToElement(camera).click().perform();
		driver.navigate().back();
		
		act1.moveToElement(electronics).perform();
		WebElement cellPhone = driver.findElement(By.xpath("(//a[text()='Cell phones '])[1]"));
		act1.moveToElement(cellPhone).click().perform();
		driver.navigate().back();
		
		act1.moveToElement(electronics).perform();
		WebElement other = driver.findElement(By.xpath("(//a[text()='Others '])[1]"));
		act1.moveToElement(other).click().perform();
		driver.navigate().back();
		
	}
	@Test
	public static void apparel() {
		Actions act2 = new Actions(driver);
		WebElement Apparel = driver.findElement(By.xpath("(//a[text()='Apparel '])[1]"));
		act2.moveToElement(Apparel).perform();
		
		act2.moveToElement(Apparel).perform();
		WebElement shoe = driver.findElement(By.xpath("(//a[text()='Shoes '])[1]"));
		act2.moveToElement(shoe).click().perform();
		driver.navigate().back();
		
		act2.moveToElement(Apparel).perform();
		WebElement cloth = driver.findElement(By.xpath("(//a[text()='Clothing '])[1]"));
		act2.moveToElement(cloth).click().perform();
		driver.navigate().back();
		
		act2.moveToElement(Apparel).perform();
		WebElement acces = driver.findElement(By.xpath("(//a[text()='Accessories '])[1]"));
		act2.moveToElement(acces).click().perform();
		driver.navigate().back();
		
	}
	@Test
	public static void OtherElements() {
		
		Actions act3 = new Actions(driver);
		WebElement digital = driver.findElement(By.xpath("(//a[text()='Digital downloads '])[1]"));
		act3.moveToElement(digital).click().perform();
		driver.navigate().back();
		
		WebElement books = driver.findElement(By.xpath("(//a[text()='Books '])[1]"));
		act3.moveToElement(books).click().perform();
		driver.navigate().back();
		
		WebElement jewelry = driver.findElement(By.xpath("(//a[text()='Jewelry '])[1]"));
		act3.moveToElement(jewelry).click().perform();
		driver.navigate().back();
		
		WebElement giftcard = driver.findElement(By.xpath("(//a[text()='Gift Cards '])[1]"));
		act3.moveToElement(giftcard).click().perform();
		driver.navigate().back();
	}

}
	