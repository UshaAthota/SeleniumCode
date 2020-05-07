package SeliniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		//WebDriverWait wait=new WebDriverWait(driver,15);
		//wait.until(ExpectedConditions.titleIs("HubSpot Login"));
		//wait.until(ExpectedConditions.titleContains("HubSpot"));
		
		//System.out.println(driver.getTitle());
		getElementWithExpWait(driver,15,By.id("username")).sendKeys("naveen@gmail.com");
		
//		WebDriverWait wait=new WebDriverWait(driver,15);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
		

		WebElement emailId = driver.findElement(By.id("username")); //5 secs -- 10 secs
		emailId.sendKeys("test123");
		
		WebElement password = driver.findElement(By.id("password"));//1 sec -- 14 secs
		password.sendKeys("123");
		
		WebElement loginButton = driver.findElement(By.id("loginBtn"));//0 sec -- 15 secs
		loginButton.click();
		

	}
	
	public static WebElement getElementWithExpWait(WebDriver driver,int timeout,By locator) {
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		WebElement element=wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	    return element;
	}  

}
