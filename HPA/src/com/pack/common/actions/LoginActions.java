/**
* Login Action Class : Contains all the actions 
* in the Login page with the Selenium flows
*
* @author  Aziza Mustafa
* @version 1.0
* @since   2015-07-27 
*/
package com.pack.common.actions;

import java.util.Set;

import org.openqa.selenium.WebDriver;



import com.pack.common.pageobjects.Facebookpage;
import com.pack.common.pageobjects.Google;
import com.pack.common.pageobjects.LinkedinPage;
import com.pack.common.pageobjects.LoginPage;
import com.pack.common.pageobjects.ForgetPassword;
import com.pack.entities.Errors;



public class LoginActions extends LoginPage {
	
	private  Errors Error;
	private WebDriver driver;
    private LoginPage Login;
    private Facebookpage FaceBookLogin;
    private LinkedinPage LinkedInLogin;
    private Google GoogleLogin;
    private ForgetPassword ForgetPass;
	public LoginActions(WebDriver driver)
	{
		super(driver);
		this.setDriver(driver);
		this.Login=new LoginPage(getDriver());
		Error=new Errors();
		Error.setError(true, "Success");
		System.out.println("login actions constructor  ");
	}
	public Object LoginWithEmail(String UserName, String Password)
	{
		try
		{
			System.out.println("before check login  ");
			if(Login!=null)
			{
				System.out.println("before enter user name  ");
				Login.enterUserName(UserName, 5);
				Login.enterPassword(Password, 5);
				Login.clickOnLogin(5);
			}
			else {Error.setError(false, "Error: Login Page Pointer is NULL");}
		}
		catch (Exception e)
		{Error.setError(false, e.getMessage());}
		return this.Error;
	}

	public  Object LoginWithFacebook(String FUserName, String FPassword)
	{
		try
		{
			if(Login!=null)
			{
			 String Loginhandle= getDriver().getWindowHandle();
			 Login.ClickFaceBookLogin(5);
			 Set<String> handles = getDriver().getWindowHandles();
			 for (String handle : handles) {
			        if (!handle.equals(Loginhandle)) {
			           // WebDriverWait wait = new WebDriverWait(driver, 10);
						//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(handle));
			            getDriver().switchTo().window(handle);
			            break;
			    }
			}
			 			
			 FaceBookLogin=new Facebookpage(getDriver());
			 FaceBookLogin.enterFUserName(FUserName,5);
			 FaceBookLogin.enterFPassword(FPassword,5);
			 FaceBookLogin.ClickLogin(7);
			 getDriver().switchTo().window(Loginhandle);// return the focus to the main login popup
			 
			}
			else {Error.setError(false, "Error: Login Page Pointer is NULL");}
		}
		catch(Exception e)
		{
			Error.setError(false, e.getMessage());
		}
		
		return Error;
	}
	
	public  Object LoginWithLinkedin(String LUserName, String LPassword)
	{
		try
		{
			if(Login!=null)
			{
				
			 String Loginhandle= getDriver().getWindowHandle();
			 Login.ClickLinkedInLogin(5);
			 Set<String> handles = getDriver().getWindowHandles();
			 for (String handle : handles) {
			        if (!handle.equals(Loginhandle)) {
			            //WebDriverWait wait = new WebDriverWait(driver, 10);
						//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(handle));
			            getDriver().switchTo().window(handle);
			            break;
			    }
			}
			 			
			 LinkedInLogin=new LinkedinPage(getDriver());
			 LinkedInLogin.enterLUserName(LUserName, 5);
			 LinkedInLogin.enterLPassword(LPassword, 5);
			 LinkedInLogin.ClickLogin(7);
			/* LinkedInLogin.enterLPassword(LPassword, 5);
			 LinkedInLogin.ClickLogin(7);*/
			 getDriver().switchTo().window(Loginhandle);// return the focus to the main login popup
			 
			}
			else {Error.setError(false, "Error: Login Page Pointer is NULL");}
		}
		catch(Exception e)
		{
			Error.setError(false, e.getMessage());
		}
		
		return Error;
	}
	public  Object LoginWithGoogle(String GUserName, String GPassword)
	{
		try
		{
			if(Login!=null)
			{
			
			
			 String Loginhandle= getDriver().getWindowHandle();
			 Login.ClickGooglLogin(5);
			 Set<String> handles = getDriver().getWindowHandles();
			 for (String handle : handles) {
			        if (!handle.equals(Loginhandle)) {
			          //  WebDriverWait wait = new WebDriverWait(driver, 10);
						//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(handle));
			            getDriver().switchTo().window(handle);
			            break;
			    }
			}
			 			
			GoogleLogin=new Google(getDriver());
			GoogleLogin.enterGUserName(GUserName, 5);
			GoogleLogin.ClickNext(7);
			GoogleLogin.enterGPassword(GPassword, 5);
			GoogleLogin.ClickSignIn(7);
		    getDriver().switchTo().window(Loginhandle);// return the focus to the main login popup
			 
			}
			else {Error.setError(false, "Error: Login Page Pointer is NULL");}
		}
		catch(Exception e)
		{
			Error.setError(false, e.getMessage());
		}
		
		return Error;
	}
	
	public  Object Signup()
	{

		try
		{
			if(Login!=null)
			{
			Login.ClickSignUpLink(7);
			}
			else {Error.setError(false, "Error: Login Page Pointer is NULL");}
		}
		catch(Exception e)
		{
			Error.setError(false, e.getMessage());
		}
		return Error;
	}
	
	public  Object ForgetPassword(String Email)
	{

		try
		{
			if(Login!=null)
			{
			 String Loginhandle= getDriver().getWindowHandle();
			 Login.ClicForgetLink(10);
			 Set<String> handles = getDriver().getWindowHandles();			 
			 for (String handle : handles) {
			        if (!handle.equals(Loginhandle)) {
			            //WebDriverWait wait = new WebDriverWait(driver, 10);
						//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(handle));
			            getDriver().switchTo().window(handle);
			            break;
			    }
			}
			 ForgetPass=new ForgetPassword(getDriver());
			 ForgetPass.enterEmail(Email, 5);
			 ForgetPass.ClickReset(10);
			 ForgetPass.ClickClose(5);
			
			}
			else {Error.setError(false, "Error: Login Page Pointer is NULL");}
		}
		catch(Exception e)
		{
			Error.setError(false, e.getMessage());
		}
		return Error;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	
}
