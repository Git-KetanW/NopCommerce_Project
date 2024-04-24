package script;

import org.testng.annotations.Test;

import common.OtherHomeScreenOptionsTest;
import main.Launch_Test;

public class OtherHomeScreenOptionsScriptTest extends Launch_Test{
	@Test
	public static void options() {
		
		OtherHomeScreenOptionsTest.computers();
		OtherHomeScreenOptionsTest.electroniX();
		OtherHomeScreenOptionsTest.apparel();
		OtherHomeScreenOptionsTest.OtherElements();
	}

}
