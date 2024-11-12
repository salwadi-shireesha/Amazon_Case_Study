
package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	//creating constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[text()='Account & Lists']")
	WebElement lnk_account;
	
	//for registration
	@FindBy(linkText="Create your Amazon account")
	WebElement lnk_register;
	
	//for login
	@FindBy(name="email")
	WebElement lnk_login;
	
	//for searching
	@FindBy(xpath="//*[@placeholder='Search Amazon.in']")
	WebElement txt_search;
	
	public void click_Account() {
		lnk_account.click();
	}
	
	public void click_Register() {
		lnk_register.click();
	}
	
	public void click_email(String email) {
		lnk_login.sendKeys(email);
	}
	
	public  void textEnterInSearch(String str) {
		txt_search.sendKeys(str);
	}
}
