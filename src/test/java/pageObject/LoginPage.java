package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	//creating constructor
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@type='email']")
	WebElement txt_email;
	
	@FindBy(id="continue")
	WebElement btn_continue;
	
	@FindBy(name="password")
	WebElement txt_password;
	
	@FindBy(id="signInSubmit")
	WebElement btn_signin;
	
	public void setEmail(String email) {
		txt_email.clear();
		txt_email.sendKeys(email);
	}
	
	public void btnContinue() {
		btn_continue.click();
	}
	
	public void setPassword(String pwd) {
		txt_password.sendKeys(pwd);
	}
	
	public void buttonSignin() {
		btn_signin.click();
	}
}
