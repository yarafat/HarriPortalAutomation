package com.pack.common.tests;

import java.sql.Date;

import org.apache.james.mime4j.field.datetime.DateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.actions.EmpQuickRegActions;
import com.pack.common.pageobjects.HomePage;
import com.pack.utils.EmailsGenerator;
import com.pack.utils.Errors;
import com.pack.utils.User;
import com.pack.common.pageobjects.Employer;
public class EmployerQuickRegTest extends TestBaseSetup{
private WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver=getDriver();
	}
	private User SetEmpInfo(User empInfo)
	{
		EmailsGenerator Email=new EmailsGenerator();
		Email.SetEmail("EMPLOYER");
		if(empInfo!=null)
		{
			empInfo.setFirstUserName("Test");
			empInfo.setLastUserName("Test");
			empInfo.setPhoneNumber("0597395494");
			empInfo.setEmail(Email.getEmail());
			empInfo.setPassword("123123");
			
		}
		return empInfo;
	}
	@Test
	public void TestEmpReg()
	{
		HomePage Home;
	    EmpQuickRegActions EmpReg;
	    Employer Emp;
	    User NewEmp;
	    try
	    {
	    	System.out.println("Employer Quick Registration functionality details...");
			System.out.println("Test: Employer Quick Registration First Stage ");
			Home=new HomePage(driver);
			EmpReg=new EmpQuickRegActions(driver);
			Emp=new Employer(driver);
			NewEmp=new User();
			Home.clickEmployersLink();
			Emp.ClickBuildemployerProfile(7);
			Thread.sleep(6000);
			EmpReg.EmpRegFirstStage(SetEmpInfo(NewEmp));
			
			
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Error: " + e.getMessage());
	    }
	}
	

}
