//Aziza H Mustafa 
package com.pack.common.actions;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pack.common.pageobjects.Facebookpage;
import com.pack.common.pageobjects.Google;
import com.pack.common.pageobjects.LinkedinPage;
import com.pack.common.pageobjects.LoginPage;
import com.pack.common.pageobjects.ForgetPassword;
import GeneralClasses.*;


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
		Errors.setError(true, "Success");
	}
	public Object LoginWithEmail(String UserName, String Password)
	{
		try
		{
			
			if(Login!=null)
			{
				Login.enterUserName(UserName, 5);
				Login.enterPassword(Password, 5);
				Login.clickOnLogin(7);
			}
			else {Errors.setError(false, "Login Page Pointer is NULL");}
		}
		catch (Exception e)
		{Errors.setError(false, e.getMessage());}
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
			            WebDriverWait wait = new WebDriverWait(driver, 10);
						wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(handle));
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
			else {Errors.setError(false, "Login Page Pointer is NULL");}
		}
		catch(Exception e)
		{
			Errors.setError(false, e.getMessage());
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
			            WebDriverWait wait = new WebDriverWait(driver, 10);
						wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(handle));
			            getDriver().switchTo().window(handle);
			            break;
			    }
			}
			 			
			 LinkedInLogin=new LinkedinPage(getDriver());
			 LinkedInLogin.enterLUserName(LUserName, 5);
			 LinkedInLogin.enterLPassword(LPassword, 5);
			 LinkedInLogin.ClickLogin(7);
			 getDriver().switchTo().window(Loginhandle);// return the focus to the main login popup
			 
			}
			else {Errors.setError(false, "Login Page Pointer is NULL");}
		}
		catch(Exception e)
		{
			Errors.setError(false, e.getMessage());
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
			            WebDriverWait wait = new WebDriverWait(driver, 10);
						wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(handle));
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
			else {Errors.setError(false, "Login Page Pointer is NULL");}
		}
		catch(Exception e)
		{
			Errors.setError(false, e.getMessage());
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
			else {Errors.setError(false, "Login Page Pointer is NULL");}
		}
		catch(Exception e)
		{
			Errors.setError(false, e.getMessage());
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
			            WebDriverWait wait = new WebDriverWait(driver, 10);
						wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(handle));
			            getDriver().switchTo().window(handle);
			            break;
			    }
			}
			 ForgetPass=new ForgetPassword(getDriver());
			 ForgetPass.enterEmail(Email, 5);
			 ForgetPass.ClickReset(10);
			
			}
			else {Errors.setError(false, "Login Page Pointer is NULL");}
		}
		catch(Exception e)
		{
			Errors.setError(false, e.getMessage());
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
