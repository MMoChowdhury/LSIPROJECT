package ukFlooringSale3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UKFlooringSale3 {
	
	ChromeDriver driver;
	
	  @BeforeMethod
	  public void start() {
		//public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");

			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.ukflooringsale.co.uk/");
	  }
	  
	  @Test (priority = 0)
	  public void Account() throws InterruptedException {
			//click My Account
			driver.findElementByLinkText("My Account").click();
			driver.findElementById("email").sendKeys("chowdhurymohammad@hotmail.co.uk");
			
			driver.findElementById("pass").sendKeys("Welcome123");
			
			driver.findElementByXPath("//button[@title='Login']").click();
							
			driver.findElementByXPath("//input[@id='search']").sendKeys("Krono Laminate Flooring");
			driver.findElementByXPath("//span[text()='Search']").click();
			
			driver.findElementByXPath("//input[@id='search']").clear();
			driver.findElementByXPath("//span[text()='Search']").click();
			
			Thread.sleep(3000); }
	  
			@Test (priority = 1)
			public void Mayfair() {
			driver.findElementByXPath("//input[@id='search']").sendKeys("Mayfair Laminate");
			driver.findElementByXPath("//span[text()='Search']").click();

			driver.findElementByXPath("(//span[@style='color:;'])[10]").click();
			driver.findElementByXPath("(//span[text()='Lynton'])[2]").click();
			}
			
			@Test (priority = 2)
			public void NottingHill() {
			
			//driver.findElementByXPath("//input[@id='search']").clear();
			//driver.findElementByXPath("//span[text()='Search']").click();
			
			driver.findElementByXPath("//input[@id='search']").sendKeys("Notting Hill Laminate");
			driver.findElementByXPath("//span[text()='Search']").click();
			
			driver.findElementByXPath("//input[@id='search']").clear();
			driver.findElementByXPath("//span[text()='Search']").click();
			
			driver.findElementByXPath("//input[@id='search']").sendKeys("Oak Laminate");
			driver.findElementByXPath("//span[text()='Search']").click();
			
			driver.findElementByXPath("//input[@id='search']").clear();
			driver.findElementByXPath("//span[text()='Search']").click();
			
			driver.findElementByXPath("//input[@id='search']").sendKeys("Soho Laminate");
			driver.findElementByXPath("//span[text()='Search']").click();
			
			driver.findElementByXPath("(//span[@style='color:;'])[10]").click();
			driver.findElementByXPath("(//span[text()='Stratex Flooring'])[2]").click();
			}
			
			@Test (priority = 3)
			public void Walnut() {
			
			driver.findElementByXPath("//input[@id='search']").clear();
			driver.findElementByXPath("//span[text()='Search']").click();
			
			driver.findElementByXPath("//input[@id='search']").sendKeys("Walnut Laminate");
			driver.findElementByXPath("//span[text()='Search']").click();
			
			driver.findElementByXPath("(//span[@style='color:;'])[10]").click();
			driver.findElementByXPath("(//span[text()='Wembury Laminate'])[2]").click();
			
			}
			
			@AfterMethod	
			public void closebrowser() {
			driver.close();  
				}
		
	}


