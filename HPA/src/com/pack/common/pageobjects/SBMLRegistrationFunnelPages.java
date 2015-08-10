package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SBMLRegistrationFunnelPages {
	private  WebDriver driver;
	/* Employer Type SBML*/
	private String SBMLXpath="//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[4]/div/form/div[2]/div[3]/label/span";
	private String ContinueSBMlXpath="//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[4]/div/form/div[4]/button";
	private By SBMLRadioBtn=By.xpath(SBMLXpath);
	private By ContinueSBMLBtn=By.xpath(ContinueSBMlXpath);
	
	public SBMLRegistrationFunnelPages(WebDriver driver)
	{
		this.driver = driver;
	}
	/* Employer type SBML choose methods */
	 public void ChooseSBML(int WaitSeconds)
	 {

			WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
			wait.until(ExpectedConditions.visibilityOfElementLocated(SBMLRadioBtn));
			WebElement SBML = driver.findElement(SBMLRadioBtn);
			if(SBML.isDisplayed())
				SBML.click();
	 }
	 public void ClickContinueSBML(int WaitSeconds)
	 {

			WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
			wait.until(ExpectedConditions.visibilityOfElementLocated(ContinueSBMLBtn));
			WebElement Continue = driver.findElement(ContinueSBMLBtn);
			if(Continue.isDisplayed())
				Continue.click();
	 }
	 
	 
	
	

}
