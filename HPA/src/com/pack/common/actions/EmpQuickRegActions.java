package com.pack.common.actions;

import org.openqa.selenium.WebDriver;

import com.pack.common.pageobjects.EmployerQuickReg;
import com.pack.utils.Errors;
import com.pack.utils.User;

public class EmpQuickRegActions extends EmployerQuickReg {
	private Errors Error;
	private EmployerQuickReg Emp;
	private WebDriver driver;
	public EmpQuickRegActions(WebDriver driver)
	{
		super(driver);
		this.setDriver(driver);
		Emp=new EmployerQuickReg(getDriver());
	    Error = new Errors();
		Error.setError(true, "Success");
		System.out.println("EmpQuickRegActions constructor  ");
	}
	public Object EmpRegFirstStage(User EmpUserInfo)
	{
		try
		{
			System.out.println("Before check emp");
			if(Emp!=null)
			{
				Emp.enterFirstName(EmpUserInfo.getFirstUserName(), 5);
				Emp.enterLastname(EmpUserInfo.getLastUserName(), 5);
				Emp.enterEmail(EmpUserInfo.getEmail(), 5);
				Emp.enterPhoneNumber(EmpUserInfo.getPhoneNumber(), 5);
				Emp.enterPassword(EmpUserInfo.getPassword(), 5);
				Emp.enterConfirmPass(EmpUserInfo.getPassword(), 5);
				
			}
			else {Error.setError(false, "Error: Employer Quick Reg Page Pointer is NULL");}
			
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
