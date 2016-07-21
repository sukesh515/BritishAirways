package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PriceSelectionPage {

	 WebDriver driver;
	
	 	 
	
	public PriceSelectionPage(WebDriver driver){
		
		this.driver = driver;
		
	}
		
	 By continues = By.linkText("Continue");
	 
	 By from = By.xpath(".//*[@id='from']");	
	 By dest = By.xpath(".//*[@id='planTripFlightDestination']");
	 
	 By depdate = By.xpath(".//*[@id='depDate']");
	 By MonthNext = By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']");
	 
	 By datePicker =By.xpath(".//*[@id='ui-datepicker-div']");
	 By retudate = By.xpath(".//*[@id='retDate']");
	
	 
      By adul = By.xpath(".//*[@id='ad']");
      By ch = By.xpath(".//*[@id='ch']");
      
      By search = By.xpath(".//*[@id='flightSearchButton']");
	 
	 
	 
		public WebElement ContiuesPopup() {
			
		return driver.findElement(continues);
					
		}
		
		public void  From(String location) {
											
			Select dropdown = new Select(driver.findElement(from));
			
			dropdown.selectByVisibleText(location);
			
			
			}
		
		public  void Destination (String desloc) {
			
	   driver.findElement(dest).sendKeys(desloc);
			
					
			
			}
		
		
		public WebElement DepatureDate(){
			
			
			return driver.findElement(depdate);
			
		}
		
		

		
		public WebElement MonthNextTraingle(){
			
			
			return driver.findElement(MonthNext);
			
		}
		
		
		
		
		public void DatePicker(String Dates) {
			
			WebElement datepickers = driver.findElement(datePicker); 
			
			List<WebElement> columns=datepickers.findElements(By.tagName("td"));
			
			for (WebElement cell: columns){  
				//Select 20th Date   
				if (cell.getText().equals(Dates)){  
				cell.findElement(By.linkText(Dates)).click();  
				break;  
				 }  
				
			}
			
				
			}
			

		
		public WebElement ReturnDate(){
					
			return driver.findElement(retudate);
			
			
		}
		
		public void  Adults(String Numbers) {
			
			Select dropdown = new Select(driver.findElement(adul));
			
			dropdown.selectByVisibleText(Numbers);
		}
		
		
           public void  Children (String Numbers) {
			
			Select dropdown = new Select(driver.findElement(ch));
			
			dropdown.selectByVisibleText(Numbers);
		}
		
		
           public void Search(){
   			
   			
   			 driver.findElement(search).click();
   			
   		}
           
           
	}
	
	
	

