package com.pack.common.actions;

import org.openqa.selenium.WebDriver;

import com.pack.common.pageobjects.JoinUsPage;
import com.pack.entities.Candidate;
import com.pack.entities.Errors;

public class EmpRegFirstFunnelActions extends JoinUsPage{
private WebDriver driver;
private Errors Error;
private JoinUsPage JoinUsPageObj;

public EmpRegFirstFunnelActions(WebDriver driver)
{
	super(driver);
	this.setDriver(driver);
	Error=new Errors();
	JoinUsPageObj=new JoinUsPage(driver);
	Error.setError(true, "Success");
}

@Override
public WebDriver getDriver() {
	return driver;
}
@Override
public void setDriver(WebDriver driver) {
	this.driver = driver;
}
 /* fill emp basic info and choose the type is emp */
public Object EmpFirstStage(Candidate EmpInfo , Boolean IsDropped)
 {
	try
	{
		if(JoinUsPageObj!=null)
		{
			
			if(EmpInfo!=null)
			{
				if(IsDropped)
				{
					//add close functionality 
					JoinUsPageObj.clickCloseModal(10);
					JoinUsPageObj.ClickOK(10);
				}
				else 
				{
					//fill basic info 
					JoinUsPageObj.enterFirstName(EmpInfo.getFirstUserName(), 10);
					JoinUsPageObj.enterLastName(EmpInfo.getLastUserName(), 10);
					JoinUsPageObj.enterEmail(EmpInfo.getEmail(), 10);
					JoinUsPageObj.enterPhone(EmpInfo.getPhoneNumber(), 10);
					JoinUsPageObj.enterPass(EmpInfo.getPassword(), 10);
					Thread.sleep(6000);
					JoinUsPageObj.ClickContineFirst(60);
					//choose user type
					JoinUsPageObj.ChooseEmp(60);
					JoinUsPageObj.ClickContinueSeconStage(10);
					Thread.sleep(6000);
					JoinUsPageObj.ClickContinueBeforeEmpType(10);
				}
			}
			
		}
		else {Error.setError(false, "Error: JoinUsPage page Pointer is NULL");}
	}
	catch(Exception e)
	{
		
		Error.setError(false, e.getMessage());
   }
	return Error;
 }


}
