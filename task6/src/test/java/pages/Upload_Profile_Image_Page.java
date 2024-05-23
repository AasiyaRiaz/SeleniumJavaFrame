package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.basePage;

public class Upload_Profile_Image_Page extends basePage {
	

	public Upload_Profile_Image_Page(WebDriver driver) {
		super(driver);
	}

	By home_profileImg = By.xpath("/html/body/div[6]/div[3]/div/div/div[2]/div/div/div/div/div[1]/div[1]/a/div[1]/img");
	By button= By.xpath("/html/body/div[6]/div[3]/div/div/div[2]/div/div/main/section[1]/div[2]/div[1]/div[1]/div/div/div/button");
	
	By add_photo = By.xpath("/html/body/div[3]/div/div/div[2]/footer/div/div/div/input");
	By save_photo = By.xpath("/html/body/div[3]/div/div/div[2]/div/footer/div/div/div[2]/button/span");
	
	
	By profile_dropdown = By.xpath("/html/body/div[6]/header/div/nav/ul/li[6]/div/button/img");
	
	By sign_out_confirm = By.xpath("/html/body/div[3]/div/div/div[2]/section/footer/button[2]");
	


	public void homeProfileImgClick()
	{
		driver.findElement(home_profileImg).click();
		}
	
	public void buttonClick()
	{
		driver.findElement(button).click();
		}
	
	public void savePhotoClick()
	{
		driver.findElement(save_photo).click();
		}
	
	public void profile_DropdownClick()
	{
		driver.findElement(profile_dropdown).click();
		}
	
	public void logout()
	{
		driver.findElement(sign_out_confirm).click();
		}
	
	
}
