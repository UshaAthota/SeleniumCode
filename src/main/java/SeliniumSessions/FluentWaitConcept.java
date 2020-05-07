package SeliniumSessions;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {

	public static void main(String[] args) {
		//explicit wait:
		//1.WebDriverwait
		//2.Fluentwait
		//a.Timeout b.Polling period c.ignoringExceptuions
		
		//when to use fluent wait:
		//for handling Ajax components(means with out refreshinh the page to update particular section of the page)
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		final By username=By.name("username");
		By password=By.name("password");
		By loginbtn=By.xpath("//input[@value='Login']");
		
		waitForElementWithFluentWait(driver,username).sendKeys("naveen123@gmail.com");
		driver.findElement(password).sendKeys("test123");
		driver.findElement(loginbtn).click();

	}
	
	public static WebElement waitForElementFluentWait(WebDriver driver,final By locator) {
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);
     WebElement element=wait.until(ExpectedConditions.presenceOfElementLocated(locator));
     return element;
	}
	
	public static WebElement waitForElementWithFluentWait(WebDriver driver,final By locator) {
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);
        WebElement element=wait.until(new Function<WebDriver,WebElement>(){

        @Override
           public WebElement apply(WebDriver driver) {
	            return driver.findElement(locator);
          }

       });
	
       return element;
	}

}
