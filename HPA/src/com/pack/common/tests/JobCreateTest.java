package com.pack.common.tests;

import java.io.FileNotFoundException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.actions.JSFullRegistrationActions;
import com.pack.common.actions.JobCreateAction;
import com.pack.common.actions.LoginActions;
import com.pack.entities.Candidate;
import com.pack.entities.Media;
import com.pack.entities.UserAbout;
import com.pack.entities.UserEducation;
import com.pack.entities.UserReferences;
import com.pack.entities.UserWorkHistory;
import com.pack.entities.job;
import com.pack.utils.CandidateParser;
import com.pack.utils.EmailsGenerator;
import com.pack.utils.JobParser;

public class JobCreateTest extends TestBaseSetup{
	private WebDriver driver;
	private JobCreateAction jobCreateAction;
	private LoginActions loginAction;
	private CandidateParser parser;
	private Candidate testCan;
	private job testJob;
	private JobParser jobParser;
	String Email;
	String Password;

	@BeforeClass
	public void setUp() {

		driver = getDriver();
		jobCreateAction = new JobCreateAction(driver);
		loginAction = new LoginActions(driver);
		try {
			parser = new CandidateParser(4);
			jobParser = new JobParser(2);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	testCan = parser.parse();
	//	Email = testCan.getEmail();
	//	Password= testCan.getPassword();
		testJob= jobParser.parse();

	}

	@Test
	public void JobCreateFirstStage() throws Exception {
		loginAction.LoginWithEmail("sireen+7@harri.com", "123123123");
		jobCreateAction.JobCreateFirstStage(testJob);
	}

}
