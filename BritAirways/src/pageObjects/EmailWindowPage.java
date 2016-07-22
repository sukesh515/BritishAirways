package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailWindowPage {
	
	WebDriver driver;
	
	public EmailWindowPage(WebDriver driver){
		
		this.driver=driver;
	}
		
		
		By name = By.id("yourName");
		
		By email = By.id("yourEmail");
		
		By sen = By.id("sendEmail");
		
		
		public WebElement Name() {
			
			
			return driver.findElement(name);
			
			
		}
		
		
		public WebElement EmailAddress() {
			
			
			return driver.findElement(email);
			
			
		}
		
		
         public WebElement SendEmail() {
			
			
			return driver.findElement(sen);
			
			
		}
		
		
	}
	
	


