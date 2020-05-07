package SeliniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ushag\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//to launch chrome
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");//to launch url
		
		String title=driver.getTitle();//to get title
		System.out.println("page title is:"+title);
		
		//validation point:actual vs expected result
		if(title.equals("Google")) {
			System.out.println("correct title:"+ title);
		}
		else {
			System.out.println("title is not correct");
		}
		
		System.out.println(driver.getCurrentUrl());
		String url=driver.getCurrentUrl();
		
		if(url.contains("google")) {
			System.out.println("correct url");
		}
		else {
			System.out.println("incorrect url");
		}
		
		//System.out.println(driver.getPageSource());//to get page source
		
		driver.quit();

	}

}
