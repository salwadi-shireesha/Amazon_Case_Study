package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import testBase.BaseClass;

public class TC001_LoginTest extends BaseClass{
	
	@Test(groups="Master")
	public void loginTest() {
		logger.info("**** TC001 login test starts *****");
		try{
		
		HomePage hp=new HomePage(driver);
		hp.click_Account();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.btnContinue();
		lp.setPassword(p.getProperty("password"));
		lp.buttonSignin();
		}
		catch(Exception e) {
			Assert.fail();
		}
		
		logger.info("****finished login functionality *****");
	}
}
