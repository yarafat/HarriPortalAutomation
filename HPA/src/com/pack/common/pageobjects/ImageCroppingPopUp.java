//Aziza H Mustafa
package com.pack.common.pageobjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImageCroppingPopUp {
	private static WebDriver driver;
	private static WebDriverWait wait = new WebDriverWait(driver, 5);
	private static String RotateLeftXpath="//*[@id='harriApp']/div[1]/div[2]/span/image-cropping/div/div[1]/div[2]/div/div/div[5]/div/div[1]";
    private static String RotateRightXpath="//*[@id='harriApp']/div[1]/div[2]/span/image-cropping/div/div[1]/div[2]/div/div/div[5]/div/div[2]";
	private static String ResetSettingsXpath ="//*[@id='harriApp']/div[1]/div[2]/span/image-cropping/div/div[1]/div[2]/div/div/div[5]/div/div[3]";
	private static String SaveButtonXpath="//*[@id='harriApp']/div[1]/div[2]/span/image-cropping/div/div[1]/div[2]/div/div/div[5]/div/div[4]";
	private static String ClosePopUpXpath="//*[@id='harriApp']/div[1]/div[2]/span/image-cropping/div/div[1]/div[2]/div/div/div[1]/div";
	
	
	private static By RotatClockWise=By.xpath(RotateRightXpath);
	private static By RotateCounterClockWise=By.xpath(RotateLeftXpath);
	private static By ResetSettings=By.xpath(ResetSettingsXpath);
	private static By ClosePopUp=By.xpath(ClosePopUpXpath);
	private static By Save=By.xpath(SaveButtonXpath);
	
	public  ImageCroppingPopUp(WebDriver driver)
	{
		
		ImageCroppingPopUp.setDriver(driver);
	}
	public String ImageCroppingPopUpTitle() {
		String pageTitle = getDriver().getTitle();
		return pageTitle;
	}
	
	public static void  ClickRotateRight()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(RotatClockWise));
		WebElement RotateRightButton=getDriver().findElement(RotatClockWise);
		if(RotateRightButton.isDisplayed())
		{
			RotateRightButton.click();
			
		}
	}
	public static void ClickRotateLeft()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(RotateCounterClockWise));		
		WebElement RotateLeftButton=getDriver().findElement(RotateCounterClockWise);
		if(RotateLeftButton.isDisplayed())
		{
			RotateLeftButton.click();
			
		}
	}
	public static void CickResetSettings()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(ResetSettings));
		WebElement ResetSttingButton=getDriver().findElement(ResetSettings);
		if(ResetSttingButton.isDisplayed())
		{
			ResetSttingButton.click();
			
		}
	
	}
	public static void ClickSave()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(Save));
		WebElement SaveButton=getDriver().findElement(Save);
		if(SaveButton.isDisplayed())
		{
			SaveButton.click();
			
		}
	}
	public static void ClickClose()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClosePopUp));
		WebElement CloseButton=getDriver().findElement(ClosePopUp);
		if(CloseButton.isDisplayed())
		{
			CloseButton.click();
			
		}
	}
	
    public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver) {
		ImageCroppingPopUp.driver = driver;
	}
	

}
