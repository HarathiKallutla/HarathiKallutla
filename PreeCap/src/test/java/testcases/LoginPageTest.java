package testcases;

import java.io.IOException;

import com.base.BaseClass;

import pagelayer.HomePage1;
import pagelayer.LoginPageNew1;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LoginPageTest extends BaseClass {
	public LoginPageNew1 lp;
	HomePage1 homePage;
	//Step 1
	public LoginPageTest() throws IOException {
		super();
		
	}
	//Step2
	
	@BeforeMethod
	public void SSSetUp() throws IOException {
		/*
		 * Setting up browser and website to execute test scripts
		 */
		initialization();
		/*
		 * To access all login elements and actions we made an object of LoginPageNew
		 * class
		 */
		lp=new LoginPageNew1();	
	}
	@Test
	public void validateLoginnnn() throws IOException
	{
		homePage=lp.login22(prop.getProperty("username"), prop.getProperty("password"));
	
	}
}

