package SeliniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserActions {

	public static void main(String[] args) throws InterruptedException {

    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    
    driver.get("http://app.hubspot.com/login");
    
    Thread.sleep(5000);
    
//    WebElement emaiId=driver.findElement(By.id("username"));
//    WebElement password=driver.findElement(By.id("password"));
//    WebElement loginButton=driver.findElement(By.id("loginBtn"));
    
//     Actions actions=new Actions(driver);
//     
//     actions.sendKeys(emaiId, "naveen123@gmail.com").build().perform();
//     actions.sendKeys(password, "naveen123").build().perform();
//     actions.click(loginButton).build().perform();
     
     ElementUtil elementutil=new ElementUtil(driver);
     elementutil.doActionsSenKeys(By.id("username"), "naveen123@gmail.com");
     elementutil.doActionsSenKeys(By.id("password"), "naveen123");
     elementutil.doActionsClick(By.id("loginBtn"));
    
    
   

	}

}
