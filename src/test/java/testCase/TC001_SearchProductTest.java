package testCase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.SearchProduct;
import testBase.BaseClass;

public class TC001_SearchProductTest extends BaseClass{
	@Test(groups="Master")
	public void searchProduct() {
	logger.info("****** TC001 Searching the product ******");
		try {
		
		HomePage hp=new HomePage(driver);
		hp.click_Account();
		hp.click_email(p.getProperty("email"));
		
		LoginPage lt=new LoginPage(driver);
		lt.setEmail(p.getProperty("email"));
		lt.btnContinue();
		lt.setPassword(p.getProperty("password"));
		lt.buttonSignin();
		
		hp.textEnterInSearch("samsung galaxy s24 ultra 5g");
		Thread.sleep(5000);
		SearchProduct sp=new SearchProduct(driver);
		logger.info("enter");
		
		sp.clickSearch();
		logger.info("clicked on search");
		Thread.sleep(5000);
		
		sp.btnAddtoCart();
		sp.clkAddtoCartIcon();
		logger.info("item added to cart");
		sp.clkProceedtoBuy();
		sp.clkUseThisAddress();
		
		Thread.sleep(5000);
		sp.clkOtherPaymentMethod();
		sp.setUpi_id("9705106894@sbi");
		sp.btnVerify();
		String text=sp.txtVerify();
		Assert.assertEquals(text,true);
		
//		if(text.equals("Verified!")) {
//			System.out.println("upi verified successfully");
//		}
//		logger.info("executed successfully");
//		}else {
//			System.out.println("upi not verified successfully");
		
		sp.clkUseThisPayment();
	}
		catch(Exception e)
		{
			logger.info("****** TC001 not executed successfully ******");
		}
	}
}
