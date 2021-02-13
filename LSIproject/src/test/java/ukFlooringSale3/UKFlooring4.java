package ukFlooringSale3;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class UKFlooring4 {
	
	public static void main(String[] args) throws InterruptedException, IOException  {
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");

	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.ukflooringsale.co.uk/");

	//click My Account
	driver.findElementByLinkText("My Account").click();
	
	try {
		driver.findElementById("email").sendKeys("chowdhurymohammad1@hotmail.co.uk");
	} catch (Exception e) {
		
		e.printStackTrace();
		System.out.println("Invalid Email Address");
	}
	Thread.sleep(2000);
	//SnapShot
	
	File src = driver.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\chowd\\git\\LSIPROJECT\\LSIproject\\SnapShot\\image.png");
	
	Files.copy(src, dest);
	
	driver.findElementById("email").sendKeys("chowdhurymohammad@hotmail.co.uk");
	driver.findElementById("pass").sendKeys("Welcome123");
	
	driver.findElementByXPath("//button[@title='Login']").click();
	
	
					
	driver.findElementByXPath("//input[@id='search']").sendKeys("Krono Laminate Flooring");
	driver.findElementByXPath("//span[text()='Search']").click();
	
	driver.findElementByXPath("//input[@id='search']").clear();
	driver.findElementByXPath("//span[text()='Search']").click();
	
	driver.findElementByXPath("//input[@id='search']").sendKeys("Mayfair Laminate");
	driver.findElementByXPath("//span[text()='Search']").click();

	driver.findElementByXPath("//input[@id='search']").clear();
	driver.findElementByXPath("//span[text()='Search']").click();
	
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
			
	driver.findElementByXPath("//input[@id='search']").clear();
	driver.findElementByXPath("//span[text()='Search']").click();
	
	driver.findElementByXPath("//input[@id='search']").sendKeys("Walnut Laminate");
	driver.findElementByXPath("//span[text()='Search']").click();
	
	driver.findElementByXPath("//input[@id='search']").clear();
	driver.findElementByXPath("//span[text()='Search']").click();
	
	driver.findElementByXPath("//input[@id='search']").sendKeys("White");
	driver.findElementByXPath("//span[text()='Search']").click();
	
	//driver.findElementByXPath("//input[@id='search']").clear();
	//driver.findElementByXPath("//span[text()='Search']").click();
	
	//driver.findElementByXPath("//input[@id='search']").clear();
	//driver.findElementByXPath("//span[text()='Search']").click();
	
	//driver.findElementByXPath("(//span[@style='color:;'])[10]").click();
	//driver.findElementByXPath("(//span[text()='Lynton'])[2]").click();
	//Thread.sleep(2000);
	
	//driver.findElementByXPath("(//span[@style='color:;'])[10]").click();
	//driver.findElementByXPath("(//span[text()='Stratex Flooring'])[2]").click();
	
	//driver.findElementByXPath("(//span[@style='color:;'])[10]").click();
	//driver.findElementByXPath("(//span[text()='Wembury Laminate'])[2]").click();
	
	//Click Leather Floor
	driver.findElementByXPath("(//span[text()='Leather Floors'])[2]").click();
			
	//driver.findElementByXPath("(//span[text()='Luxury Vinyl Tile'])[2]").click();
	//driver.findElementByXPath("(//span[text()='Accessories'])[5]").click();
	
	//driver.findElementByXPath("(//span[text()='Luxury Vinyl Tile'])[2]").click();
	//driver.findElementByXPath("(//span[text()= 'Click LVT'])[1]").click();
	
	driver.findElementByXPath("(//span[text()='Luxury Vinyl Tile'])[2]").click();
	driver.findElementByXPath("(//span[text()='Glue-down LVT'])[1]").click();

	}
	

}
