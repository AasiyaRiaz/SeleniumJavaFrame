package pages;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import pages.basePage;

public class LinkedinLoginObjects extends basePage{
	
	
	
	public LinkedinLoginObjects(WebDriver driver) {
		super(driver);
	}


	By username_textbox = By.xpath("/html/body/main/section[1]/div/div/form/div[1]/div[1]/div/div/input");
	By password_textbox= By.xpath("/html/body/main/section[1]/div/div/form/div[1]/div[2]/div/div/input");
	By login_button = By.xpath("//*[@id=\'main-content\']/section[1]/div/div/form/div[2]/button");
	
	
	public void setTextInUsername(String email)
	{
		driver.findElement(username_textbox).sendKeys(email);
	}
	

	public void setTextInPassword(String pwd)
	{
		driver.findElement(password_textbox).sendKeys(pwd);
	}
	

	public void click_button()
	{
		driver.findElement(login_button).click();	
	}
}
 