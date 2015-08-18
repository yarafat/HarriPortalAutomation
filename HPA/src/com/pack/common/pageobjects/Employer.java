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

import com.pack.utils.ElementActions;
import com.pack.utils.GeneralSelectors;

public class Employer {
	private WebDriver driver;
	private String BuildEmpProfileButtonXpath="//*[@id='harriApp']/div[1]/div[2]/div[1]/div[2]/button";
	private String FinedCandidateButtonXpath="//*[@id='harriApp']/div[1]/div[2]/div[2]/div/div/div/div/form/button";
	
	private By BuildProfileButton=By.xpath(BuildEmpProfileButtonXpath);
	private By FinedCandidatesButton=By.xpath(FinedCandidateButtonXpath);
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
		 ElementActions ClickBuildProfile=new ElementActions(driver);
		 ClickBuildProfile.ClickElement(BuildProfileButton, WaitSeconds);
		
	}
	public void clickFindCandidates(int WaitSeconds) 
	{
		ElementActions ClickFinedCandidates=new ElementActions(driver);
		ClickFinedCandidates.ClickElement(FinedCandidatesButton, WaitSeconds);
		
	}
	public void FindCandidates_location(String EnteredLcation,String TargedLocation,int WaitSeconds)
	{
		GeneralSelectors SelectLocations=new GeneralSelectors(driver);
		SelectLocations.SelectLocation(Location, Location_textinput, EnteredLcation, TargedLocation, WaitSeconds);
		/*try {
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
		}*/
	}
	public void FindCandidates_LookingFor(String Position,int WaitSeconds) throws InterruptedException 
	{
		GeneralSelectors SelectPosition=new GeneralSelectors(driver);
	     SelectPosition.SelectPosition(LookingFor, Position, WaitSeconds);
		
		/*try {
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
		}*/

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
