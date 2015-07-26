//Aziza H Mustafa
package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebookpage {
	private  WebDriver driver;
	
	private  By FUSerNametextBox=By.id("email");
	private  By FPasswordTextBox=By.id("pass");
	private  By FLoginButton=By.id("u_0_2");
	private  By FCancelButton=By.id("u_0_3");
	private  By KeepsLoginCheckBoc=By.id("persist_box");
	
	public Facebookpage(WebDriver driver)
	{
		super();
        this.setDriver(driver);
		
	}
	public  void enterFUserName(String UserName,int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(FUSerNametextBox));
		WebElement UserNameLocator = getDriver().findElement(FUSerNametextBox);
		if(UserNameLocator.isDisplayed())
			UserNameLocator.sendKeys(UserName);
	}
	public  void enterFPassword(String Password,int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(FPasswordTextBox));
		WebElement PasswordLocator = getDriver().findElement(FPasswordTextBox);
		if(PasswordLocator.isDisplayed())
			PasswordLocator.sendKeys(Password);
		
	}
	public  void ClickLogin( int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(FLoginButton));
		WebElement LogInBtn = getDriver().findElement(FLoginButton);
		if(LogInBtn.isDisplayed())
			LogInBtn.click();
	}
	public  void CheckKeepsLogin(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(KeepsLoginCheckBoc));
		WebElement checkBoxLocator=getDriver().findElement(KeepsLoginCheckBoc);
		if(checkBoxLocator.isDisplayed())
		{
			checkBoxLocator.click();
		}
		
	}
	public  void ClickCancel(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(FCancelButton));
		WebElement LogInBtn = getDriver().findElement(FCancelButton);
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
