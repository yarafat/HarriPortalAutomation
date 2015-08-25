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
	public Object SelectEmpTypeMBML(Boolean IsDropped)
	{
		try
		{
			
			if(MBML!=null)
			{
				MBML.ChooseMBML(5);
				if(IsDropped)
				{
					MBML.clickCloseModal(5);
				}
				else 
				{
				MBML.ClickContinueMBML(5);
				}
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
	public Object AddGroupName(Brand BrandInfo, Boolean IsDropped)
	{
		try
		{
			
			if(MBML!=null)
			{
				//group or enterprise is also a brand 
				MBML.SelectGroup(BrandInfo.getBrandName(), (BrandInfo.getBrandLocation())[0].toString(), 5);
				if(BrandInfo.getMedia()!=null && BrandInfo.getMedia().getProfileUrl()!=null)
				{
					MBML.SelectGroupLogo(BrandInfo.getMedia().getProfileUrl(), 5);
					Crop.ClickSave(5);
				}
				if(IsDropped)
				{
					MBML.clickCloseModal(5);
				}
				else 
				{
				MBML.continueGroup(5);
				}
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
	public Object AddBrandMedia(Brand BrandInfo, Boolean IsDropped)
    {
    	try
		{
			
			if(MBML!=null)
			{
				if(BrandInfo.getMedia()!=null && BrandInfo.getMedia().getProfileUrl()!=null)
				{
					MBML.ClickUploadBrandPic(BrandInfo.getMedia().getProfileUrl(), 10);
				}
				if(IsDropped)
				{
					MBML.clickCloseModal(5);
				}
				else 
				{
				MBML.ClickContinueMedia(5);
				}
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
    public Object BrandInfo(Brand BrandInfo, Boolean IsDropped)
    {
    	try
		{
			
			if(MBML!=null)
			{
				if(BrandInfo.getMedia()!=null && BrandInfo.getMedia().getProfileUrl()!=null)
				{
					MBML.SelectBrandLogo(BrandInfo.getMedia().getProfileUrl(), 5);
				    Crop.ClickSave(5);
				}
				MBML.SelectBusiness(BrandInfo.getBrandName(), (BrandInfo.getBrandLocation())[0].toString(), 5);
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
		        if(IsDropped)
				{
					MBML.clickCloseModal(5);
				}
		        else 
		        {
		        MBML.ClickContineBrandInfo(5);
		        }
							
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
    public Object AddLocation(Brand BrandInfo, Boolean IsDropped)
    {
    	try
		{
			
			if(MBML!=null)
			{
				if(BrandInfo.getBrandLocation()!=null && BrandInfo.getBrandLocation().length>1)
				{
					for(int index=1;index<=BrandInfo.getBrandLocation().length;index++)//starts from index 1 because the location in index zero is the main brand location which stored by default in Db and will be shown on UI 
					{
						String EnteredLocation=((BrandInfo.getBrandLocation())[index].split(" "))[0].toString();
					    MBML.SelectBrandLocation(EnteredLocation, (BrandInfo.getBrandLocation())[index], 5);
					  Thread.sleep(2000);
					}
				}
				if(IsDropped)
				{
					MBML.clickCloseModal(5);
				}
				else 
				{
				MBML.clickContinueLocations(5);
				}
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
