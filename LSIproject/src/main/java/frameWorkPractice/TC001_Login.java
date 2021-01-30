package frameWorkPractice;

import org.testng.annotations.Test;

public class TC001_Login extends GeneralClass {
	
	@Test
	public void Login() {
		
		invokeApp("https://www.ukflooringsale.co.uk/");
		clickByLinkText("My Account");
		enterById("email", "chowdhurymohammad@hotmail.co.uk");
		enterById("pass", "Welcome123");
		clickByXpath("//button[@title='Login']");
	}

}
