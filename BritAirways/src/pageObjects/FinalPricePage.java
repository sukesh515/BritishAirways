package pageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FinalPricePage {
	
	WebDriver driver;
	String parentid;
	 String childid;
	
	public FinalPricePage (WebDriver driver){
		
		this.driver = driver;
		
	}
		By Email = By.linkText("Email price quote");
		

		
		
		public WebElement EmailLink() {
			
			
			return driver.findElement(Email);
			
		}
		
		
           
		public WebDriver ChildWindowSwitch(){
			

	         Set<String> ids = driver.getWindowHandles();
	         
	         Iterator<String> it = ids.iterator();
	         
	          parentid = it.next();
	          childid = it.next();
			
			return  driver.switchTo().window(childid);
			
		}
		
		public WebDriver ParentWindowSwitch(){
		
			return  driver.switchTo().window(parentid);
		
	}

}
