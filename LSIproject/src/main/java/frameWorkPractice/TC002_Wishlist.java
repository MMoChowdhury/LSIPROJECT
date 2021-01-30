package frameWorkPractice;

import org.testng.annotations.Test;

public class TC002_Wishlist extends TC001_Login {
	@Test
	public void Wishlist() {
		
		clickByLinkText("My Wishlist");
		clickByXpath("//h3[text()='Shopping Bag']");
		clickByLinkText("Carpet Tiles");
		clickByXpath("(//span[text()='Add to Cart'])[1]");
		clickByXpath("//div[@class='summary_row  ']");
		clickByXpath("//button[@title='My Cart']");
	}

}
