package SeleniumAssignmentSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserActionsAssign {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		
		WebElement loginORsignup =driver.findElement(By.className("link"));
		//driver.findElement(By.)
		
		Actions actions=new Actions(driver);
		actions.moveToElement(loginORsignup).build().perform();
		

	}

}
