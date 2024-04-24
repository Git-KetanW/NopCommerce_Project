package script;

import org.testng.annotations.Test;

import common.PopularTagsTest;
import main.Launch_Test;

public class PopularTagsScriptTest extends Launch_Test{
	@Test
	public static void Tags() {
		
		PopularTagsTest.TakeToTags();
		PopularTagsTest.PopularTag();
	}

}
