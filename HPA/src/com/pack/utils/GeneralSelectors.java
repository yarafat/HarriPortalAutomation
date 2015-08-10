package com.pack.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeneralSelectors {
	private  WebDriver driver;
	public GeneralSelectors(WebDriver driver)
	{
		this.driver = driver;
	   
	}
	
	 public  void SelectBusiness(By BusinessDropDown,By BusinessSearchBox ,String BusinessName, String Address,int WaitSeconds)
		{
			WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
			wait.until(ExpectedConditions.visibilityOfElementLocated(BusinessDropDown));
			WebElement BusinessDroplocator=driver.findElement(BusinessDropDown);
			 WebElement Item;	
			if(BusinessDroplocator.isDisplayed())
			{
				BusinessDroplocator.click();
				WebElement BusinessSearchText = (new WebDriverWait(driver, 10))
						  .until(ExpectedConditions.visibilityOfElementLocated(BusinessSearchBox));
				if(BusinessSearchText.isDisplayed()||BusinessSearchText.isEnabled())
				{
					BusinessSearchText.sendKeys(BusinessName);
					
					if(Address!=null && !Address.isEmpty())
					{
					       Item=(new WebDriverWait(driver, 60))
							   .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//small[contains(text(),'"+Address+"')]")));
					}
					else
					{
					       Item=(new WebDriverWait(driver, 60))
							   .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//strong[contains(text(),'"+BusinessName+"')]")));
					}
				
					 Item.click();
					
					
				}
			}
		}
	 public  void SelectHecs(By HecsDropDown,String HecsText,int WaitSeconds) throws InterruptedException	
	    {
	    	WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(HecsDropDown));
	    	Thread.sleep(6000);
	    	WebElement HecsDrop=driver.findElement(HecsDropDown);
	    	HecsDrop.click();
	    	Thread.sleep(6000);
	    	WebElement	 Item=(new WebDriverWait(driver, 60))
					   .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'"+HecsText+"')]")));
	    	
	    	Item.click();
	    }
	 public  void SelectCuisine(By CuisineDropDown,String CuisineText,int WaitSeconds)
	    {
	    	WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(CuisineDropDown));
	    	WebElement CuisineDrop=driver.findElement(CuisineDropDown);
	    	CuisineDrop.click();
	    	WebElement	 Item=(new WebDriverWait(driver, 60))
					   .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'"+CuisineText+"')]")));
	    	
	    	Item.click();
	    }
	 public  void SelectLogo( By UploadPicButton,String LogoPath,int WaitSeconds)
	    {
	    	WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(UploadPicButton));
	    	    	
	    	//click select button
	    	WebElement UploadButtonLocator=driver.findElement(UploadPicButton);
	    	if(UploadButtonLocator.isDisplayed())
	    	{
	    		UploadButtonLocator.click();
	    	}
	    	try {
				Thread.sleep(60000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    	setClipboardData(LogoPath);
	    	//native key strokes for CTRL, V and ENTER keys
	    	Robot robot;
			try {
				robot = new Robot();
				robot.keyPress(KeyEvent.VK_CONTROL);
		    	robot.keyPress(KeyEvent.VK_V);
		    	robot.keyRelease(KeyEvent.VK_V);
		    	robot.keyRelease(KeyEvent.VK_CONTROL);
		    	robot.keyPress(KeyEvent.VK_ENTER);
		    	robot.keyRelease(KeyEvent.VK_ENTER);
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    }
	 public  void setClipboardData(String string) 
	    {
	    	   StringSelection stringSelection = new StringSelection(string);
	    	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	    }
	
	 public void SelectLocation(By LocationsDDlLocator,By LocationSearchBoxLocator,String BrandLocation, String ChoosenLocation,int WaitSeconds)
	 {
			WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
			wait.until(ExpectedConditions.visibilityOfElementLocated(LocationsDDlLocator));
			WebElement LocationDroplocator=driver.findElement(LocationsDDlLocator);
			 WebElement Item;	
			if(LocationDroplocator.isDisplayed())
			{
				LocationDroplocator.click();
				WebElement LocationSearchText = (new WebDriverWait(driver, 10))
						  .until(ExpectedConditions.visibilityOfElementLocated(LocationSearchBoxLocator));
				if(LocationSearchText.isDisplayed()||LocationSearchText.isEnabled())
				{
					LocationSearchText.sendKeys(BrandLocation);
					
					if(ChoosenLocation!=null && !ChoosenLocation.isEmpty())
					{
					       Item=(new WebDriverWait(driver, 60))
							   .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'"+ChoosenLocation+"')]")));
					}
					else
					{
					       Item=(new WebDriverWait(driver, 60))
							   .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'"+BrandLocation+"')]")));
					}
				
					 Item.click();
					
					
				}
			}
		 		 
	 }
}
