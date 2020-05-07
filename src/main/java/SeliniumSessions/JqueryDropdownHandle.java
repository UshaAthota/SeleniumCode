package SeliniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropdownHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("justAnInputBox")).click();
	   
		//1.singlevalue selection
		// SelectChoiceValues(driver,"choice 7");
		
		//2.Multi value selection
		
         SelectChoiceValues(driver,"choice 1","choice 3","choice 6 2 3");
		 
		 //3.select All the values
		 
		 //SelectChoiceValues(driver,"ALL");
		

	}
	
	//... will behave like a array
	public static void SelectChoiceValues(WebDriver driver, String... value) {
	List<WebElement> choiceList=driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
	
	if(!value[0].equalsIgnoreCase("ALL")) {
		for(int i=0;i<choiceList.size();i++) {
			String text= choiceList.get(i).getText();
			System.out.println(text);
			 for(int k=0;k<value.length;k++) { 
			if(text.equals(value[k])) {
				choiceList.get(i).click();
				break;
			   }
				
			 }

		   }
		
	  }
	else {//to select all the values
		try {
		for(int all=0;all<choiceList.size();all++) {
			choiceList.get(all).click();
		}
	}catch(Exception e) {
	  }
	}
	
	}
}
