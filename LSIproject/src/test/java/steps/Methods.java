package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.*;

public class Methods {
	public ChromeDriver driver;
	
	@Given("Load Browser and Login url")
	public void loadBrowserAndLoginUrl() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chowd\\eclipse-workspace\\LSIproject\\"
				+ "driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.ukflooringsale.co.uk/");
	    
	}

	@Given("click My Account link")
	public void clickMyAccountLink() {
		driver.findElementByLinkText("My Account").click();
	   
	}

	@Given("Enter email as {string}")
	public void enterEmailAs(String string) {
		driver.findElementById("email").sendKeys("chowdhurymohammad@hotmail.co.uk");
	   	}

	@Given("Enter Password as {string}")
	public void enterPasswordAs(String string) {
		driver.findElementById("pass").sendKeys("Welcome123");
	}

	@When("Click Login Button")
	public void clickLoginButton() {
		driver.findElementByXPath("//button[@title='Login']").click();
	}

	@Then("Click My Wishlist Link")
	public void clickMyWishlistLink() {
		driver.findElementByLinkText("My Wishlist").click(); 
	}

	@Then("Click Shopping Bag")
	public void clickShoppingBag() {
		driver.findElementByXPath("//h3[text()='Shopping Bag']").click();
	}

	@Then("Click Carpet Tiles link")
	public void clickCarpetTilesLink() {
		driver.findElementByLinkText("Carpet Tiles").click();
	}

	@Then("Click Add to cart")
	public void clickAddToCart() {
		driver.findElementByXPath("(//span[text()='Add to Cart'])[1]").click();
	}

	@Then("Click Summery Row")
	public void clickSummeryRow() {
		driver.findElementByXPath("//div[@class='summary_row  ']").click();
	}

	@Then("Click My cart")
	public void clickMyCart() {
		driver.findElementByXPath("//button[@title='My Cart']").click();
	}
	
	@Then("Enter Product as {string}")
	public void enterProductAs(String string) {
		driver.findElementByXPath("//input[@class='input-text']").sendKeys("product");
	}

	@Then("Click View Product Button")
	public void clickViewProductButton() {
		driver.findElementByXPath("(//button[@class='button'])[3]").click();
	}

	@Then("Click Grid View")
	public void clickGridView() {
		driver.findElementByXPath("(//strong[@class='grid'])[1]").click(); 
	}

	@Then("Click List View")
	public void clickListView() {
		driver.findElementByLinkText("List").click();
	}

	@Then("Click Sort By")
	public void clickSortBy() {
		driver.findElementByXPath("(//div[@class='sort-by'])[2]").click();
	}

	@Then("Sort By Price")
	public void sortByPrice() {
		WebElement ele = driver.findElementByXPath("(//select[@onchange='setLocation(this.value)'])[2]");
		Select dd = new Select(ele);
		dd.selectByVisibleText("Price");
	}

	@Then("Sort By Name")
	public void sortByName() {
		WebElement elem = driver.findElementByXPath("(//select[@onchange='setLocation(this.value)'])[2]");
		Select dd1 = new Select(elem);
		dd1.selectByVisibleText("Name");
	}

	@Then("Click Ascending Direction")
	public void clickAscendingDirection() {
		driver.findElementByXPath("(//div[@class='right'])[2]").click();
	}

	@Then("Click Descending Direction")
	public void clickDescendingDirection() {
		driver.findElementByXPath("(//div[@class='right'])[1]").click();
		
		WebElement ele1 = driver.findElementByXPath("(//select[@onchange='setLocation(this.value)'])[1]");
		Select dd3 = new Select(ele1);
		dd3.selectByVisibleText("30");
		
		WebElement ele2 = driver.findElementByXPath("(//select[@onchange='setLocation(this.value)'])[1]");
		Select dd4 = new Select(ele2);
		dd4.selectByVisibleText("60");
		
		WebElement ele3 = driver.findElementByXPath("(//select[@onchange='setLocation(this.value)'])[1]");
		Select dd5 = new Select(ele3);
		dd5.selectByVisibleText("100");
		
		WebElement ele4 = driver.findElementByXPath("(//select[@onchange='setLocation(this.value)'])[1]");
		Select dd6 = new Select(ele4);
		dd6.selectByVisibleText("All"); 
	}

}
