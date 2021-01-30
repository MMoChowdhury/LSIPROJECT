package pages;

import wrapper.ProjectSpecificWrapper;

public class ProductPage extends ProjectSpecificWrapper {
	
	public ProductPage ClickGridView() {
		clickByXpath("(//strong[@class='grid'])[1]");
		return this;
		}
    public ProductPage ClickList() {
		
		clickByLinkText("List");
		return new ProductPage();
	}
    public ProductPage ClickSortBy() {
		clickByXpath("(//div[@class='sort-by'])[2]");
		return this;
		}

	public ProductPage sortbyprice(String xpathVal) {
		selectVisibileTextByXPath("(//select[@onchange='setLocation(this.value)'])[2]");
		return this;
		
	}
	public ProductPage sortbyName(String xpathVal) {
		selectVisibileTextByXPath("(//select[@onchange='setLocation(this.value)'])[2]");
		return this;
	}
	public ProductPage ClickSortByAscendingOrder() {
		clickByXpath("(//div[@class='right'])[2]");
		return this;
		}
	public ProductPage ClickSortByDescendingOrder() {
		clickByXpath("(//div[@class='right'])[1]");
		return this;
		}
}
