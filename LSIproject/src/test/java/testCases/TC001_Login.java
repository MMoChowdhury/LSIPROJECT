package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrapper.ProjectSpecificWrapper;

public class TC001_Login extends ProjectSpecificWrapper {
	
	@BeforeTest
	public void setData() {
		excelfile = "UKFSFlooring";
	}
	
	@Test(dataProvider = "getData")
	public void loginPage(String eml, String pwd) {
 
		new LoginPage()
		.EnterEmail(eml)
		.EnterPassword(pwd)
		.ClickLogin();

}
	
}
