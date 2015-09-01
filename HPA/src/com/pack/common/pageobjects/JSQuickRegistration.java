package com.pack.common.pageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pack.utils.GeneralSelectors;

public class JSQuickRegistration {
	protected WebDriver driver;
	private WebDriverWait wait;
	private By FirstName = By
			.xpath("//*[@id='app-quick-reg-form']/div[1]/div[1]/div[1]/div/input");
	private By LastName = By
			.xpath("//*[@id='app-quick-reg-form']/div[1]/div[2]/div[1]/div/input");
	private By EmailAddress = By
			.xpath("//*[@id='app-quick-reg-form']/div[2]/div[1]/div[1]/div/input");
	private By PhoneNumber = By
			.xpath("//*[@id='app-quick-reg-form']/div[2]/div[2]/div[1]/div/input");
	private By Password = By
			.xpath("//*[@id='app-quick-reg-form']/div[3]/div[1]/div[1]/div/input");
	private By ConfimrPassword = By
			.xpath("//*[@id='app-quick-reg-form']/div[3]/div[2]/div[1]/div/input");
	private By ContinueButton = By
			.xpath("//*[@id='app-quick-reg-form']/div[7]/div/button");
	private By Login = By
			.xpath("//*[@id='application-cont']/div[2]/div/div/div/div[3]/div[2]/div/div[5]/div/div/div/div[2]/div/div/div/div[2]/a");
	private By FBSignUp = By
			.xpath("//*[@id='application-cont']/div[2]/div/div/div/div[3]/div[2]/div/div[5]/div/div/div/div[2]/div/div/div/div[4]/button[1]");
	private By LinkedInSignUp = By
			.xpath("//*[@id='application-cont']/div[2]/div/div/div/div[3]/div[2]/div/div[5]/div/div/div/div[2]/div/div/div/div[4]/button[2]");
	private By TermsOfService = By
			.xpath("//*[@id='app-quick-reg-form']/div[5]/div/a[1]");
	private By PrivacyPolicy = By
			.xpath("//*[@id='app-quick-reg-form']/div[5]/div/a[2]");
	private By MyFirstJob = By.xpath("//*[@id='first_job']/label/div/i");
	private By WorkHistoryDropDown = By
			.xpath("//*[@id='work_history_2-form-cont']/h-form/div/form/div[1]/ng-form/div[2]/div/div[1]/span/span[1]/div/a");
	private By WorkHistoryTextBox = By
			.xpath("//*[@id='work_history_2-form-cont']/h-form/div/form/div[1]/ng-form/div[2]/div/div[1]/span/span[1]/div/div[2]/div/input");
	private By WorkHistoryPosition = By
			.xpath("//*[@id='work_history_2-form-cont']/h-form/div/form/div[1]/ng-form/div[3]/div[1]/div[1]/span/span[1]/div/a");
	private By WorkHistoryPositionTextBox = By
			.xpath("//*[@id='select2-drop']/div/input");
	private By WorkHistoryStartMonth = By
			.xpath("//*[@id='-month']/span/span[1]/div/a");
	private By WorkHistoryStartMonthTextBox = By
			.xpath("//*[@id='select2-drop']/div/input");
	private By WorkHistoryStartYear = By
			.xpath("//*[@id='-year']/span/span[1]/div/a");
	private By WorkHistoryStartYearTextBox = By
			.xpath("//*[@id='select2-drop']/div/input");
	private By WorkHistoryDescription = By.id("description");
	private By WorkHistoryEndMonth = By
			.xpath("//*[@id=-month]/span/span[1]/div/a");
	private By WorkHistoryEndMonthTextBox = By
			.xpath("//*[@id='select2-drop']/div/input");
	private By WorkHistoryEndYear = By
			.xpath("//*[@id='-year']/span/span[1]/div");
	private By WorkHistoryEndYearTextBox = By
			.xpath("//*[@id='select2-drop']/div/input");
	private By IstillWorkHere = By
			.xpath("//*[@id='work_history_2-form-cont']/h-form/div/form/div[1]/ng-form/div[3]/div[3]/div/label/div/i");
	private By ProfileImageInputFile = By
					//*[@id="application-cont"]/div[2]/div/div/div/div[3]/div[2]/div/div[5]/div/div/div/div[3]/div[3]/h-form/form/div[2]/div/div[2]/div/input
			.xpath("//*[@id='application-cont']/div[2]/div/div/div/div[3]/div[2]/div/div[5]/div/div/div/div[3]/div[3]/h-form/form/div[2]/div/div[2]/div/input");
	private By UploadButton = By
			.xpath("//*[@id='harriApp']/div[1]/span[1]/image-cropping/div/div[1]/div[2]/div/div/div[5]/div/div[4]");
	private By AnyTime = By
			.xpath("//*[@id='application-cont']/div[2]/div/div/div/div[3]/div[2]/div/div[5]/div/div/div/div[3]/div[5]/h-form/form/div[3]/div/div[1]/div/label/div/i");
	private By FullTime = By
			.xpath(" //*[@id='application-cont']/div[2]/div/div/div/div[3]/div[2]/div/div[5]/div/div/div/div[3]/div[5]/h-form/form/div[3]/div/div[2]/div/label/div/i");
	private By PartTime = By
			.xpath("//*[@id='application-cont']/div[2]/div/div/div/div[3]/div[2]/div/div[5]/div/div/div/div[3]/div[5]/h-form/form/div[3]/div/div[3]/div/label/div/i");
	private By ReferenceName = By
			.xpath(" //*[@id='application-cont']/div[2]/div/div/div/div[3]/div[2]/div/div[5]/div/div/div/div[3]/div[7]/h-form/form/div[3]/ng-form/div/div[1]/div[1]/input");
	private By ReferencePhoneNumber = By
			.xpath("//*[@id='application-cont']/div[2]/div/div/div/div[3]/div[2]/div/div[5]/div/div/div/div[3]/div[7]/h-form/form/div[3]/ng-form/div/div[1]/div[2]/input");
	private By ReferenceCompany = By
			.xpath("//*[@id='application-cont']/div[2]/div/div/div/div[3]/div[2]/div/div[5]/div/div/div/div[3]/div[7]/h-form/form/div[3]/ng-form/div/div[2]/div[1]/input");
	private By ReferenceEmail = By
			.xpath(" //*[@id='application-cont']/div[2]/div/div/div/div[3]/div[2]/div/div[5]/div/div/div/div[3]/div[7]/h-form/form/div[3]/ng-form/div/div[2]/div[2]/input");
	private By ExpandEducation = By
			.xpath("//*[@id='application-cont']/div[2]/div/div/div/div[3]/div[2]/div/div[5]/div/div/div/div[3]/div[6]/div[1]");
	private By EducationDropDown = By
			.xpath("//*[@id='application-cont']/div[2]/div/div/div/div[3]/div[2]/div/div[5]/div/div/div/div[3]/div[6]/div[2]/h-form/div/form/div/ng-form/div/div[1]/span/span[1]/div/a/span[1]");
	private By EducationTextBox = By
			.xpath("//*[@id='application-cont']/div[2]/div/div/div/div[3]/div[2]/div/div[5]/div/div/div/div[3]/div[6]/div[2]/h-form/div/form/div/ng-form/div/div[1]/span/span[1]/div/div[2]/div/input");
	private By DegreeDropDown = By
			.xpath("//*[@id='application-cont']/div[2]/div/div/div/div[3]/div[2]/div/div[5]/div/div/div/div[3]/div[6]/div[2]/h-form/div/form/div[1]/ng-form/div[2]/div[1]/div[1]/div[1]/span/span[1]/div/a");
	private By DegreeTextBox = By
			.xpath("//*[@id='application-cont']/div[2]/div/div/div/div[3]/div[2]/div/div[5]/div/div/div/div[3]/div[6]/div[2]/h-form/div/form/div[1]/ng-form/div[2]/div[1]/div[1]/div[1]/span/span[1]/div/div[2]/div/input");
	private By AreaOfStudy = By
			.xpath("//*[@id='application-cont']/div[2]/div/div/div/div[3]/div[2]/div/div[5]/div/div/div/div[3]/div[6]/div[2]/h-form/div/form/div[1]/ng-form/div[2]/div[1]/div[2]/input");
	private By EducationStartMonth = By
			.xpath("//*[@id='application-cont']/div[2]/div/div/div/div[3]/div[2]/div/div[5]/div/div/div/div[3]/div[6]/div[2]/h-form/div/form/div[1]/ng-form/div[2]/div[2]/div[1]/div[1]/month-date-picker/div/div/div[1]/span/span[1]/div");
	private By EduStartMonthTextBox = By
			.xpath("//*[@id='application-cont']/div[2]/div/div/div/div[3]/div[2]/div/div[5]/div/div/div/div[3]/div[6]/div[2]/h-form/div/form/div[1]/ng-form/div[2]/div[2]/div[1]/div[1]/month-date-picker/div/div/div[1]/span/span[1]/div/div[2]/div/input");
	private By EducationStartYear = By
			.xpath("//*[@id='application-cont']/div[2]/div/div/div/div[3]/div[2]/div/div[5]/div/div/div/div[3]/div[6]/div[2]/h-form/div/form/div[1]/ng-form/div[2]/div[2]/div[1]/div[1]/month-date-picker/div/div/div[2]/span/span[1]/div");
	private By EduStartYearTextBox = By
			.xpath("//*[@id='application-cont']/div[2]/div/div/div/div[3]/div[2]/div/div[5]/div/div/div/div[3]/div[6]/div[2]/h-form/div/form/div[1]/ng-form/div[2]/div[2]/div[1]/div[1]/month-date-picker/div/div/div[2]/span/span[1]/div/div[2]/div/input");
	private By EducationEndMonth = By
			.xpath("//*[@id='-month']/span/span[1]/div/a");
	private By EduEndMonthTextBox = By
			.xpath("//*[@id='-month']/span/span[1]/div/div[2]/div/input");
	private By EducationEndYear = By
			.xpath("//*[@id='-year']/span/span[1]/div/a");
	private By EduEndYearTextBox = By
			.xpath("//*[@id='-year']/span/span[1]/div/div[2]/div/input");
	private By CurrentlyAtSchool = By
			.xpath("//*[@id='application-cont']/div[2]/div/div/div/div[3]/div[2]/div/div[5]/div/div/div/div[3]/div[6]/div[2]/h-form/div/form/div[1]/ng-form/div[2]/div[3]/div/label/div/i");
	private By ExpandSkills = By
			.xpath("//*[@id='application-cont']/div[2]/div/div/div/div[3]/div[2]/div/div[5]/div/div/div/div[3]/div[8]/div[1]");
	private By SkillsInputTxt = By
			.xpath("//*[@id='application-cont']/div[2]/div/div/div/div[3]/div[2]/div/div[5]/div/div/div/div[3]/div[8]/div[2]/div[2]/h-form/form/div/span/span[1]/div/ul/li/input");
	private By ExpandAbout = By
			.xpath("//*[@id='application-cont']/div[2]/div/div/div/div[3]/div[2]/div/div[5]/div/div/div/div[3]/div[9]/div[1]/i[1]");
	private By FirstWord = By.id("word1");
	private By SecondWord = By
			.xpath("//*[@id='application-cont']/div[2]/div/div/div/div[3]/div[2]/div/div[5]/div/div/div/div[3]/div[9]/div[2]/h-form/form/div[1]/div/div/div[2]/input");
	private By ThirdWord = By
			.xpath("//*[@id='application-cont']/div[2]/div/div/div/div[3]/div[2]/div/div[5]/div/div/div/div[3]/div[9]/div[2]/h-form/form/div[1]/div/div/div[3]/input");
	private By Bio = By.id("bio");
	private By ExpandLocation = By
			.xpath("//*[@id='location-form-cont']/h-form/form/div[1]");
	private By LocationDropDown = By
			.xpath("//*[@id='location-form-cont']/h-form/form/div[2]/div[2]/div[1]/span/span[1]/div/a");
	private By LocationTextBox = By
			.xpath("//*[@id='location-form-cont']/h-form/form/div[2]/div[2]/div[1]/span/span[1]/div/div[2]/div/input");
	private By DeleteLocation = By
			.xpath("//*[@id='location-form-cont']/h-form/form/div[2]/div[2]/div[3]/div/div/div/div/div/div[2]/button");
	private By HintMsg = By.id("app-reg-welcome-text");

