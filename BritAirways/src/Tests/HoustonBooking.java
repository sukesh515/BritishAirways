package Tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.PriceSelectionPage;
import Utils.BrowserSelection;

@Test
public class HoustonBooking extends BrowserSelection {
	
	
	public void Booking() throws IOException {
	
		BrowserSelect();
		
	PriceSelectionPage price = new PriceSelectionPage(driver);
		
	price.ContiuesPopup().click();
	price.From("Belfast");
	price.Destination("Houston, George Bush Intercont (TX) (IAH), USA");
	
	price.DepatureDate().click();
	price.MonthNextTraingle().click();
	price.MonthNextTraingle().click();
	
	price.DatePicker("22");
	
	price.ReturnDate().click();
	price.MonthNextTraingle().click();
	
	price.DatePicker("28");
	price.Adults("2");
	price.Children("1");
	
	price.Search();
	
	
	
}

}
	