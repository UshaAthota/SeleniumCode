package SeliniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownhandleWithSelect {

	public static void main(String[] args) {
		
		//select html tag based drop downs
		
		WebDriverManager.chromedriver().setup();
		WebDriver  driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		
		Select select=new Select(day);
		select.selectByVisibleText("3");
		select.selectByIndex(20);
		select.selectByValue("9");
//		
//		Select select1=new Select(month);
//		select1.selectByVisibleText("june");
//		select1.selectByValue("2");
//		
//		Select select2=new Select(year);
//		select2.selectByVisibleText("1988");
		
		//to get all the values from day dropdown
//		
//		List<WebElement> dayList=select.getOptions();
//		System.out.println("total values in the day dropdown is :"+dayList.size());
//		for(int i=0;i<dayList.size();i++) {
//			System.out.println(dayList.get(i).getText());
//		}
//		
//		//to get all the values from month dropdown
//		
//		Select selectmnth=new Select(month);
//		
//		List<WebElement> monthList=selectmnth.getOptions();
//		System.out.println("total values in the month dropdown is :"+monthList.size());
//		for(int i=0;i<monthList.size();i++) {
//			System.out.println(monthList.get(i).getText());
//		}
//		
//		//to get all the values from month dropdown
//		
//        Select selectyear=new Select(year);
//		
//		List<WebElement> yearList=selectyear.getOptions();
//		System.out.println("total values in the month dropdown is :"+yearList.size());
//		for(int i=0;i<yearList.size();i++) {
//			System.out.println(yearList.get(i).getText());
//		}
		
		selectDropdown(day,"2");
		selectDropdown(month,"Feb");
		selectDropdown(year,"2018");
		
		getAllvaluesfromdropdown(day);
		getAllvaluesfromdropdown(month);
		getAllvaluesfromdropdown(year);
		
		
}
	
	public static void getAllvaluesfromdropdown(WebElement element) {
		Select select=new Select(element);
		List<WebElement> optionsList=select.getOptions();
		System.out.println("total values in the dropdown is :"+optionsList.size());
		for(int i=0;i<optionsList.size();i++) {
		   System.out.println(optionsList.get(i).getText());
	   }
    }
	
	public static void selectDropdown(WebElement element,String value) {
		Select select=new Select(element);
		select.selectByVisibleText(value);
	}
		
	public static void selectDropdown(WebElement element,int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
		
	}
		
	

}
