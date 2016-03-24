package com.pack.common.tests;

import java.io.FileNotFoundException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.actions.JSFullRegistrationActions;
import com.pack.entities.User;
import com.pack.entities.Media;
import com.pack.entities.UserAbout;
import com.pack.entities.UserEducation;
import com.pack.entities.UserReferences;
import com.pack.entities.UserWorkHistory;
import com.pack.utils.CandidateParser;
import com.pack.utils.EmailsGenerator;

public class JSFullRegTest extends TestBaseSetup {
	private WebDriver driver;
	private JSFullRegistrationActions action;
	private String[] skills = { "Inventory Management", "Social Media",
			"Microsoft Office" };
	private UserEducation testUserEdu;
	private UserWorkHistory testUserHis;
	private UserAbout testUserAbout;
	private Media testUserMeida;
	private UserReferences testUserRef;
	private EmailsGenerator CanEmail = new EmailsGenerator();
	private CandidateParser parser;
	private User testCan;
	String Email;

	@BeforeClass
	public void setUp() {
		driver = getDriver();
		action = new JSFullRegistrationActions(driver);

		try {
			parser = new CandidateParser(3);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		CanEmail.SetEmail("Sireen");
		testCan = parser.parse();
		Email = CanEmail.getEmail();
		testCan.setEmail(Email);
		testUserHis = parser.parse_user_workHistory();
		testUserMeida = parser.parse_user_media();
		testUserEdu = parser.parse_user_education();
		testUserRef = parser.parse_user_references();
		testUserAbout = parser.parse_user_about();

	}

	@Test
	public void VerifyFirstStageFunctionality() throws Exception {
		System.out.println("Vefifying JS Quick Registration First Stage..");
		action.FullRegistration(testCan, testUserHis, testUserMeida,
				testUserEdu, testUserRef, skills, testUserAbout, true, false,
				false);
		Assert.assertTrue(
				"User Passed First Stage of Quick Reg..",
				driver.findElement(
						By.xpath("//strong[contains(text(),'Congratulations')]"))
						.isDisplayed());
	}
}
