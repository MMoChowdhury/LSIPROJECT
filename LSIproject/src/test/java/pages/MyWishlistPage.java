package pages;

import wrapper.ProjectSpecificWrapper;

public class MyWishlistPage extends ProjectSpecificWrapper {
	
	public MyWishlistPage ClickMyWishlistlink() {
		
		clickByLinkText("My Wishlist");
		return this;
	}
	
	public MyWishlistPage ClickShoppingBag() {
		
		clickByXpath("//h3[text()='Shopping Bag']");
		return this;
	}
	
	public MyWishlistPage ClickCarpetTiles() {
		clickByLinkText("Carpet Tiles");
		return this;
		
	}
	public MyWishlistPage ClickAddtoCart() {
		clickByXpath("(//span[text()='Add to Cart'])[1]");
		return this;
		
	}
	
	public MyWishlistPage ClickSummeryRow() {
		clickByXpath("//div[@class='summary_row  ']");
		return this;
		
	}
	public MyWishlistPage ClickMyCart() {
		clickByXpath("//button[@title='My Cart']");
		return this;
		
	}
	public MyWishlistPage EnterProduct(String Product) {
		enterByXpath("//input[@class='input-text']", Product);
		
		return this;
	}
	 public ProductPage ClickSearchButton() {
		 clickByXpath("(//button[@class='button'])[3]");
			return new ProductPage();
	 }

}
