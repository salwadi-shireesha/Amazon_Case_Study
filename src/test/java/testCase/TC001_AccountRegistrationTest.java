package testCase;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountRegistrationPage;
import pageObject.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass{

	@Test()
	public void account_registration() {
		
		logger.info("*****Starting TC001_Account_RegistrationTest *****");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		try {
			HomePage hp=new HomePage(driver);
			
			hp.click_Account();
			logger.info("****Clicked on Accounts ****");
			
			hp.click_Register();
			logger.info("****Clicked on Registration or Signup link*****");
			
			AccountRegistrationPage arp=new AccountRegistrationPage(driver);
			
			arp.setCustomerName("Shireesha");
			arp.setEmail("salwadisiri@gmail.com");
			arp.setPassword("Siri$6302");
			arp.setReEnterPassword("Siri$6302");
			arp.clickContinue();
			
		}
		catch(Exception e) {
			Assert.fail();
		}
		logger.info("Finished executing the registration page.....");
	}
}
