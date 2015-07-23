//Aziza H Mustafa 
package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForgetPassword {
	private static WebDriver driver;
	private static WebDriverWait wait = new WebDriverWait(driver, 5);
	
	private static String ResetButtonXpath="//*[@id='login-modal']/div/div[2]/div/div/div[3]/div/div/div/div/h-form[2]/form/div[2]/button";
	
	private static By Emailtext=By.id("reset-email");
	private static By ResetButton=By.xpath(ResetButtonXpath);
	
	public ForgetPassword(WebDriver driver)
	{
		super();
		ForgetPassword.setDriver(driver);
	}
	
	public static void enterEmail(String Email)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(Emailtext));
		WebElement EmailText=getDriver().findElement(Emailtext);
		if(EmailText.isDisplayed())
		{
			EmailText.sendKeys(Email);
		}
	}
	
	public static void ClickReset()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(ResetButton));
		WebElement ResetBtn=getDriver().findElement(ResetButton);
		if(ResetBtn.isDisplayed())
		{
			ResetBtn.click();
		}
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		ForgetPassword.driver = driver;
	}

}
