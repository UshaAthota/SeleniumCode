package SeliniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	public static void main(String[] args) {
	
	//to get total number of link
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.amazon.in/");
		
		List<WebElement>  linksList=driver.findElements(By.tagName("a"));
		
		int totalLinks=linksList.size();
		System.out.println("Total links on the page is "+ totalLinks);

		//to print text of each link
		
		for(int i=0;i<totalLinks;i++) {
			String linksText=linksList.get(i).getText();
			if(!linksText.isEmpty()) {
			System.out.print(i+"--->"+linksText+"---->");
			
			System.out.println(linksList.get(i).getAttribute("href"));
		}
	}
  } 
}
