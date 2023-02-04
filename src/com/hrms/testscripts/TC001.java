package com.hrms.testscripts;
import org.testng.annotations.Test;
import com.hrms.pages.Loginpage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;
public class TC001 {
@Test
public static void tc001() {
	//Test Steps
	BaseClass.openApplication();
	VerifyPage.verifyTitle("HRMS");
	Loginpage.login("nareshit","nareshit");
	VerifyPage.verifyTitle("OrangeHRM");
	LogoutPage.logout();
	BaseClass.closeApplication();
}
}
	
