package Task6.task6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import config.PropertiesFile;
import pages.LinkedinLoginObjects;
import pages.Upload_Profile_Image_Page;
import Task6.task6.Linkedin_Login_test;
import Task6.task6.*;
public class linked_in_upload_profile_image extends Linkedin_Login_test {
	
	JavascriptExecutor js;

@Test
	public void upload_Profile_Image() throws AWTException, IOException, InterruptedException
	{
	 
	ExtentTest test = extent.createTest("upload profile image");
	
	Upload_Profile_Image_Page obj = new Upload_Profile_Image_Page(getDriver());
	js = (JavascriptExecutor)driver;
	
	test.log(Status.INFO, "Starting Upload Profile Image Test case");
	obj.homeProfileImgClick();
	Thread.sleep(3000);
 	test.pass("Profile Image Avatar is clicked from dashboard");
	
	obj.buttonClick();
	Thread.sleep(2000);
 	test.pass("Profile image avatar is clicked from profile");
	
	WebElement add_photo = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/footer/div/div/div/input"));
	js.executeScript("arguments[0].click()", add_photo);
	Thread.sleep(4000);
 	test.pass("Add Photo button is clicked");
		
		Robot r = new Robot();
		r.delay(2000);
		StringSelection s = new StringSelection(PropertiesFile.property.getProperty("imagePath"));
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
						
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
						
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
						
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	 	test.pass("Selected image is uploaded");
		r.delay(3000);
		
		obj.savePhotoClick();
		test.pass("Save Photo button is clicked");
		
		Thread.sleep(2000);
	 	test.log(Status.INFO, "Profile image is uploaded successfully");

	} }

