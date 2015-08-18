package com.pack.common.actions;

import org.openqa.selenium.WebDriver;

import com.pack.common.pageobjects.ImageCroppingPopUp;
import com.pack.common.pageobjects.MBMLRegistrationFunnelPage;
import com.pack.entities.Brand;
import com.pack.entities.Errors;

public class MBMLRegistrationActions extends MBMLRegistrationFunnelPage {
	private WebDriver driver;
	private Errors Error;
	private ImageCroppingPopUp Crop;
	private MBMLRegistrationFunnelPage MBML;
	public MBMLRegistrationActions(WebDriver driver)
	{
		super(driver);
		this.setDriver(driver);
		Error=new Errors();
		Crop=new ImageCroppingPopUp(driver);
		MBML=new MBMLRegistrationFunnelPage(driver);
		Error.setError(true, "Success");
		
	}
	/*Select MBML Type Stage*/
	public Object SelectEmpTypeMBML()
	{
		try
		{
			
			if(MBML!=null)
			{
				MBML.ChooseMBML(5);
				MBML.ClickContinueMBML(5);
				
			}
			else {Error.setError(false, "Error: MBML pages Pointer is NULL");}
			
		}
		catch(Exception e)
		{
			Error.setError(false, e.getMessage());
			
		}
		return Error;
	}
	/* add enterprise Group name and logo */
	public Object AddGroupName(Brand BrandInfo)
	{
		try
		{
			
			if(MBML!=null)
			{
				MBML.SelectGroup(BrandInfo.getGroupName(), BrandInfo.getGroupLocation(), 5);
				if(BrandInfo.getProfileLogoPath()!=null)
				{
					MBML.SelectGroupLogo(BrandInfo.getProfileLogoPath(), 5);
					Crop.ClickSave(5);
				}
				MBML.continueGroup(5);
				
			}
			else {Error.setError(false, "Error: MBML pages Pointer is NULL");}
			
		}
		catch(Exception e)
		{
			Error.setError(false, e.getMessage());
			
		}
		return Error;
	}
	/* add media to the main enterprise brand */
	public Object AddBrandMedia(Brand BrandInfo)
    {
    	try
		{
			
			if(MBML!=null)
			{
				if(BrandInfo.getProfileLogoPath()!=null)
				{
					MBML.ClickUploadBrandPic(BrandInfo.getProfileLogoPath(), 10);
				}
				MBML.ClickContinueMedia(5);
				
			}
			else {Error.setError(false, "Error: MBML pages Pointer is NULL");}
			
		}
		catch(Exception e)
		{
			Error.setError(false, e.getMessage());
			
		}
		return Error;
    }
	
	/* Select business and fill its required data  */
    public Object BrandInfo(Brand BrandInfo)
    {
    	try
		{
			
			if(MBML!=null)
			{
				if(BrandInfo.getProfileLogoPath()!=null)
				{
					MBML.SelectBrandLogo(BrandInfo.getProfileLogoPath(), 5);
				    Crop.ClickSave(5);
				}
				MBML.SelectBusiness(BrandInfo.getBrandName(), BrandInfo.getBrandLocation(), 5);
				MBML.SelectHecs(BrandInfo.getHecs(), 5);
				MBML.SelectCuisine(BrandInfo.getCuisine(), 5);
		        if(BrandInfo.getBusinessEmail()!=null)
		        {
		        	MBML.enterCommunicationEmail(BrandInfo.getBusinessEmail(), 5);
		        }
		        if(BrandInfo.getDescription()!=null)
		        {
		        	MBML.enterBrandDescription(BrandInfo.getDescription(), 5);
		        }
		        MBML.ClickContineBrandInfo(5);
		        
							
			}
			else {Error.setError(false, "Error: MBML pages Pointer is NULL");}
			
		}
		catch(Exception e)
		{
			Error.setError(false, e.getMessage());
			
		}
		return Error;
    	
    }
    /* add new location  */
    public Object AddLocation(Brand BrandInfo)
    {
    	try
		{
			
			if(MBML!=null)
			{
				if(BrandInfo.getEnteredLocation()!=null)
				{
					MBML.SelectBrandLocation(BrandInfo.getEnteredLocation(), BrandInfo.getBrandLocation(), 5);
				}
				MBML.clickContinueLocations(5);
				
			}
			else {Error.setError(false, "Error: MBML pages Pointer is NULL");}
			
		}
		catch(Exception e)
		{
			Error.setError(false, e.getMessage());
			
		}
		return Error;
    }
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
    

}
