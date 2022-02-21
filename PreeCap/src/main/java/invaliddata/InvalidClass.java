package invaliddata;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

import pagelayer.HomePage1;

public class InvalidClass extends BaseClass {
	@FindBy(xpath="//input[@name='uid']")
	WebElement username1;
	
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password1;
	
	@FindBy(xpath="//*[contains(@type,'submit')]")
	WebElement LoginButton;
	

	//Initializing the Page Objects:
	public InvalidClass() throws IOException {
	PageFactory.initElements(driver, this);
	}
	
	
	//Action - validate Login and action on Elements
	public HomePage1 login22(String un, String pwd) throws IOException{
		/*
		 * Performing actions on identified objects
		 */
		username1.sendKeys(un);
		password1.sendKeys(pwd);
		LoginButton.click();
		
		Alert alert = driver.switchTo().alert();
        alert.accept();

		return new HomePage1();
		
	}
}
