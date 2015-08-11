/**
* ElementActions  Class : Contains all the general elements 
* actions
*
* @author  Aziza Mustafa
* @version 1.0
* @since   2015-08-10
*/
package com.pack.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementActions {
	private  WebDriver driver;
	public ElementActions(WebDriver driver)
	{
		this.driver = driver;
	   
	}
	/* click buttons ,Radio Buttons and links*/
	public void ClickElement(By ElementLocator, int WaitSeconds)//waiting the visibility of the element  
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ElementLocator));
		WebElement WebelementLocator = driver.findElement(ElementLocator);
		if(WebelementLocator.isDisplayed())
			WebelementLocator.click();
		
	}
	
	/* enter text on textbox and textarea */
	public void EnterText(By ElementLocator,String Text, int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ElementLocator));
		WebElement WebelementLocator = driver.findElement(ElementLocator);
		if(WebelementLocator.isDisplayed() && WebelementLocator.isEnabled())
			WebelementLocator.sendKeys(Text);
		
	}

}
