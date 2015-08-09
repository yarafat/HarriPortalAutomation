package com.pack.common.pageobjects;

import org.openqa.selenium.By;

public class JSFullRegistration {
	private By StartFromScratch = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[1]/div/div[3]/button");
	private By FBSignup = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[1]/div/div[3]/div[2]/button");
	private By LinkedInSignup = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[1]/div/div[3]/div[4]/button");

	private By UserTypeContinueButton = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[3]/div/form/div[3]/button");
	private By ThirdcontinueButton = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[19]/div/form/div[3]/button");
	private By LookingForJobs = By.id("user_type-0");
	private By LookingForTalents = By.id("user_type-1");
	private By WorkExperience = By.id("select2-chosen-40");
	private By WorkExperience2 = By.id("s2id_autogen37");
	private By WorkExperienceTextbox = By.id("s2id_autogen40_search");
	private By WorkExperienceTextbox2 = By.id("s2id_autogen38_search");
	private By EorkExperienceContinue = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[9]/div/form/div[4]/div[2]/button");
	private By MyFirstJob = By.xpath("//*[@id='first_job']/label/div/i");
	private By Position = By.id("s2id_autogen15");
	private By PositionTextbox = By.id("s2id_autogen16_search");
	private By StartMonth = By.id("s2id_autogen17");
	private By StartYear = By.id("s2id_autogen19");
	private By EndMonth = By.id("s2id_autogen21");
	private By EndYear = By.id("s2id_autogen23");
	private By StartMonthTextBox = By.id("s2id_autogen18_search");
	private By StartYearTextBox = By.id("s2id_autogen20_search");
	private By EndMonthTextBox = By.id("s2id_autogen22_search");
	private By EndYearTextBox = By.id("s2id_autogen24_search");
	private By Description = By.xpath("//*[@id='description']");
	private By WorkHistoryDetailsContinue = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[10]/div[2]/form/div[7]/button");
	private By Eduction = By.xpath("//*[@id='s2id_autogen25']");
	private By EductionTextBox = By.xpath("//*[@id='s2id_autogen26_search']");
	private By EductionContinue = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[11]/div/form/div[6]/button[2]");
	private By Degree = By.id("s2id_autogen27");
	private By DegreeTextBox = By.id("s2id_autogen28_search");
	private By AreaOfStudy = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[12]/div/form/div[2]/div[2]/input");
	private By EduStartMonth = By.id("s2id_autogen29");
	private By EducationStartYear = By.id("s2id_autogen31");
	private By EducationEndMonth = By.id("s2id_autogen33");
	private By EducationEndYear = By.id("s2id_autogen35");
	private By EducationStartMonth_textBox = By.id("s2id_autogen30_search");
	private By EducationStartYear_textBox = By.id("s2id_autogen32_search");
	private By EducationEndMonth_textBox = By.id("s2id_autogen34_search");
	private By EducationEndYear_textBox = By.id("s2id_autogen36_search");
	private By EducationDetails_Continue = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[12]/div/form/div[6]/button");
	private By Skills = By.id("s2id_autogen38");
	private By SkillsContinue = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[13]/div/form/div[3]/button");
	private By AnyTime = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[14]/div/form/div[2]/div[1]/div/label/div/i");
	private By FullTime = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[14]/div/form/div[2]/div[2]/div/label/div/i");
	private By PartTime = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[14]/div/form/div[2]/div[3]/div/label/div/i");
	private By AvailabilityContinue = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[14]/div/form/div[5]/button");
	private By Word1 = By.id("word1");
	private By Word2 = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[15]/div/form/div[2]/div/div/div[2]/input");
	private By Word3 = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[15]/div/form/div[2]/div/div/div[3]/input");
	private By Bio = By.id("bio");
	private By AboutContinue = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[15]/div/form/div[4]/button");
	private By ImageUpload = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[16]/div[2]/form/div[2]/div[2]/div[1]");
	private By SavePhoto = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/div[2]/image-cropping/div/div[2]/div/div/div[5]/div/div[4]");
	private By MediaContinue = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[16]/div[2]/form/div[11]/button");
	private By ReferenceName = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[18]/div/form/div[2]/div/div[1]/div[1]/input");
	private By ReferencePhone = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[18]/div/form/div[2]/div/div[1]/div[2]/input");
	private By ReferenceCompany = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[18]/div/form/div[2]/div/div[2]/div[1]/input");
	private By ReferenceEmail = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[18]/div/form/div[2]/div/div[2]/div[2]/input");
	private By ReferencesContinue = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[18]/div/form/div[5]/button");

}
