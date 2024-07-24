package Page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Base;

public class login_page extends Base {
	
	By username = By.xpath("//*[@id='user-name']");
	By password = By.xpath("//*[@id=\'password\']");
	By login_btn = By.xpath("//*[@id=\'login-button\']");
	By menu_btn = By.xpath("//*[@id=\'react-burger-menu-btn\']");
	By logout_btn = By.xpath("//*[@id=\'logout_sidebar_link\']");
	
	public void valid_login_vrfy() 
	{
		
		WebElement we1 = dr.findElement(username);
		we1.sendKeys(excel_values(0,1));
		WebElement we2 =dr.findElement(password);
		we2.sendKeys(excel_values(1,1));
		WebElement we3 = dr.findElement(login_btn);
		we3.click();
		
	}
	
	public void invalid_login_verify()
	{
		WebElement we1 = dr.findElement(username);
		we1.sendKeys(excel_values(2,1));
		WebElement we2 =dr.findElement(password);
		we2.sendKeys(excel_values(3,1));
		WebElement we3 = dr.findElement(login_btn);
		we3.click();
	}
	
	public void logout_verify()
	{
		WebElement we1 = dr.findElement(username);
		we1.sendKeys(excel_values(0,1));
		WebElement we2 =dr.findElement(password);
		we2.sendKeys(excel_values(1,1));
		WebElement we3 = dr.findElement(login_btn);
		we3.click();
		WebElement we4 = dr.findElement(menu_btn);
		we4.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement we5 = dr.findElement(logout_btn);
		we5.click();
	}

}
