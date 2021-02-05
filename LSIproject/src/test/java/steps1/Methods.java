package steps1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.en.*;

public class Methods {
	public ChromeDriver driver;
	@Given("Load Browser and Login URL")
	public void loadBrowserAndLoginURL() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.ukflooringsale.co.uk/");
	    
	}

	@Given("Click Header")
	public void clickHeader() {
		boolean txt = driver.findElementByXPath("//div[@class='header']").isDisplayed();
		System.out.println(txt);
		Assert.assertTrue(txt,"header is displayed");
	    
	}

	@Given("Click Footer")
	public void clickFooter() {
		boolean tt = driver.findElementByXPath("//div[@class='footer']").isDisplayed();
		System.out.println(tt);
		Assert.assertTrue(tt,"header is displayed");
	    
	}

	@Given("Click search Button")
	public void clickSearchButton() {
		driver.findElementByXPath("//button[@class='button']").click();
	}

	@Given("Validate Flash Sale")
	public void validateFlashSale() {
		boolean text = driver.findElementByXPath("//img[@draggable='false']").isDisplayed();
		System.out.println(text);
		Assert.assertTrue(text,"Verify flash_Sale logo is displayed");
	}

	@Given("Click My Account")
	public void clickMyAccount() {
		driver.findElementByLinkText("My Account").click();
	}

	@Then("Click New Customers")
	public void clickNewCustomers() {
		driver.findElementByXPath("//h2[text()='New Customers']").click();
	}

	@Then("Click Registered Customers")
	public void clickRegisteredCustomers() {
		driver.findElementByXPath("//h2[text()='Registered Customers']").click();
	}

	@Then("Click Forgot Password")
	public void clickForgotPassword() {
		driver.findElementByLinkText("Forgot Your Password?").click();
	}

	@Then("Enter email for retrieve password")
	public void enterEmailForRetrievePassword() {
		driver.findElementById("email_address").sendKeys("chowdhurymohammad@hotmail.co.uk");
	}

	@Then("Click Submit Button")
	public void clickSubmitButton() {
		driver.findElementByXPath("(//button[@class='button'])[2]").click();
	    
	}
	@Given("Enter email as {string}")
	public void enterEmailAs(String string) {
		driver.findElementById("email").sendKeys("chowdhurymohammad@hotmail.co.uk"); 
	}

	@Given("Enter Password as {string}")
	public void enterPasswordAs(String string) {
		driver.findElementById("pass").sendKeys("Welcome123");
	}


	@Given("Click Login Button")
	public void clickLoginButton() {
		driver.findElementByXPath("//button[@title='Login']").click();
	}
	@Given("Click Laminate Link")
	public void clickLaminateLink() {
		driver.findElementByXPath("(//span[@style='color:;'])[10]").click();
	}

	@Given("Enter ChelseaExtra as Chelsea Extra")
	public void enterChelseaExtraAsChelseaExtra() {
		driver.findElementByXPath("//input[@id='search']").sendKeys("Chelsea Extra");
	}

	@Given("Click Search Button")
	public void clickSearchButton1() {
		driver.findElementByXPath("//span[text()='Search']").click();
	}

	@Then("Enter Chelsealaminate as Chelsea Laminate")
	public void enterChelsealaminateAsChelseaLaminate() {
		driver.findElementByXPath("//input[@id='search']").sendKeys("Chelsea Laminate");
	}

	@Then("Enter Kensington laminate")
	public void enterKensingtonLaminate() {
		driver.findElementByXPath("//input[@id='search']").sendKeys("Kensington Laminate");
	}

	@Then("Click Brecon Laminate Flooring")
	public void clickBreconLaminateFlooring() {
		driver.findElementByXPath("(//span[text()='Brecon Laminate Flooring'])[2]").click();
	}


	@Given("Click My dashBoard")
	public void clickMyDashBoard() {
		driver.findElementByXPath("//h1[text()='My Dashboard']").click();
	}

	

}
