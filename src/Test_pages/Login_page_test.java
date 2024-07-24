package Test_pages;

import org.testng.annotations.Test;

import Page_objects.login_page;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.annotations.AfterMethod;

public class Login_page_test extends login_page {
	@Test(priority=1)
	  public void valid_login_vrfy_Tc_001() {
		  
		  valid_login_vrfy();
		  
	  }
	  
	  @Test(priority=2)
	  public void Invalid_login_vrfy_Tc_002() {
		  
		  invalid_login_verify();
		  
	  }
	  
	  @Test(priority=3)
	  public void logout_verify_Tc_003() {
		  
		  logout_verify();
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
