//Aziza H Mustafa
package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Google {
	private  WebDriver driver;
	
	private  By GUSerNametextBox=By.id("Email");
	private  By GPasswordTextBox=By.id("Passwd");
	private  By GNextButton=By.id("next");
	private  By GSigninButton=By.id("signIn");
	public Google(WebDriver driver)
	{
		super();
		this.setDriver(driver);
	}
	public  void enterGUserName(String UserName, int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(GUSerNametextBox));
		WebElement UserNameLocator = getDriver().findElement(GUSerNametextBox);
		if(UserNameLocator.isDisplayed())
			UserNameLocator.sendKeys(UserName);
	}
	public  void enterGPassword(String Password,int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(GPasswordTextBox));
		WebElement PasswordLocator = getDriver().findElement(GPasswordTextBox);
		if(PasswordLocator.isDisplayed())
			PasswordLocator.sendKeys(Password);
		
	}
	public  void ClickNext(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(GNextButton));
		WebElement NextBtn = getDriver().findElement(GNextButton);
		if(NextBtn.isDisplayed())
			NextBtn.click();
	}
	public  void ClickSignIn(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(GSigninButton));
		WebElement SignInBtn = getDriver().findElement(GSigninButton);
		if(SignInBtn.isDisplayed())
			SignInBtn.click();
	}
	public  WebDriver getDriver() {
		return driver;
	}
	public  void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	

}
