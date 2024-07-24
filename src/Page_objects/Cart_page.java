package Page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utilities.Base;

public class Cart_page extends Base {
	
	By username = By.xpath("//*[@id='user-name']");
	By password = By.xpath("//*[@id=\'password\']");
	By login_btn = By.xpath("//*[@id=\'login-button\']");
	By addtocart_btn = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
	By cart_btn = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	By remove_btn = By.xpath("//*[@id=\'remove-sauce-labs-backpack\']");
	By hmp_product_title = By.xpath("//*[@id=\"item_4_title_link\"]/div");
	By cartp_product_title = By.xpath("//*[@id=\"item_4_title_link\"]/div");
	
	public void add_prdct_tocart_verify()
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
		
	}
	
	public void remove_prdct_tocart_verify()
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
		WebElement we6 = dr.findElement(remove_btn);
		we6.click();
		
	}
	
	public void verify_prdct_incart()
	{
		WebElement we1 = dr.findElement(username);
		we1.sendKeys(excel_values(0,1));
		WebElement we2 =dr.findElement(password);
		we2.sendKeys(excel_values(1,1));
		WebElement we3 = dr.findElement(login_btn);
		we3.click();
		WebElement we6 = dr.findElement(hmp_product_title);
		String s1= we6.getText();
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
		WebElement we7 = dr.findElement(cartp_product_title);
		String s2 = we7.getText();
		Assert.assertEquals(s1, s2);
		
	}
	

}

