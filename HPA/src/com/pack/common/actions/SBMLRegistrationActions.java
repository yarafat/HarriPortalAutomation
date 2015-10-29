package com.pack.common.actions;

import org.openqa.selenium.WebDriver;

import com.pack.common.pageobjects.ImageCroppingPopUp;
import com.pack.common.pageobjects.SBMLRegistrationFunnelPages;
import com.pack.entities.Brand;
import com.pack.entities.Errors;

public class SBMLRegistrationActions extends SBMLRegistrationFunnelPages{
	private WebDriver driver;
	private Errors Error;
	private ImageCroppingPopUp Crop;
	private SBMLRegistrationFunnelPages SBML;
	public SBMLRegistrationActions(WebDriver driver)
	{
		super(driver);
		this.setDriver(driver);
		Error=new Errors();
		Crop=new ImageCroppingPopUp(driver);
		SBML=new SBMLRegistrationFunnelPages(driver);
		Error.setError(true, "Success");
		
		
	}
	/*Select SBML Type Stage*/
	public Object SelectEmpTypeSBML(Boolean IsDropped)
	{
		try
		{
			
			if(SBML!=null)
			{
				SBML.ChooseSBML(5);
				if(IsDropped)
				{
					SBML.clickCloseModal(5);
				}
				else 
				{
				SBML.ClickContinueSBML(5);
				}
			}
			else {Error.setError(false, "Error: SBML pages Pointer is NULL");}
			
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
			
			if(SBML!=null)
			{
				if(BrandInfo.getMedia()!=null && BrandInfo.getMedia().getProfileUrl()!=null)
				{
					SBML.SelectBrandLogo(BrandInfo.getMedia().getProfileUrl(), 5);
				    Crop.ClickSave(5, "//*[@id='harriApp']/div[1]/div[2]/div[1]/image-cropping/div/div[1]/div[2]/div/div/div[5]/div/div[4]");
				}
				SBML.SelectBusiness(BrandInfo.getBrandName(), (BrandInfo.getBrandLocation())[0].toString(), 5);
				SBML.SelectHecs(BrandInfo.getHecs(), 5);
				SBML.SelectCuisine(BrandInfo.getCuisine(), 5);
		        if(BrandInfo.getBusinessEmail()!=null)
		        {
		        	SBML.enterCommunicationEmail(BrandInfo.getBusinessEmail(), 5);
		        }
		        if(BrandInfo.getDescription()!=null)
		        {
		        	SBML.enterBrandDescription(BrandInfo.getDescription(), 5);
		        }
		        if(IsDropped)
				{
					SBML.clickCloseModal(5);
				}
		        else 
		        {
		        SBML.ClickContineBrandInfo(5);
		        }
							
			}
			else {Error.setError(false, "Error: SBML pages Pointer is NULL");}
			
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
			
			if(SBML!=null)
			{
				if(BrandInfo.getBrandLocation()!=null && BrandInfo.getBrandLocation().length>1)
				{

					for(int index=1;index<=BrandInfo.getBrandLocation().length;index++)//starts from index 1 because the location in index zero is the main brand location which stored by default in Db and will be shown on UI 
					{
						String EnteredLocation=((BrandInfo.getBrandLocation())[index].split(" "))[0].toString();
				        SBML.SelectBrandLocation(EnteredLocation, (BrandInfo.getBrandLocation())[index], 5);
				        Thread.sleep(2000);
					}
				}
				if(IsDropped)
				{
					SBML.clickCloseModal(5);
				}
				else
				{
				SBML.clickContinueLocations(5);
				}
			}
			else {Error.setError(false, "Error: SBML pages Pointer is NULL");}
			
		}
		catch(Exception e)
		{
			Error.setError(false, e.getMessage());
			
		}
		return Error;
    }
    /* Add Media to the selected brand */
    public Object AddBrandMedia(Brand BrandInfo, Boolean IsDropped)
    {
    	try
		{
			
			if(SBML!=null)
			{
				if(BrandInfo.getMedia()!=null && BrandInfo.getMedia().getProfileUrl()!=null)
				{
					SBML.ClickUploadBrandPic(BrandInfo.getMedia().getProfileUrl(), 10);
				}
				if(IsDropped)
				{
					SBML.clickCloseModal(5);
				}
				else 
				{
				  SBML.ClickContinueMedia(5);
				}
			}
			else {Error.setError(false, "Error: SBML pages Pointer is NULL");}
			
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
