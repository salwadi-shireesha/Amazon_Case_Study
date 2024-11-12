package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{

	//creating constructor
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="ap_customer_name")
	WebElement txt_customername;
	
	@FindBy(name="email")
	WebElement txt_email;
	
	@FindBy(xpath="//input[@type=\"password\" and @name=\"password\"]")
	WebElement txt_password;
	
	@FindBy(name="passwordCheck")
	WebElement txt_re_enter_password;
	
	@FindBy(id="continue")
	WebElement clk_continue;
	
	public void setCustomerName(String name) {
		txt_customername.sendKeys(name);
	}
	
	public void setEmail(String email) {
		txt_email.sendKeys(email);
	}
	
	public void setPassword(String pwd) {
		txt_password.sendKeys(pwd);
	}
	
	public void setReEnterPassword(String re_enterpwd) {
		txt_re_enter_password.sendKeys(re_enterpwd);
	}
	
	public void clickContinue() {
		clk_continue.click();
	}
}
