package Page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Base;

public class Checkout_page extends Base {
	
	By username = By.xpath("//*[@id='user-name']");
	By password = By.xpath("//*[@id=\'password\']");
	By login_btn = By.xpath("//*[@id=\'login-button\']");
	By addtocart_btn = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
	By cart_btn = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	By remove_btn = By.xpath("//*[@id=\'remove-sauce-labs-backpack\']");
	By hmp_product_title = By.xpath("//*[@id=\"item_4_title_link\"]/div");
	By cartp_product_title = By.xpath("//*[@id=\"item_4_title_link\"]/div");
	By checkout_btn = By.xpath("//*[@id=\'checkout\']");
	By frst_name_fld = By.xpath("//*[@id=\'first-name\']");
	By last_name_fld = By.xpath("//*[@id=\'last-name\']");
	By postalcode_fld = By.xpath("//*[@id=\'postal-code\']");
	By cancel_btn = By.xpath("//*[@id=\'cancel\']");
	By continue_btn = By.xpath("//*[@id=\'continue\']");
	By finish_btn = By.xpath("//*[@id=\'finish\']");
	By order_success_msg = By.xpath("//*[@id=\"checkout_complete_container\"]/h2");
	By Backhome_btn = By.xpath("//*[@id=\'back-to-products\']");
	By product_price = By.xpath("//*[@id=\'checkout_summary_container\']/div/div[1]/div[3]/div[2]/div[2]/div");
	
	public void prdct_checkout_verify()
	{
		WebElement we1 = dr.findElement(username);
		we1.sendKeys(excel_values(0,1));
		WebElement we2 =dr.findElement(password);
		we2.sendKeys(excel_values(1,1));
		WebElement we3 = dr.findElement(login_btn);
		we3.click();
		WebElement we4 =dr.findElement(addtocart_btn);
		we4.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement we5 = dr.findElement(cart_btn);
		we5.click();
		WebElement we6 = dr.findElement(checkout_btn);
		we6.click();
		WebElement we7 = dr.findElement(frst_name_fld);
		we7.sendKeys(excel_values(4,1));
		WebElement we8 = dr.findElement(last_name_fld);
		we8.sendKeys(excel_values(5,1));
		WebElement we9 =dr.findElement(postalcode_fld);
		String s1="678990";
		we9.sendKeys(s1);
		WebElement we13 = dr.findElement(continue_btn);
		we13.click();
		WebElement we10 = dr.findElement(finish_btn);
		we10.click();
		WebElement we11= dr.findElement(order_success_msg);
		String s2 = we11.getText();
		System.out.println(s2);
		WebElement we12 = dr.findElement(Backhome_btn);
		we12.click();
	}
	
	public void cancel_while_chkout_verify()
	{
		WebElement we1 = dr.findElement(username);
		we1.sendKeys(excel_values(0,1));
		WebElement we2 =dr.findElement(password);
		we2.sendKeys(excel_values(1,1));
		WebElement we3 = dr.findElement(login_btn);
		we3.click();
		WebElement we4 =dr.findElement(addtocart_btn);
		we4.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement we5 = dr.findElement(cart_btn);
		we5.click();
		WebElement we6 = dr.findElement(checkout_btn);
		we6.click();
		WebElement we7 = dr.findElement(cancel_btn);
		we7.click();
	}
	
	public void verify_prdct_price_in_checkout()
	{
		WebElement we1 = dr.findElement(username);
		we1.sendKeys(excel_values(0,1));
		WebElement we2 =dr.findElement(password);
		we2.sendKeys(excel_values(1,1));
		WebElement we3 = dr.findElement(login_btn);
		we3.click();
		WebElement we4 =dr.findElement(addtocart_btn);
		we4.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement we5 = dr.findElement(cart_btn);
		we5.click();
		WebElement we6 = dr.findElement(checkout_btn);
		we6.click();
		WebElement we7 = dr.findElement(product_price);
		String s1 = we7.getText();
		
		
	}

}
