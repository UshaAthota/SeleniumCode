package SeleniumAssignmentSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUpAssign1 {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #1")).click();
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handler=driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		String parentwindowId =it.next();
		System.out.println("parent window Id is :"+parentwindowId);
		
		String firstchildwindowID=it.next();
		System.out.println("first child window Id is :"+firstchildwindowID);
		
		String secondchildwindowID=it.next();
		System.out.println("second child window Id is :"+secondchildwindowID);
		
		
		driver.switchTo().window(firstchildwindowID);
		System.out.println("first child window title is :"+ driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(secondchildwindowID);
		System.out.println("second child window title is :"+ driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentwindowId);
		System.out.println("parent window title is :"+ driver.getTitle());
		
		driver.switchTo().window(parentwindowId);

	}

}
