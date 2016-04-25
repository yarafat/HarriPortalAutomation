/**
* Login page tests Class : Contains all the tests
* in the Login page 
*
* @author  Aziza Mustafa
* @version 1.0
* @since   2015-07-27
*/
package com.pack.common.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.pack.base.TestBaseSetup;
import com.pack.common.actions.LoginActions;
import com.pack.common.pageobjects.HomePage;
import com.pack.entities.Errors;

public class TestLogin extends TestBaseSetup{
	private WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver=getDriver();
	}
	
	@Test
	public void SuccessLoginViaEmail() 
	{
	
		LoginActions Login;
		HomePage Home;
	    Errors Actual;
		try
		{
			System.out.println("Login In functionality details...");
			System.out.println("Test: Success Login Via Email");
			Login=new LoginActions(driver);
			Home=new HomePage(driver);
			
			Home.clickLoginLink();
			Thread.sleep(6000);
			Assert.assertTrue(driver.findElement(By.id("username")).isDisplayed(), "Error: Login Popup is not being opened");
			Actual=(Errors) Login.LoginWithEmail("mnndbhfpFJPNUNCR12", "123123");
			Thread.sleep(6000);
			if(Actual.getStatus()==true)
			{
				Assert.assertTrue(driver.findElement(By.xpath("//*[@id='top']/div/nav/div/span/ul/li[5]/a")).isDisplayed(),"Error: Login Failed");
			}
			else {System.out.println("Error: " + Actual.getMessage());}
		}
		catch(Exception e)
		{
			System.out.println("Error: " + e.getMessage());
		}
		
	
	
	}
	
	@Test
	public void SuccessLoginViaFaceBook()
	{
	    LoginActions Login;
		HomePage Home;
	    Errors Actual;
		try
		{
		System.out.println("Login In functionality details...");
		System.out.println("Test: Success Login Via FaceBook");
		Login=new LoginActions(driver);
		Home=new HomePage(driver);
		
		Home.clickLoginLink();
		Thread.sleep(6000);
		Assert.assertTrue(driver.findElement(By.id("username")).isDisplayed(), "Error: Login Popup is not being opened");
		Actual=(Errors) Login.LoginWithFacebook("MDFKWE.MNDVFSJHGFIVEGR3@gmail.com", "ZDNFVJHRBGVUVB1");
		Thread.sleep(6000);
		if(Actual.getStatus()==true)
		{
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='top']/div/nav/div/span/ul/li[5]/a")).isDisplayed(),"Error: Login Failed");
		}
		else {System.out.println("Error: " + Actual.getMessage());}
		}
		catch(Exception e)
		{
			System.out.println("Error: " + e.getMessage());
		}
	}
	@Test
	public void SuccessLoginViaLinkedin()
	{
		LoginActions Login;
		HomePage Home;
	    Errors Actual;
	    
		try
		{
		System.out.println("Login In functionality details...");
		System.out.println("Test: Success Login Via Linkedin");
		Login=new LoginActions(driver);
		Home=new HomePage(driver);
		
		
		Home.clickLoginLink();
		Thread.sleep(6000);
		Assert.assertTrue(driver.findElement(By.id("username")).isDisplayed(), "Error: Login Popup is not being opened");
		Actual=(Errors) Login.LoginWithLinkedin("denverlZMBFJVBRY2I41U24", "11DNFGBWVIRY23OY11994azZBFVIUVRiza");
		Thread.sleep(6000);
		if(Actual.getStatus()==true)
		{
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='top']/div/nav/div/span/ul/li[5]/a")).isDisplayed(),"Error: Login Failed");
		}
		else {System.out.println("Error: " + Actual.getMessage());}
		}
		catch(Exception e)
		{
			System.out.println("Error: " + e.getMessage());
		}
		
	}
	@Test
	public void SuccessLoginViaGoogle()
	{  
		LoginActions Login;
		HomePage Home;
	    Errors Actual;
		try
		{
		System.out.println("Login In functionality details...");
		System.out.println("Test: Success Login Via Google");
		Login=new LoginActions(driver);
		Home=new HomePage(driver);
		
		
		Home.clickLoginLink();
		Thread.sleep(6000);
		Assert.assertTrue(driver.findElement(By.id("username")).isDisplayed(), "Error: Login Popup is not being opened");
		Actual=(Errors) Login.LoginWithGoogle("aziza@MDFVBQIWUhrri.ZNMGFBVIWcom", "DSHGBVWWKEBC1");
		Thread.sleep(6000);
		if(Actual.getStatus()==true)
		{
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='top']/div/nav/div/span/ul/li[5]/a")).isDisplayed(),"Error: Login Failed");
		}
		else {System.out.println("Error: " + Actual.getMessage());}
		}
		catch(Exception e)
		{
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	@Test
	public void LoginViaDeletedAccount()//Email & Pass
	{
		LoginActions Login;
		HomePage Home;
	    Errors Actual;
	    try
	    {
		System.out.println("Login In functionality details...");
		System.out.println("Test: Login Via Deleted Account");
		Login=new LoginActions(driver);
		Home=new HomePage(driver);
		
		Home.clickLoginLink();
		Thread.sleep(6000);
		Assert.assertTrue(driver.findElement(By.id("username")).isDisplayed(), "Error: Login Popup is not being opened");
		Actual=(Errors) Login.LoginWithEmail("sireen1@livJSGRBQIUVQZMNGBAe.com", "123123");//deleted account on beta
		Thread.sleep(6000);
		if(Actual.getStatus()==true)
		{
			
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='login-modal']/div/div[2]/div/div/div[3]/div/div/div/div/h-form[1]/form/p[2]")).isDisplayed(),"Error: Login Success,Acount is active , not deleted");
		}
		else {System.out.println("Error: " + Actual.getMessage());}
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Error: " + e.getMessage());
	    	
	    }
	}
	
	@Test
	public void LoginWithIncorrectCredentials()//Email & Pass
	{
		LoginActions Login;
		HomePage Home;
	    Errors Actual;
	    try
	    {
		System.out.println("Login In functionality details...");
		System.out.println("Test: Login With Incorrect Credentials");
		Login=new LoginActions(driver);
		Home=new HomePage(driver);
		
		Home.clickLoginLink();
		Thread.sleep(6000);
		Assert.assertTrue(driver.findElement(By.id("username")).isDisplayed(), "Error: Login Popup is not being opened");
		Actual=(Errors) Login.LoginWithEmail("azizaMDFBVIWQYRQIcom", "111111");//wrong password
		Thread.sleep(6000);
		if(Actual.getStatus()==true)
		{
			
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='login-modal']/div/div[2]/div/div/div[3]/div/div/div/div/h-form[1]/form/p[2]")).isDisplayed(),"Error: Login Success");
		}
		else {System.out.println("Error: " + Actual.getMessage());}
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Error: " + e.getMessage());
	    }
	}
	
	@Test
	public void LoginWithIncorrectAssociatedSocialMediaAccount()//account registered with facebook and login with linkedin
	{
		LoginActions Login;
		HomePage Home;
	    Errors Actual;
	    try
	    {
		System.out.println("Login In functionality details...");
		System.out.println("Test:Login With Incorrect Associated Social Media Account");
		Login=new LoginActions(driver);
		Home=new HomePage(driver);
		
		
		Home.clickLoginLink();
		Thread.sleep(6000);
		Assert.assertTrue(driver.findElement(By.id("username")).isDisplayed(), "Error: Login Popup is not being opened");
		Actual=(Errors) Login.LoginWithFacebook("aZNFGBVIQWBY0Bm", "ZNV AWVG21V41Y0 ");//login should fail because this account is in harri and associated with different socail media .
		Thread.sleep(6000);
		if(Actual.getStatus()==true)
		{
			Assert.assertTrue(driver.findElement(By.id("h-custom-alert-content")).isDisplayed(),"Error: Login Success");
		}
		else {System.out.println("Error: " + Actual.getMessage());}
		
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Error: " + e.getMessage());
	    }
	}
	
	public void ForgetPassword()
	{
		LoginActions Login;
		HomePage Home;
	    Errors Actual;
		try
		{
			System.out.println("Login In functionality details...");
			System.out.println("Test: Forget Password");
			Login=new LoginActions(driver);
			Home=new HomePage(driver);
			
			Home.clickLoginLink();
			Thread.sleep(6000);
			Assert.assertTrue(driver.findElement(By.id("username")).isDisplayed(), "Error: Login Popup is not being opened");
			//Actual=(Errors) Login.LoginWithEmail("aziza.muNDGFWBIEYR2OR1l.com", "123123");
			Actual=(Errors) Login.ForgetPassword("azNXFGBWIUYR0R12");
			Thread.sleep(6000);
			if(Actual.getStatus()==true)
			{
				Assert.assertTrue(driver.findElement(By.xpath("//*[@id='top']/div/nav/div/span/ul/li[3]/a")).isDisplayed(),"Error: Error while sending Reset Email");
			}
			else {System.out.println("Error: " + Actual.getMessage());}
		}
		catch(Exception e)
		{
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
