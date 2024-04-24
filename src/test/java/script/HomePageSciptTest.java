package script;

import org.testng.annotations.Test;

import common.HomePageTest;
import main.Launch_Test;

public class HomePageSciptTest extends Launch_Test{
	@Test
	public static void VerifyHome(){
		
		HomePageTest.TopRow();
	}
}
