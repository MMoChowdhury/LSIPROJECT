package ukFlorringSale01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class UKFlooringSale2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\chowd\\git\\LSIPROJECT\\LSIproject\\driver\\geckodriver.exe");
		
	   	FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.ukflooringsale.co.uk/");
		
		//Click Header
		boolean txt = driver.findElementByXPath("//div[@class='header']").isDisplayed();
		System.out.println(txt);
		Assert.assertTrue(txt,"header is displayed");
		
		//Click Footer
		boolean tt = driver.findElementByXPath("//div[@class='footer']").isDisplayed();
		System.out.println(tt);
		Assert.assertTrue(tt,"header is displayed");
		
		//Click search Button
		driver.findElementByXPath("//button[@class='button']").click();
		
		//Validate Flash Sale - save upto 15% logo displayed
		boolean text = driver.findElementByXPath("//img[@draggable='false']").isDisplayed();
		System.out.println(text);
		Assert.assertTrue(text,"Verify flash_Sale logo is displayed");
				
		//click My Account
		driver.findElementByLinkText("My Account").click();
		
		//Click new customers
		driver.findElementByXPath("//h2[text()='New Customers']").click();
		
		//Click Registered/Existing Customers
		driver.findElementByXPath("//h2[text()='Registered Customers']").click();
		
		//Click forgot password
		driver.findElementByLinkText("Forgot Your Password?").click();
		
		//Enter email for retrieve password
		driver.findElementById("email_address").sendKeys("chowdhurymohammad@hotmail.co.uk");
		//Click Submit Button
		driver.findElementByXPath("(//button[@class='button'])[2]").click();
		
		driver.findElementById("email").sendKeys("chowdhurymohammad@hotmail.co.uk");
		
		driver.findElementById("pass").sendKeys("Welcome123");
		
		driver.findElementByXPath("//button[@title='Login']").click();
		Thread.sleep(3000);
		
		//Click My DeshBoard
		driver.findElementByXPath("//h1[text()='My Dashboard']").click();
		driver.findElementByXPath("(//span[@style='color:;'])[10]").click();
		driver.findElementByXPath("//input[@id='search']").sendKeys("Chelsea Extra");
		driver.findElementByXPath("//span[text()='Search']").click();
		
		driver.findElementByXPath("(//span[@style='color:;'])[10]").click();
		driver.findElementByXPath("//input[@id='search']").sendKeys("Chelsea Laminate");
		driver.findElementByXPath("//span[text()='Search']").click();
		
		driver.findElementByXPath("(//span[@style='color:;'])[10]").click();
		driver.findElementByXPath("//input[@id='search']").sendKeys("Kensington Laminate");
		driver.findElementByXPath("//span[text()='Search']").click();
				
		Thread.sleep(3000);
		driver.findElementByXPath("(//span[@style='color:;'])[10]").click();
		//driver.findElementByXPath("(//span[text()='Lynton'])[1]").click();
		
		//Thread.sleep(3000);
		driver.findElementByXPath("(//span[text()='Brecon Laminate Flooring'])[2]").click();
		
		/*Thread.sleep(3000);
		driver.findElementByXPath("(//span[@style='color:;'])[10]").click();
		driver.findElementByXPath("(//span[text()='Lynton'])[2]").click();*/
}

	}


