
package script;

import org.testng.annotations.Test;

import common.RegisterTest;
import main.Launch_Test;

public class RegisterScriptTest extends Launch_Test{
	@Test
	public static void RegistrationScript(){
		
		RegisterTest.Register();
		RegisterTest.EnterMadetoryFieldsOnly();
//		RegisterTest.EnterAllFields();
//		RegisterTest.NoDataEnter();
	}

}
