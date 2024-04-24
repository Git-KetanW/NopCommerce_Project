package script;

import org.testng.annotations.Test;

import common.NewsTest;
import main.Launch_Test;

public class NewsScriptTest extends Launch_Test{
	@Test
	public static void newsOption() {
		
		NewsTest.NewsOptions();
		NewsTest.NewStore();
	}

}
