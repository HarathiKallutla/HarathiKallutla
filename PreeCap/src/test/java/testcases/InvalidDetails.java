package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;

import invaliddata.InvalidClass;
import pagelayer.HomePage1;
import pagelayer.LoginPageNew1;

public class InvalidDetails extends BaseClass {
	public InvalidClass lp;
	HomePage1 homePage;
	//Step 1
	public InvalidDetails() throws IOException {
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
		lp=new InvalidClass();	
	}
	@Test
	public void validateLoginnnn() throws IOException
	{
		homePage=lp.login22(prop.getProperty("username1"), prop.getProperty("password1"));
	
	}
}
