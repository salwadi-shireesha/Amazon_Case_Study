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
	
	@FindBy(xpath="//button[@id='a-autoid-1-announce']")
	WebElement btn_addtocart;
	
	@FindBy(id="nav-cart-count-container")
	WebElement clk_addtocarticon;
	
	@FindBy(xpath="//input[@name=\"proceedToRetailCheckout\"]")
	WebElement clk_proccedtobuy;
	
	@FindBy(xpath="//input[@data-testid='Address_selectShipToThisAddress']")
	WebElement clk_usethis_address;
	
	@FindBy(xpath="//input[@type='radio' ][ @id='pp-OazFdz-106']")
	WebElement clk_otherpaymentmethod;
	
	@FindBy(xpath="//span[@class='a-button-text a-declarative']")
	WebElement clk_choosebank;
	
	@FindBy(linkText="State Bank of India")
	WebElement clk_bank;
	
	@FindBy(xpath="//input[@id='pp-glKcdj-114']")
	WebElement txt_upiid;
	
	@FindBy(xpath="//input[@name='ppw-widgetEvent:ValidateUpiIdEvent']")
	WebElement btn_verify;
	
	@FindBy(xpath="//div[@class=\"a-alert-content\"][text()='Verified!']")
	WebElement txt_verify;
	
	@FindBy(xpath="//span[@id=\"pp-4dCPfy-146\"]")
	WebElement clk_usethis_payment;
	
	public void clickSearch() {
		clk_search.click();
	}
	
	public void btnAddtoCart() {
		btn_addtocart.click();
	}
	
	public void clkAddtoCartIcon() {
		clk_addtocarticon.click();
	}
	
	public void clkProceedtoBuy() {
		clk_proccedtobuy.click();
	}
	
	public void clkUseThisAddress() {
		clk_usethis_address.click();
	}
	
	public void clkOtherPaymentMethod() {
		clk_otherpaymentmethod.click();
	}
	
	public void  setUpi_id(String upi) {
		txt_upiid.sendKeys(upi);
		
		
	}
	public void btnVerify() {
		btn_verify.click();	
	}
	
	public String txtVerify() {
		return txt_verify.getText();
	}
	
	public void clkUseThisPayment() {
		clk_usethis_payment.click();
	}
	
	public void clickChooseBank() {
		clk_choosebank.click();
	}
	
	public void clickBank() {
		clk_bank.click();
	}
}
