package SeliniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotLogIn {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		ElementUtil elementutil=new ElementUtil(driver);
		
		By username=By.id("username");
		By password=By.id("password");
		By loginbtn=By.id("loginBtn");
		By signUp=By.linkText("Sign up");
		
		driver.get("https://app.hubspot.com/login");
		
		elementutil.clickWhenReady(signUp, 6);
		
		String title =elementutil.waitForTitleToBePresent("Login", 6);
		System.out.println(title);
		
		
        elementutil.waitForElementToBePresent(username, 15).sendKeys("testing@gmail.com");
		elementutil.doSendKeys(password, "test1234");
		
		elementutil.waitForElementToBePresent(loginbtn, 5).click();//for log in button also we applied explicit wait
		elementutil.doClick(loginbtn);//this is with out explicit wait
		
		
        
	}

}
