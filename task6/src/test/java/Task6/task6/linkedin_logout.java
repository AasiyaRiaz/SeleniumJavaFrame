package Task6.task6;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pages.Upload_Profile_Image_Page;

public class linkedin_logout extends Linkedin_Login_test {


	@Test
	public void linked_logout_f() throws AWTException, IOException, InterruptedException
	{

	ExtentTest test1 = extent.createTest("logout");
	
	Upload_Profile_Image_Page obj1 = new Upload_Profile_Image_Page(getDriver());
	
	test1.log(Status.INFO, "Starting logout Test case");
	
	obj1.profile_DropdownClick();
	Thread.sleep(2000);
	test1.pass("Dropdown is opened from header");
	
	driver.findElement(By.linkText("Sign Out")).click();
	Thread.sleep(2000); 
	
	test1.pass("User is logged out from app");
	
	//obj1.logout();
	//Thread.sleep(2000); 
}
	
}
