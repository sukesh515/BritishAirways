package Tests;

import java.io.IOException;
import org.testng.annotations.Test;

import pageObjects.BookingDetailsPage;
import pageObjects.EmailWindowPage;
import pageObjects.FinalPricePage;
import pageObjects.PriceDetailsPage;
import Utils.BrowserSelection;

@Test
public class HoustonBooking extends BrowserSelection {
	
	
	public void Booking() throws IOException, InterruptedException {
	
		BrowserSelect();
		
BookingDetailsPage Booking = new BookingDetailsPage(driver);
		
	      Booking.ContiuesPopup().click();
	      Booking.From("Belfast");
	      Booking.Destination("Hyderabad, Rajiv Gandhi Intl (HYD), India");
	
	      Booking.DepatureDate().click();
	      Booking.Monthreal("December","3");
 
	
	      Booking.ReturnDate().click();
	      Booking.Monthreal("January","3");

	      Booking.Adults("2");
	      Booking.Children("1");
	
	      Booking.Search();
	
PriceDetailsPage PriceSelection = new PriceDetailsPage(driver);
	
	       PriceSelection.Outbound().click();
	       PriceSelection.Inbound().click();
	       PriceSelection.PriceDisplay().click();
	       
	       
 FinalPricePage FinalPrice = new FinalPricePage(driver);

              FinalPrice.EmailLink().click();
              FinalPrice.ChildWindowSwitch();
              
              
             
              
              
  EmailWindowPage Mailwindow = new EmailWindowPage(driver);
              
       Mailwindow.Name().sendKeys("Sukesh");
       Mailwindow.EmailAddress().sendKeys("sukesh515");
       Mailwindow.SendEmail().click();
       driver.close(); 
       
       FinalPrice.ParentWindowSwitch();
       driver.close();
              
              
              
              
              
              
	        
	
	
	
	
}

}
	