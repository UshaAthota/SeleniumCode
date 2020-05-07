package SeleniumAssignmentSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUpAssign {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #1")).click();
		Set<String> handler=driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		
		String parentwindowID=it.next();
		System.out.println("parent window id is :"+ parentwindowID);
		
		String firstChildwindowID =it.next();
		System.out.println("1st Child window id is :"+ firstChildwindowID);
		
		driver.switchTo().window(firstChildwindowID);
		System.out.println("1st Child window title is :"+ driver.getTitle());
		
		driver.close();
		driver.switchTo().window(parentwindowID);
		System.out.println("parent window title is :"+driver.getTitle());
		
		driver.switchTo().window(parentwindowID);
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handler1=driver.getWindowHandles();
		Iterator<String> it1=handler1.iterator();
		String nextparentwindowID=it1.next();
		System.out.println("next parent window id is :"+ nextparentwindowID);
		
		String secondChildwindowID =it1.next();
		System.out.println("second child window id is :"+ secondChildwindowID);
		
	    driver.switchTo().window(secondChildwindowID);
		System.out.println("second child window title is :"+driver.getTitle());
		driver.close();
		driver.switchTo().window(nextparentwindowID);
		System.out.println("next parent window title is :"+driver.getTitle());
		
		driver.switchTo().window(parentwindowID);

	}

}
