package Task6.task6;
import objects.LinkedinLoginObjects;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Linkedin_Login_test {
		WebDriver driver = new ChromeDriver();
	 
	 
	 @BeforeTest
	 public void setup()
	 {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 
	 
	 }
	 
	 @Test
	 public void Login()
	 {
		 driver.get("https://www.linkedin.com");
		 LinkedinLoginObjects page = new LinkedinLoginObjects(driver);
		 page.setTextInUsername("linkedintest@smtp.freesmtpservers.com");
		 page.setTextInPassword("Okaay@1234");
		 page.click_button();

		 //LinkedinLogin.login_button(driver).sendKeys(Keys.RETURN);
	 }
	 
		
		@AfterTest
		public void tearDown()
		{
			driver.quit();
		}
}
