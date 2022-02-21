package pagelayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;



public class LoginPageNew1 extends BaseClass {
	@FindBy(xpath="//input[@name='uid']")
	WebElement username;
	
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//*[contains(@type,'submit')]")
	WebElement LoginButton;
	

	//Initializing the Page Objects:
	public LoginPageNew1() throws IOException {
	PageFactory.initElements(driver, this);
	}
	
	
	//Action - validate Login and action on Elements
	public HomePage1 login22(String un, String pwd) throws IOException{
		/*
		 * Performing actions on identified objects
		 */
		username.sendKeys(un);
		password.sendKeys(pwd);
		LoginButton.click();
		return new HomePage1();
		
	}

}
