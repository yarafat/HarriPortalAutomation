/**
* Employer  Class : Contains all the elements 
* in the Employer page with the Selenium actions on these elements
*
* @author  Aziza Mustafa
* @version 1.0
* @since   2015-07-28
*/
package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Employer {
	private WebDriver driver;
	private String BuildEmpProfileButtonXpath="//*[@id='harriApp']/div[1]/div[2]/div[1]/div[2]/button";
	private String FinedCandidateButtonXpath="//*[@id='harriApp']/div[1]/div[2]/div[2]/div/div/div/div/form/button";
	
	private By BuildProfileButton=By.xpath(BuildEmpProfileButtonXpath);
	private By FibedCandidatesButton=By.xpath(FinedCandidateButtonXpath);
	private By Location = By.id("select2-chosen-4");
	private By Location_textinput = By.id("s2id_autogen4_search");
	private By LookingFor = By.id("s2id_autogen2");
	public Employer(WebDriver driver)
	{
		super();
	    this.setDriver(driver);
		
	}
	public   String EmployerPageTitle() {
		String pageTitle = getDriver().getTitle();
		return pageTitle;
	}
	public void ClickBuildemployerProfile(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(BuildProfileButton));
		WebElement BuildEmpProfile=getDriver().findElement(BuildProfileButton);
		if(BuildEmpProfile.isDisplayed())
		{
			BuildEmpProfile.click();
			
		}
	}
	public void clickFindCandidates(int WaitSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(FibedCandidatesButton));
		WebElement FinedCandidates=getDriver().findElement(FibedCandidatesButton);
		if(FinedCandidates.isDisplayed())
		{
			FinedCandidates.click();
			
		}
	}
	public void FindCandidates_location(String location,int WaitSeconds) {
		try {
			WebElement location_btn = driver.findElement(Location);
			location_btn.click();
			WebElement location_input = driver.findElement(Location_textinput);
			location_input.sendKeys(location);
			WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("//*[@id='select2-results-4']/li/div")));
			driver.findElement(By.xpath("//*[@id='select2-results-4']/li/div"))
					.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}
	public void FindCandidates_LookingFor(String Position,int WaitSeconds) {
		try {
			WebElement looking_for = driver.findElement(LookingFor);
			looking_for.click();
			looking_for.sendKeys(Position);
			WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("//*[contains(text(),'" + Position + "')]")));
			driver.findElement(
					By.xpath("//*[contains(text(),'" + Position + "')]"))
					.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}

	}
		
	
	private WebDriver getDriver() {
		// TODO Auto-generated method stub
		return driver;
	}
	private void setDriver(WebDriver driver) {
		// TODO Auto-generated method stub
		this.driver=driver;
	}

}
