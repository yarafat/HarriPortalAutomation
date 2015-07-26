//Aziza H Mustafa
package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkedinPage {
	private  WebDriver driver;
	
	private  By LUSerNametextBox=By.id("session_key-oauth2SAuthorizeForm");
	private  By LPasswordTextBox=By.id("session_password-oauth2SAuthorizeForm");
	private  By LLoginButton=By.name("authorize");
	private  By LCancelButton=By.xpath("//*[@id='body']/div/form/div[2]/ul/li[2]/a");
	
	public LinkedinPage(WebDriver driver)
	{
		super();
		this.setDriver(driver);
	}
	public  void enterLUserName(String UserName,int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(LUSerNametextBox));
		WebElement UserNameLocator = getDriver().findElement(LUSerNametextBox);
		if(UserNameLocator.isDisplayed())
			UserNameLocator.sendKeys(UserName);
	}
	public  void enterLPassword(String Password,int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(LPasswordTextBox));
		WebElement PasswordLocator = getDriver().findElement(LPasswordTextBox);
		if(PasswordLocator.isDisplayed())
			PasswordLocator.sendKeys(Password);
		
	}
	public  void ClickLogin(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(LLoginButton));
		WebElement LogInBtn = getDriver().findElement(LLoginButton);
		if(LogInBtn.isDisplayed())
			LogInBtn.click();
	}
	public  void ClickCancel(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(LCancelButton));
		WebElement LogInBtn = getDriver().findElement(LCancelButton);
		if(LogInBtn.isDisplayed())
			LogInBtn.click();
	}
	public  WebDriver getDriver() {
		return driver;
	}
	public  void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	

}
