package testCase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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
		
		hp.textEnterInSearch("Samsung galaxy");
		Thread.sleep(5000);
		SearchProduct sp=new SearchProduct(driver);
		logger.info("enter");
		
		sp.clickSearch();
		Thread.sleep(5000);
		
		sp.btnAddtoCart();
		sp.clkAddtoCartItem();
		sp.clkProceedtoBuy();
		
		
		logger.info("clicked on search");
		logger.info("exceuted successfully");
		}
		catch(Exception e)
		{
			logger.info("****** TC001 not executed successfully ******");
		}
	}
}
