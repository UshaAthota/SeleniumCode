package SeliniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	//By locators---page objects:
	
	
      static By emailId=By.id("username");
      static By password=By.id("password");
      static By loginButton=By.id("loginBtn");
      static By signupLink=By.linkText("Sign up");
      static By homePageHeader=By.cssSelector("h1.private-page__title");
       
       public static void main(String args[]) throws InterruptedException {
       
       BrowserActions br=new BrowserActions();
      WebDriver driver= br.launchBrowser("chrome");
      
      br.launchUrl("http://app.hubspot.com/login/");
      
      //credentials for the above site email:usha.athota@gmail.com password:Ushadgr8
      
      Thread.sleep(5000);
      
      ElementUtil elementUtil=new ElementUtil(driver);
      
//      elementUtil.getElement(emailId).sendKeys("naveenanimation30@gmail.com");
//      elementUtil.getElement(password).sendKeys("Test@1234");
//      elementUtil.getElement(loginButton).click();
      
      elementUtil.doSendKeys(emailId, "usha.athota@gmail.com");
      elementUtil.doSendKeys(password, "Ushadgr8");
      elementUtil.doClick(loginButton);
      
      Thread.sleep(5000);
      String header= elementUtil.dogetText(homePageHeader);
      System.out.println("home page header is "+header);
      
      if(header.equals("Sales Dashboard")) {
    	  System.out.println("user has logged in successfully");
     }
      else {
 	  System.out.println("could not login");
      }
      
      System.out.println(br.doGetTitle());
   }
}
