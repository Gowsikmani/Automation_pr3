package Test_pages;

import org.testng.annotations.Test;

import Page_objects.Checkout_page;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.annotations.AfterMethod;

public class checkout_page_test extends Checkout_page {
	@Test(priority=1)
	  public void prdct_checkout_verify_Tc008() {
		  
		  prdct_checkout_verify();
	  }
	  
	  @Test(priority=2)
	  public void cancel_while_chkout_verify_Tc009() {
		  
		  cancel_while_chkout_verify();
	  }
	  
	  @Test(priority=3)
	  public void verify_prdct_price_in_checkout_Tc010() {
		  
		  verify_prdct_price_in_checkout();
	  }
	 
	  
	  @BeforeMethod
	  public void beforeMethod() throws IOException {
		  launch_browser("https://www.saucedemo.com");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  close_browser();
	  }

}
