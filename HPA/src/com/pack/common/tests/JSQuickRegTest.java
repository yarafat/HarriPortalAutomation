package com.pack.common.tests;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import com.pack.base.DataBaseSetup;
import com.pack.base.TestBaseSetup;
import com.pack.common.actions.JSQuickRegistrationAction;
import com.pack.common.pageobjects.JSQuickRegistration;
import com.pack.utils.CandidateParser;
import com.pack.utils.EmailsGenerator;
import com.pack.entities.User;
import com.pack.entities.UserAbout;
import com.pack.entities.UserEducation;
import com.pack.entities.Media;
import com.pack.entities.UserReferences;
import com.pack.entities.UserWorkHistory;

public class JSQuickRegTest extends TestBaseSetup {
	private JSQuickRegistration JSQuickRegPage;
	private WebDriver driver;
	private JSQuickRegistrationAction action;
	private String[] skills = { "Inventory Management", "Social Media" };
	private UserEducation testUserEdu;
	private UserWorkHistory testUserHis;
	private UserAbout testUserAbout;
	private Media testUserMeida;
	private UserReferences testUserRef;
	private EmailsGenerator CanEmail = new EmailsGenerator();
	private CandidateParser parser;
	private User testCan;
	String Email;
	private DataBaseSetup db;

	@BeforeClass
	public void setUp() {
		db= new DataBaseSetup();
		System.out.println("testing DB connection");
		db.InitiateConnection();
		String sql="Select * from user where id='5054'";
		db.ExcuteQuery(sql);
		driver = getDriver();
		JSQuickRegPage=new JSQuickRegistration(driver);
		action = new JSQuickRegistrationAction(driver);
		try {
			parser=new CandidateParser(3);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		CanEmail.SetEmail("Sireen");
		testCan=parser.parse();
		Email = CanEmail.getEmail();
		testCan.setEmail(Email);
		testUserHis=parser.parse_user_workHistory();
		testUserMeida=parser.parse_user_media();
		testUserEdu=parser.parse_user_education();
		testUserRef=parser.parse_user_references();
		testUserAbout=parser.parse_user_about();

	}

	@Test
	public void VerifyFirstStageFunctionality() throws Exception {
		System.out.println("Vefifying JS Quick Registration First Stage..");
		action.FirstStage(testCan);
		/*Assert.assertTrue("User Passed First Stage of Quick Reg..",
				JSQuickRegPage.FirstLoginHint());*/
	}

	/*@Test
	public void VerifySecondStageFunctionality() throws Exception {
		
		System.out.println("Vefifying JS Quick Registration Second Stage..");
		action.SecondStage(testUserHis, testUserMeida, testUserEdu, testUserRef, skills, testUserAbout);

	}*/

}
