package SeliniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		By username=By.id("username");
		By password=By.id("password");
		By loginbtn=By.id("loginBtn");
		
		getElementWithWait(driver,username,6 ).sendKeys("naveen123@gmail.com");
		driver.findElement(password).sendKeys("test123");
		driver.findElement(loginbtn).click();
		
		

	}
	
	public static WebElement getElementWithWait(WebDriver driver,By locator,int timeout) {
		WebElement element= null;
		for(int i=0;i<timeout;i++) {
			try {
			element=driver.findElement(locator);
			break;
		    }
			catch(Exception e) {
				System.out.println("Waiting for element to be present on the page--->"+i+"sec");
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e1) {
				
			     }
			}
			
			
	     }
		return element;

     }
	
	public static boolean isElementDisplayed(WebDriver driver,By locator,int timeout) {
		WebElement element= null;
		boolean flag=false;
		for(int i=0;i<timeout;i++) {
			try {
			element=driver.findElement(locator);
			element.isDisplayed();
			break;
		    }
			catch(Exception e) {
				System.out.println("Waiting for element to be present on the page--->"+i+"sec");
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e1) {
				
			     }
			}
			
			
	     }
		return flag;

     }
}
