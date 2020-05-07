package SeliniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserActions {
	
	WebDriver driver;
	/**
	 * This method is used to launch the bowser/initialize the driver on the basis of given browser
	 * @param browser
	 */
	
	public WebDriver launchBrowser(String browser) {
		
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefix":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case "safari":
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver=new SafariDriver();
			break;
		
        default:
        	System.out.println("please pass correct browser "+ browser);
			break;
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		return driver;
	}
	
	/**
	 * This method id used to launch the url
	 * @param url
	 */
	
	public void launchUrl(String url) {
		driver.get(url);
	}
	
	/**
	 * This method is used to get title
	 * @return
	 */
	
	public String doGetTitle() {
		return driver.getTitle();
		
	}
	
	/**
	 * This method is used to quit the browser
	 */
	
	public void quitBrowser() {
		driver.quit();
	}
	

	     
	
	

}
