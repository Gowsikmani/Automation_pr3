package Test_pages;

import org.testng.annotations.Test;

import Page_objects.Cart_page;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.annotations.AfterMethod;

public class Cart_page_test extends Cart_page {
	@Test(priority=1)
	  public void add_prdct_tocart_verify_Tc_004() {
		  add_prdct_tocart_verify();
	  }
	  @Test(priority=2)
	  public void remove_prdct_tocart_verify_Tc_005() {
		  remove_prdct_tocart_verify();
	  }
	  @Test(priority=3)
	  public void verify_prdct_incart_Tc_006() {
		  verify_prdct_incart();
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
