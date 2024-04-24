package script;

import org.testng.annotations.Test;

import common.WishlistTest;
import main.Launch_Test;


public class WishScriptTest extends Launch_Test{
	@Test
	public static void wishList() {
		
//		WishlistTest.wishListwithLogin();
//		WishlistTest.wishListwithoutLogin();
		WishlistTest.wishListByIcon();
		
		
	}

}
