//Aziza H Mustafa
package com.pack.common.pageobjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImageCroppingPopUp {
	private  WebDriver driver;
	
	private  String RotateLeftXpath="//*[@id='harriApp']/div[1]/div[2]/span/image-cropping/div/div[1]/div[2]/div/div/div[5]/div/div[1]";
    private  String RotateRightXpath="//*[@id='harriApp']/div[1]/div[2]/span/image-cropping/div/div[1]/div[2]/div/div/div[5]/div/div[2]";
	private  String ResetSettingsXpath ="//*[@id='harriApp']/div[1]/div[2]/span/image-cropping/div/div[1]/div[2]/div/div/div[5]/div/div[3]";
	private  String SaveButtonXpath="//*[@id='harriApp']/div[1]/div[2]/span/image-cropping/div/div[1]/div[2]/div/div/div[5]/div/div[4]";
	private  String ClosePopUpXpath="//*[@id='harriApp']/div[1]/div[2]/span/image-cropping/div/div[1]/div[2]/div/div/div[1]/div";
	
	
	private  By RotatClockWise=By.xpath(RotateRightXpath);
	private  By RotateCounterClockWise=By.xpath(RotateLeftXpath);
	private  By ResetSettings=By.xpath(ResetSettingsXpath);
	private  By ClosePopUp=By.xpath(ClosePopUpXpath);
	private  By Save=By.xpath(SaveButtonXpath);
	
	public  ImageCroppingPopUp(WebDriver driver)
	{
		this.setDriver(driver);
	}
	public String ImageCroppingPopUpTitle() {
		String pageTitle = getDriver().getTitle();
		return pageTitle;
	}
	
	public  void  ClickRotateRight(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(RotatClockWise));
		WebElement RotateRightButton=getDriver().findElement(RotatClockWise);
		if(RotateRightButton.isDisplayed())
		{
			RotateRightButton.click();
			
		}
	}
	public  void ClickRotateLeft(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(RotateCounterClockWise));		
		WebElement RotateLeftButton=getDriver().findElement(RotateCounterClockWise);
		if(RotateLeftButton.isDisplayed())
		{
			RotateLeftButton.click();
			
		}
	}
	public  void CickResetSettings(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ResetSettings));
		WebElement ResetSttingButton=getDriver().findElement(ResetSettings);
		if(ResetSttingButton.isDisplayed())
		{
			ResetSttingButton.click();
			
		}
	
	}
	public  void ClickSave(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Save));
		WebElement SaveButton=getDriver().findElement(Save);
		if(SaveButton.isDisplayed())
		{
			SaveButton.click();
			
		}
	}
	public  void ClickClose(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClosePopUp));
		WebElement CloseButton=getDriver().findElement(ClosePopUp);
		if(CloseButton.isDisplayed())
		{
			CloseButton.click();
			
		}
	}
	
    public  WebDriver getDriver() {
		return driver;
	}
	public  void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	

}
