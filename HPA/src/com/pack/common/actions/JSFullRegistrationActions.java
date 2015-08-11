package com.pack.common.actions;

import org.openqa.selenium.WebDriver;

import com.pack.common.pageobjects.HomePage;
import com.pack.common.pageobjects.JSFullRegistration;
import com.pack.common.pageobjects.MainRegistration;

public class JSFullRegistrationActions {
	private HomePage Home;
	private MainRegistration MainPage;
	private JSFullRegistration FullReg;
	
	
	public JSFullRegistrationActions(WebDriver driver) {
		super();
		Home=new HomePage(driver);
		MainPage=new MainRegistration(driver);
		FullReg=new JSFullRegistration(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void MainModal(){
		
	}
	
	public void SelectUserType(){
		
	}
	

}
