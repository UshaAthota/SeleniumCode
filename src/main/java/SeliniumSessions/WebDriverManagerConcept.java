package SeliniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();//to launch chrome
		driver.get("https://www.google.com/");//to launch google
		
		String title=driver.getTitle();//to get page title
		System.out.println("page title is:"+title);

	}

}
