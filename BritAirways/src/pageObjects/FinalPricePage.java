package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FinalPricePage {
	
	WebDriver driver;
	
	public FinalPricePage (WebDriver driver){
		
		this.driver = driver;
		
	}
		By outb = By.id("outbound-M-4");
		
		By inb = By.id("inbound-M-1");
		
		By contin = By.xpath(".//*[@id='continue']");
		
		
		public WebElement Outbound() {
			
			
			return driver.findElement(outb);
			
		}
		
		
           public WebElement Inbound() {
			
			
			return driver.findElement(inb);
			
		}
		
		
           public WebElement PriceDisplay() {
   			
   			
   			return driver.findElement(contin);
   			
   		}
   		
		
		
		
		
	}


