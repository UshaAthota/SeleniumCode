package SeliniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login?login/");
		
		Thread.sleep(6000);
	
		
		//1.id:
		
//		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("test123");
//		driver.findElement(By.id("loginBtn")).click();
		
//		WebElement email=driver.findElement(By.id("username"));
//		WebElement password=driver.findElement(By.id("password"));
//		WebElement loginbtn=driver.findElement(By.id("loginBtn"));
//		
//		email.sendKeys("test@gmail.com");
//		password.sendKeys("test123");
//		loginbtn.click();
		
		//2.name:
		
//		driver.findElement(By.name("username")).sendKeys("test@gmail.com");
//      driver.findElement(By.name("password")).sendKeys("login-password");
		
//		WebElement email=driver.findElement(By.name("username"));
//		WebElement password=driver.findElement(By.name("password"));
//		
//    	email.sendKeys("test@gmail.com");
//		password.sendKeys("test123");
//		
		
		
		//3.class:
		
//		driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.className("login-password")).sendKeys("test123");
		
		//4.xpath:xpath is a locator not an attribute
//		
//    	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test123");
		
		//5.css selectror:is a locator not an attribute
		
//		driver.findElement(By.cssSelector("#username")).sendKeys("test@gmail.com");
//		driver.findElement(By.cssSelector("#password")).sendKeys("test123");
//		driver.findElement(By.cssSelector("#loginBtn")).click();
		
		//6.linktext:only for links
//		
//		driver.findElement(By.linkText("Sign up")).click();
		
		//7.partiallinktext:only for links
		
		//driver.findElement(By.partialLinkText("up")).click();
		
		//8.tagname:(i used this website: https://www.freshworks.com/)
		
//		String text=driver.findElement(By.tagName("h1")).getText();
//		System.out.println(text);
		
		
		

	}

}
