package script;

import org.testng.annotations.Test;

import common.AddToCartTest;
import main.Launch_Test;

public class AddToCartScriptTest extends Launch_Test{
	@Test(priority=1)
	public static void Cart() {
		
		AddToCartTest.HandleWindows();
		AddToCartTest.AddToCart();
		AddToCartTest.goToCart();
		AddToCartTest.CartItem();
	}
	
}
