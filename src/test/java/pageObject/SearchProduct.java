package pageObject;

import org.openqa.selenium.JavascriptExecutor;
//import ;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchProduct extends BasePage{

	public SearchProduct(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement clk_search;
	
	@FindBy(linkText="Add to cart")
	WebElement btn_addtocart;
	
	@FindBy(id="nav-cart")
	WebElement clk_addtocarticon;
	
	@FindBy(xpath="//input[@name=\"clk_addtocarticon\"]")
	WebElement clk_proccedtobuy;
	
	public void clickSearch() {
		clk_search.click();
	}
	
	public void btnAddtoCart() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",btn_addtocart);
		
//		Actions action=new Actions(driver);
//		action.moveToElement(btn_addtocart).perform();
	}
	
	public void clkAddtoCartItem() {
		clk_addtocarticon.click();
	}
	
	public void clkProceedtoBuy() {
		clk_proccedtobuy.click();
	}

}
