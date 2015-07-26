//Aziza H Mustafa 
package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForgetPassword {
	private  WebDriver driver;
	 
	
	private  String ResetButtonXpath="//*[@id='login-modal']/div/div[2]/div/div/div[3]/div/div/div/div/h-form[2]/form/div[2]/button";
	
	private  By Emailtext=By.id("reset-email");
	private  By ResetButton=By.xpath(ResetButtonXpath);
	
	public ForgetPassword(WebDriver driver)
	{
		super();
		this.setDriver(driver);
	}
	
	public  void enterEmail(String Email,int WaitSeconds)
	{
	    WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Emailtext));
		WebElement EmailText=getDriver().findElement(Emailtext);
		if(EmailText.isDisplayed())
		{
			EmailText.sendKeys(Email);
		}
	}
	
	public  void ClickReset(int WaitSeconds)
	{
	    WebDriverWait wait = new WebDriverWait(driver,  WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ResetButton));
		WebElement ResetBtn=getDriver().findElement(ResetButton);
		if(ResetBtn.isDisplayed())
		{
			ResetBtn.click();
		}
	}

	public  WebDriver getDriver() {
		return driver;
	}

	public  void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}
