package pages;

import wrapper.ProjectSpecificWrapper;

public class LoginPage extends ProjectSpecificWrapper {
	
	public LoginPage ClickMyAccountLink() {
		
		clickByLinkText("My Account");
		return new LoginPage();
	}
	
	public LoginPage EnterEmail (String eml) {
		
		enterById("email",  eml);
		return this;
	}
	
	public LoginPage EnterPassword (String pwd) {
		
		enterById("pass", pwd);
		return this;
	}
	
	public MyWishlistPage ClickLogin() {
		clickByXpath("//button[@title='Login']");
		
		return new MyWishlistPage();
	}
	
	

}
