package SeliniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationConcept {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();//to launch chrome
		driver.get("https://www.google.com/");//to launch google
	
		driver.navigate().to("http://www.rediff.com/");
		//driver.get(),driver.navigate().to() both are userd for launching the url
		//but if we use driver.get() driver waits until the page is fully loaded then only next driver action will be performed
		//where as in driver.navigate().to() driver is not holding
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().back();
		
		driver.navigate().refresh();

	}

}
