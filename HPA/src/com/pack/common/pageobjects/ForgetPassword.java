/**
* Forget Password Class : Contains all the elements 
* in the Forget Password page with the Selenium actions on these elements
*
* @author  Aziza Mustafa
* @version 1.0
* @since   2015-07-26 
*/ 
package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.pack.utils.ElementActions;

public class ForgetPassword {
	private  WebDriver driver;
	 
	
	private  String ResetButtonXpath="//*[@id='login-modal']/div/div[2]/div/div/div[3]/div/div/div/div/h-form[2]/form/div[2]/button";
	
	private  By Emailtext=By.id("reset-email");
	private  By ResetButton=By.xpath(ResetButtonXpath);
	private  By CloseButton=By.xpath("//*[@id='login-modal']/div/div[2]/div/div/div[3]/div/div/div/div/h-form[3]/div[2]/button");
	public ForgetPassword(WebDriver driver)
	{
		super();
		this.setDriver(driver);
	}
	
	public  void enterEmail(String Email,int WaitSeconds)
	{
		ElementActions EmailText=new ElementActions(driver);
		EmailText.EnterText(Emailtext, Email, WaitSeconds);
		
	}
	
	public  void ClickReset(int WaitSeconds)
	{
		 ElementActions ResetBtn=new ElementActions(driver);
		 ResetBtn.ClickElement(ResetButton, WaitSeconds);
		
	}
   public void ClickClose(int WaitSeconds)
   {
	     ElementActions CloseBtn=new ElementActions(driver);
	     CloseBtn.ClickElement(CloseButton, WaitSeconds);
		 
   }
	public  WebDriver getDriver() {
		return driver;
	}

	public  void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}
