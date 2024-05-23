package Task6.task6;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import config.PropertiesFile;
import pages.LinkedinLoginObjects;


public class Linkedin_Login_test {
	
	public static ExtentReports extent;
	WebDriver driver;
	LinkedinLoginObjects page;
	
	@BeforeSuite
	public void setup()
	{
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	
	@BeforeMethod
    public void beforemethodMethod() throws IOException, InterruptedException  {
    		PropertiesFile.getProperties();
    	   	driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
   		 	driver.manage().deleteAllCookies();
   		 	driver.get(PropertiesFile.property.getProperty("url"));   

   		 	page = new LinkedinLoginObjects(this.driver);
   		 	page.setTextInUsername(PropertiesFile.property.getProperty("email"));
   		 	page.setTextInPassword(PropertiesFile.property.getProperty("password"));
   		 	page.click_button();
   		 	Thread.sleep(3000);
        } 
   
	
	@AfterMethod
    public void afterMethodmethod() {
            driver.quit();      
   }
	

    public WebDriver getDriver() {
        return driver;
    }

    @AfterSuite
    public void tearDown()
    {
    	   extent.flush();
    }
		   
}
		