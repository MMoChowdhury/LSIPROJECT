package frameWorkPractice;

import org.testng.annotations.Test;

public class TC003_Product extends TC002_Wishlist {
	
	@Test
	public void Product() throws InterruptedException {
		
		enterByXpath("//input[@class='input-text']","product");
		//View Product
		clickByXpath("(//button[@class='button'])[3]");
		//Grid View
		clickByXpath("(//strong[@class='grid'])[1]");
		//List View
		clickByLinkText("List");
		Thread.sleep(3000);
		clickByXpath("(//div[@class='sort-by'])[2]");
	}

}
