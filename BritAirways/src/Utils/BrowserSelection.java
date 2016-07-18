/**
 * 
 */
package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author sukeshswathi This is to select browser to run
 *
 */
public class BrowserSelection {

	public static WebDriver driver;
	
	
	/*public BrowserSelection (WebDriver driver){
		
		
		this.driver = driver;
	}*/
	
	public void BrowserSelect() throws IOException {
		

		Properties prop = new Properties();
		
		FileInputStream fil = new FileInputStream(System.getProperty("user.dir")+ "\\src\\datadriven.properties");
		
		//FileInputStream fil = new FileInputStream("datadriven.properties");
				
		prop.load(fil);

		if(prop.getProperty("browser").equals("firefox"))

		{

			// System.setProperty("webdriver.firefox.driver", "C:\\firefox\\FirefoxSetup24.2.0esr.exe");	
			
			
		driver =new FirefoxDriver();

		}

		else if (prop.getProperty("browser").equals("chrome"))

		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sukeshswathi\\Documents\\TarunSelenium\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();

		}
		else {
			
			driver = new InternetExplorerDriver();
		}
		
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   
		//driver.manage().deleteAllCookies();
		
		
	}
	
	
	
}
