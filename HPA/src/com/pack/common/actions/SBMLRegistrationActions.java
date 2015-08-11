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
		this.driver=driver;
		Error=new Errors();
		Crop=new ImageCroppingPopUp(driver);
		SBML=new SBMLRegistrationFunnelPages(driver);
		Error.setError(true, "Success");
		
		
	}
	/*Select SBML Type Stage*/
	public Object SelectEmpTypeSBML()
	{
		try
		{
			
			if(SBML!=null)
			{
				SBML.ChooseSBML(5);
				SBML.ClickContinueSBML(5);
				
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
    public Object BrandInfo(Brand BrandInfo)
    {
    	try
		{
			
			if(SBML!=null)
			{
				if(BrandInfo.getProfileLogoPath()!=null)
				{
					SBML.SelectBrandLogo(BrandInfo.getProfileLogoPath(), 5);
				    Crop.ClickSave(5);
				}
				SBML.SelectBusiness(BrandInfo.getBrandName(), BrandInfo.getBrandLocation(), 5);
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
		        SBML.ClickContineBrandInfo(5);
		        
							
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
    public Object AddLocation(Brand BrandInfo)
    {
    	try
		{
			
			if(SBML!=null)
			{
				if(BrandInfo.getEnteredLocation()!=null)
				{
				   SBML.SelectBrandLocation(BrandInfo.getEnteredLocation(), BrandInfo.getBrandLocation(), 5);
				}
				SBML.clickContinueLocations(5);
				
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
    public Object AddBrandMedia(Brand BrandInfo)
    {
    	try
		{
			
			if(SBML!=null)
			{
				if(BrandInfo.getProfileLogoPath()!=null)
				{
					SBML.ClickUploadBrandPic(BrandInfo.getProfileLogoPath(), 10);
				}
				  SBML.ClickContinueMedia(5);
				
			}
			else {Error.setError(false, "Error: SBML pages Pointer is NULL");}
			
		}
		catch(Exception e)
		{
			Error.setError(false, e.getMessage());
			
		}
		return Error;
    }
    

}
