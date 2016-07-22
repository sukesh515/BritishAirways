package Tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.PriceSelectionPage;
import Utils.BrowserSelection;

@Test
public class HoustonBooking extends BrowserSelection {
	
	
	public void Booking() throws IOException, InterruptedException {
	
		BrowserSelect();
		
	PriceSelectionPage price = new PriceSelectionPage(driver);
		
	price.ContiuesPopup().click();
	price.From("Belfast");
	price.Destination("Houston, George Bush Intercont (TX) (IAH), USA");
	
	price.DepatureDate().click();
	price.Monthreal("December","3");
 
	
	price.ReturnDate().click();
	
	price.Monthreal("January","3");
	
	
/*	for (int i=0; i<12; i++){
		
	if(price.MonthSelect().equals("December"))
	
		price.DatePicker("22");
	    		
	else {		
	price.MonthNextTraingle().click();
		
	}
	
	}*/
	
	
	//price.MonthNextTraingle().click();
	//price.MonthNextTraingle().click();
	
	// price.DatePicker("22");
	
	
	
	
	
	/*price.MonthNextTraingle().click();
	
	price.DatePicker("28");*/
	price.Adults("2");
	price.Children("1");
	
	price.Search();
	
	
	
}

}
	