	public JSQuickRegistration(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 20);
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void SetFirstName(String FName) {
		try {
			WebElement firstname = driver.findElement(FirstName);
			firstname.sendKeys(FName);
			System.out.println("keys were sent successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetLastName(String LName) {
		try {
			WebElement lastname = driver.findElement(LastName);
			lastname.sendKeys(LName);
			System.out.println("keys were sent successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}

	}

	public void SetEmailAddress(String email) {
		try {
			WebElement email_address = driver.findElement(EmailAddress);
			email_address.sendKeys(email);
			System.out.println("keys were sent successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}

	}

	public void SetPhoneNumber(String phone) {
		try {
			WebElement phone_number = driver.findElement(PhoneNumber);
			phone_number.sendKeys(phone);
			System.out.println("keys were sent successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}

	}

	public void SetPassword(String pass) {
		try {
			WebElement password = driver.findElement(Password);
			password.sendKeys(pass);
			System.out.println("keys were sent successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}

	}

	public void ConfirmPassword(String confirmed) {
		try {
			WebElement confirm_pass = driver.findElement(ConfimrPassword);
			confirm_pass.sendKeys(confirmed);
			System.out.println("keys were sent successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}

	}

	public void ClickContinueButton() throws Exception {
		try {
			WebElement continue_button = driver.findElement(ContinueButton);
			continue_button.click();
			Thread.sleep(6000);
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickLoginLink() {
		try {
			WebElement login = driver.findElement(Login);
			login.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickSignupwithFB() {
		try {
			WebElement FB_signup = driver.findElement(FBSignUp);
			FB_signup.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickSignupwithLinkedIn() {
		try {
			WebElement LinkedIn_signup = driver.findElement(LinkedInSignUp);
			LinkedIn_signup.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickTermsOfServiceLink() {
		try {
			WebElement terms_of_service = driver.findElement(TermsOfService);
			terms_of_service.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickPrivacyPolicyLink() {
		try {
			WebElement privacy_policy = driver.findElement(PrivacyPolicy);
			privacy_policy.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SelectWorkHistory(String SelectedName, String SelectedLocation) {
		GeneralSelectors selector = new GeneralSelectors(driver);
		selector.SelectWorkHistory(SelectedName, SelectedLocation,
				WorkHistoryDropDown, WorkHistoryTextBox, 15);
	}

	public void SelectPosition(String SelectedPosition, boolean NewPosition)
			throws Exception {
		GeneralSelectors selector = new GeneralSelectors(driver);
		selector.SelectPosition(SelectedPosition, NewPosition,
				WorkHistoryPosition, WorkHistoryPositionTextBox, 5);

	}

	public void SetWorkHistoryStartMonth(String workStarMonth) {
		try {
			WebElement start_month = driver.findElement(WorkHistoryStartMonth);
			start_month.click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(WorkHistoryStartMonthTextBox));
			WebElement start_month_txtbox = driver
					.findElement(WorkHistoryStartMonthTextBox);
			start_month_txtbox.sendKeys(workStarMonth);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("//*[contains(text(),'" + workStarMonth + "')]")));
			driver.findElement(
					By.xpath("//*[contains(text(),'" + workStarMonth + "')]"))
					.click();
			System.out.println("Element was found and clicked successfully");

		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetWorkHistoryEndMonth(String workEndMonth) {
		try {
			WebElement end_month = driver.findElement(WorkHistoryEndMonth);
			end_month.click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(WorkHistoryEndMonthTextBox));
			WebElement end_month_txtbox = driver
					.findElement(WorkHistoryEndMonthTextBox);
			end_month_txtbox.sendKeys(workEndMonth);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("//*[@id='select2-drop']/ul/li/div")));
			driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li/div"))
					.click();
			System.out.println("Element was found and clicked successfully");

		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetWorkHistoryEndYear(String workEndYear) {
		try {
			WebElement End_year = driver.findElement(WorkHistoryEndYear);
			End_year.click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(WorkHistoryEndYearTextBox));
			WebElement End_year_txtbox = driver
					.findElement(WorkHistoryEndYearTextBox);
			End_year_txtbox.sendKeys(workEndYear);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("//*[@id='select2-drop']/ul/li/div")));
			driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li/div"))
					.click();
			System.out.println("Element was found and clicked successfully");

		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetWorkHistoryStartYear(String workStartYear) {
		try {
			WebElement start_year = driver.findElement(WorkHistoryStartYear);
			start_year.click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(WorkHistoryStartYearTextBox));
			WebElement start_year_txtbox = driver
					.findElement(WorkHistoryStartYearTextBox);
			start_year_txtbox.sendKeys(workStartYear);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("//*[@id='select2-drop']/ul/li/div")));
			driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li/div"))
					.click();
			System.out.println("Element was found and clicked successfully");

		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetWorkHistoryDescription(String des) {
		try {
			WebElement description = driver.findElement(WorkHistoryDescription);
			description.sendKeys(des);
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void IstillWorkHere() {
		try {
			WebElement i_still_work_here = driver.findElement(IstillWorkHere);
			i_still_work_here.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ThisIsMyFirstJob() {
		try {
			WebElement first_job = driver.findElement(MyFirstJob);
			first_job.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}

	}

	public void UploadImage(String ImageURL) throws Exception {
		GeneralSelectors selector = new GeneralSelectors(driver);
		selector.UploadImage(ImageURL, UploadButton, ProfileImageInputFile, 10);

	}

	public void SelectAvailability(boolean Anytime, boolean Fulltime,
			boolean Parttime) {
		GeneralSelectors selector = new GeneralSelectors(driver);
		selector.SelectAvailability(Anytime, Fulltime, Parttime, AnyTime, FullTime, PartTime);

	}

	public void SetReferennceName(String Referencename) {
		try {
			WebElement reference_name = driver.findElement(ReferenceName);
			reference_name.sendKeys(Referencename);
			System.out.println("Keys were sent successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetReferenncePhone(String Referencephone) {
		try {
			WebElement reference_phone = driver
					.findElement(ReferencePhoneNumber);
			reference_phone.sendKeys(Referencephone);
			System.out.println("Keys were sent successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetReferennceCompany(String Referencecompany) {
		try {
			WebElement reference_company = driver.findElement(ReferenceCompany);
			reference_company.sendKeys(Referencecompany);
			System.out.println("Keys were sent successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetReferennceEmail(String Referenceemail) {
		try {
			WebElement reference_emai = driver.findElement(ReferenceEmail);
			reference_emai.sendKeys(Referenceemail);
			System.out.println("Keys were sent successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ExpandSkills() {
		try {
			WebElement expand_skills = driver.findElement(ExpandSkills);
			expand_skills.click();

		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}

	}

	public void SelectSkills(String[] skills) {
		GeneralSelectors selector = new GeneralSelectors(driver);
		selector.SelectSkills(skills, SkillsInputTxt, 5);
	}

	public void ExpandAbout() {
		try {
			WebElement expand_about = driver.findElement(ExpandAbout);
			expand_about.click();

		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetFirstWord(String word1) {
		try {
			WebElement first_word = driver.findElement(FirstWord);
			first_word.sendKeys(word1);
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetSecondWord(String word2) {
		try {
			WebElement second_word = driver.findElement(SecondWord);
			second_word.sendKeys(word2);
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetThirdWord(String word3) {
		try {
			WebElement third_word = driver.findElement(ThirdWord);
			third_word.sendKeys(word3);
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetBio(String bio) {
		try {
			WebElement QR_bio = driver.findElement(Bio);
			QR_bio.sendKeys(bio);
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ExpandEducation() {
		try {
			WebElement expand_edu = driver.findElement(ExpandEducation);
			expand_edu.click();
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SelectEducation(String SelectedInstitution,
			String InstitutionLocation) {
		GeneralSelectors selector = new GeneralSelectors(driver);
		selector.SelectEducation(SelectedInstitution, InstitutionLocation,
				EducationDropDown, EducationTextBox, 10);
	}

	public void SelectDegree(String degree) {
		GeneralSelectors selector = new GeneralSelectors(driver);
		selector.SelectDegree(degree, DegreeDropDown, DegreeTextBox, 5);

	}

	public void SetAreaOfStudy(String areaofstudy) throws Exception {
		try {
			WebElement area_of_study = driver.findElement(AreaOfStudy);
			// area_of_study.clear();
			area_of_study.sendKeys(areaofstudy);
			System.out.println("Keys were sent successfully");
			// Thread.sleep(3000);
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetCurrentlyAtSchool() {
		try {
			WebElement still_at_school = driver.findElement(CurrentlyAtSchool);
			still_at_school.click();

		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}

	}

	public void SetEducationStartMonth(String eduStartMont) {
		try {
			WebElement education_start_month = driver
					.findElement(EducationStartMonth);
			education_start_month.click();

			wait.until(ExpectedConditions
					.visibilityOfElementLocated(EduStartMonthTextBox));
			WebElement start_month_txtbox = driver
					.findElement(EduStartMonthTextBox);
			start_month_txtbox.sendKeys(eduStartMont);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("//*[contains(text(),'" + eduStartMont + "')]")));
			driver.findElement(
					By.xpath("//*[contains(text(),'" + eduStartMont + "')]"))
					.click();
			System.out.println("Element was found and clicked successfully");

		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}

	}

	public void SetEducationStartYear(String eduStartYear) {
		try {
			WebElement education_start_year = driver
					.findElement(EducationStartYear);
			education_start_year.click();

			wait.until(ExpectedConditions
					.visibilityOfElementLocated(EduStartYearTextBox));
			WebElement start_year_txtbox = driver
					.findElement(EduStartYearTextBox);
			start_year_txtbox.sendKeys(eduStartYear);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("//*[contains(text(),'" + eduStartYear + "')]")));
			driver.findElement(
					By.xpath("//*[contains(text(),'" + eduStartYear + "')]"))
					.click();
			System.out.println("Element was found and clicked successfully");

		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetEducationEndMonth(String eduEndMonth) {
		try {
			WebElement education_end_month = driver
					.findElement(EducationEndMonth);
			education_end_month.click();

			wait.until(ExpectedConditions
					.visibilityOfElementLocated(EduEndMonthTextBox));
			WebElement end_month_txtbox = driver
					.findElement(EduEndMonthTextBox);
			end_month_txtbox.sendKeys(eduEndMonth);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("//*[contains(text(),'" + eduEndMonth + "')]")));
			driver.findElement(
					By.xpath("//*[contains(text(),'" + eduEndMonth + "')]"))
					.click();
			System.out.println("Element was found and clicked successfully");

		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetEducationEndYear(String eduEndYear) {
		try {
			WebElement education_end_year = driver
					.findElement(EducationEndYear);
			education_end_year.click();

			wait.until(ExpectedConditions
					.visibilityOfElementLocated(EduEndYearTextBox));
			WebElement end_year_txtbox = driver.findElement(EduEndYearTextBox);
			end_year_txtbox.sendKeys(eduEndYear);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("//*[contains(text(),'" + eduEndYear + "')]")));
			driver.findElement(
					By.xpath("//*[contains(text(),'" + eduEndYear + "')]"))
					.click();
			System.out.println("Element was found and clicked successfully");

		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}

	}

	public void ExpandLocation() {
		try {
			WebElement location_expand = driver.findElement(ExpandLocation);
			location_expand.click();
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetLocation(String location) {
		try {
			WebElement location_dropdown = driver.findElement(LocationDropDown);
			location_dropdown.click();
			WebElement location_text_box = driver.findElement(LocationTextBox);
			location_text_box.sendKeys(location);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("//*[@id='location-form-cont']/h-form/form/div[2]/div[2]/div[1]/span/span[1]/div/div[2]/ul/li/div")));
			driver.findElement(
					By.xpath("//*[@id='location-form-cont']/h-form/form/div[2]/div[2]/div[1]/span/span[1]/div/div[2]/ul/li/div"))
					.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void DeleteLocation() {
		try {
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(DeleteLocation));
			WebElement delete = driver.findElement(DeleteLocation);
			delete.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public boolean FirstLoginHint() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(HintMsg));
			if (driver.findElement(HintMsg).isDisplayed()) {
				System.out.println("Hint Message was found successfully");
				return true;
			} else {
				System.out.println("Hint Message was not found successfully");
				return false;
			}

		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}
}
