package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base extends Excel_daata {
	
	static public WebDriver dr;
	

	public void launch_browser(String url) throws IOException {
		
		/*ChromeOptions opt = new ChromeOptions();
		opt.addExtensions(new File("adblock.crx"));*/
		
		
		System.setProperty("WebDriver.chrome.driver","chromedriver.exe" );
	    dr = new ChromeDriver();
	    dr.get(url);
	    dr.manage().window().maximize();
		
		
		}
	
	public static void close_browser() {
		dr.close();
	}
	
	public static void get_scrn_shot(String Filename) throws IOException {
		
		String File_path = "C:\\Users\\LENOVO\\Desktop\\selenium assignments\\Screenshots\\";
		String fullpath = File_path+Filename;
		TakesScreenshot scr_shot= ((TakesScreenshot)dr);
		File f =scr_shot.getScreenshotAs(OutputType.FILE);
	    File loc =new File(fullpath);
	    FileUtils.copyFile(f, loc);
	}


}
