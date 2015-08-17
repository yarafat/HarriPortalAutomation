/**
* Image Cropping  Class : Contains all the elements 
* in the image Cropping page with the Selenium actions on these elements
*
* @author  Aziza Mustafa
* @version 1.0
* @since   2015-07-26 
*/
package com.pack.common.pageobjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.pack.utils.ElementActions;

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
		 ElementActions RotateRightButton=new ElementActions(driver);
		 RotateRightButton.ClickElement(RotatClockWise, WaitSeconds);
		
	}
	public  void ClickRotateLeft(int WaitSeconds)
	{
		 ElementActions RotateLeftButton=new ElementActions(driver);
		 RotateLeftButton.ClickElement(RotateCounterClockWise, WaitSeconds);
		 
	}
	public  void CickResetSettings(int WaitSeconds)
	{
		 ElementActions ResetSttingButton=new ElementActions(driver);
		 ResetSttingButton.ClickElement(ResetSettings, WaitSeconds);
		
	}
	public  void ClickSave(int WaitSeconds)
	{
		 ElementActions SaveButton=new ElementActions(driver);
		 SaveButton.ClickElement(Save, WaitSeconds);
		
	}
	public  void ClickClose(int WaitSeconds)
	{
		 ElementActions CloseButton=new ElementActions(driver);
		 CloseButton.ClickElement(ClosePopUp, WaitSeconds);
		
	}
	
    public  WebDriver getDriver() {
		return driver;
	}
	public  void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	

}
