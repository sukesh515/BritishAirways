package TestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Utils.BrowserSelection;



@Test
public class FirstPage  extends BrowserSelection{

	
public void LoginBrowser() throws IOException, InterruptedException{
		
		BrowserSelect();
		
		driver.findElement(By.linkText("Continue")).click();
		
		Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='from']")));
		
		dropdown.selectByVisibleText("Belfast");
		
		driver.findElement(By.xpath(".//*[@id='planTripFlightDestination']")).sendKeys("Houston, George Bush Intercont (TX) (IAH), USA");
		
		driver.findElement(By.xpath(".//*[@id='depDate']")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	
		
		WebElement datepicker = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']"));  
		// List<WebElement> rows=datepicker.findElements(By.tagName("tr"));
		List<WebElement> columns=datepicker.findElements(By.tagName("td"));
		
		// System.out.println(columns);
		
		for (WebElement cell: columns){  
			//Select 20th Date   
			if (cell.getText().equals("22")){  
			cell.findElement(By.linkText("22")).click();  
			break;  
			 }  
			}   
		
		
		driver.findElement(By.xpath(".//*[@id='retDate']")).click();
		
        Thread.sleep(300L); 
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();	
		
		WebElement datepickerre = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']"));  
		// List<WebElement> rows=datepicker.findElements(By.tagName("tr"));
		List<WebElement> columnre=datepickerre.findElements(By.tagName("td"));
		
		
		
		
		for (WebElement cell: columnre){  
			//Select 20th Date   
			if (cell.getText().equals("24")){  
			cell.findElement(By.linkText("24")).click();  
			break;  
			 }  
			}  
		
		
		Select dropdownAdults = new Select(driver.findElement(By.xpath(".//*[@id='ad']")));
		
		dropdownAdults.selectByVisibleText("2");
		
       Select dropdownchild = new Select(driver.findElement(By.xpath(".//*[@id='ch']")));
		
		dropdownchild.selectByVisibleText("1");
		
		
		driver.findElement(By.xpath(".//*[@id='flightSearchButton']")).click();
		
		Thread.sleep(1500L);
		
		
		driver.findElement(By.id("outbound-M-1")).click();
		
		Thread.sleep(1500L);
		driver.findElement(By.id("inbound-M-2")).click();
		
		Thread.sleep(900L);
		driver.findElement(By.xpath(".//*[@id='continue']")).click();
		
		/*WebElement Pricecheck  = driver.findElement(By.xpath(".//*[@id='outBoundFlightList']/div[1]"));  

		List<WebElement> columnprice =Pricecheck.findElements(By.tagName("td"));
		
		
		for (WebElement cell: columnprice){  
			//Select 20th Date   
			if (cell.getText().equals("286")){  
			cell.findElement(By.linkText("286")).click();  
			break;  
			 }  
			}  */
		
		Thread.sleep(900L);
		
		/*WebElement Finalprice = driver.findElement(By.className("pricebackground"));
		
		System.out.println(Finalprice);
		
*/		driver.findElement(By.linkText("Email price quote")).click();
		
		driver.findElement(By.id("yourName")).sendKeys("Sukesh");
		driver.findElement(By.id("yourEmail")).sendKeys("Sukesh515@yahoo.co.in");

		driver.findElement(By.id("sendEmail")).click();
		
		
		
		
		
		
		
		
		
	}
	

	
	
}