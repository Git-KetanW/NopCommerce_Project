package script;

import org.testng.annotations.Test;

import common.BuyItemTest;
import main.Launch_Test;

public class BuyItemScriptTest extends Launch_Test{
	@Test
	public static void Buy() {
		
		BuyItemTest.Windows();
		BuyItemTest.Buy();
//		BuyItemTest.methodOne();
		BuyItemTest.methodTwo();
		BuyItemTest.Screenshot();
	}

}
