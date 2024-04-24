package script;

import org.testng.annotations.Test;

import common.LoginTest;
import main.Launch_Test;

public class LoginScriptTest extends Launch_Test{
	@Test
	public static void login() {
		
		LoginTest.Login();
		LoginTest.LoginWithValidCredential();
//		LoginTest.LoginWithInvalidCredential_1();
//		LoginTest.LoginWithInvalidCredential_2();
//		LoginTest.LoginWithOutEnterData();
	}

}
