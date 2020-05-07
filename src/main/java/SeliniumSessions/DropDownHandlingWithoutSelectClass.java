package SeliniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandlingWithoutSelectClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver  driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//WebElement day=driver.findElement(By.id("day"));
		//WebElement month=driver.findElement(By.id("month"));
		//WebElement year=driver.findElement(By.id("year"));
		
		String dob="1-Jan-1965";
		
		String dayoptionxpath="//select[@id='day']/option";
		String monthoptionxpath="//select[@id='month']/option";
		String yearoptionxpath="//select[@id='year']/option";
		
		String dayoptionCSS="select#day option";
		String monthoptionCSS="select#month option";
		String yearoptionCSS="select#year option";
		
		//doSelectValueFromDropDownWithoutSelect(driver,"xpath",dayoptionxpath,dob.split("-")[0]);
		//doSelectValueFromDropDownWithoutSelect(driver,"xpath",monthoptionxpath,dob.split("-")[1]);
		//doSelectValueFromDropDownWithoutSelect(driver,"xpath",yearoptionxpath,dob.split("-")[2]);
		
		doSelectValueFromDropDownWithoutSelect(driver,"css",dayoptionCSS,dob.split("-")[0]);
		doSelectValueFromDropDownWithoutSelect(driver,"css",monthoptionCSS,dob.split("-")[1]);
		doSelectValueFromDropDownWithoutSelect(driver,"css",yearoptionCSS,dob.split("-")[2]);
		}
	
	public static void doSelectValueFromDropDownWithoutSelect(WebDriver driver,String locator,String locatorValue,String value) {
		List<WebElement> valuesList=null;
		if(locator.equals("xpath")) {
		 valuesList= driver.findElements(By.xpath(locatorValue));
		}
		else if(locator.equals("css")) {
		 valuesList= driver.findElements(By.cssSelector(locatorValue));
			
		}
        System.out.println(valuesList.size());
        for(int i=0;i<valuesList.size();i++) {
      	 if(valuesList.get(i).getText().equals(value)) {
      		 valuesList.get(i).click();
      		 break;
      	 }
        }
	
	}

}
