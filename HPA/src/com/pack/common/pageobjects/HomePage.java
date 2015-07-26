package com.pack.common.pageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	protected WebDriver driver;
	private WebDriverWait wait;
	private By Employers = By
			.xpath("//*[@id='top']/div/nav/div/span/ul/li[1]/a");
	private By Jobs = By.xpath("//*[@id='top']/div/nav/div/span/ul/li[2]/a");
	private By Login = By.xpath("//*[@id='top']/div/nav/div/span/ul/li[3]/a");
	private By Spanish = By.xpath("//*[@id='top']/div/nav/div/span/ul/li[5]/a");
	private By Join = By.xpath("//*[@id='top']/div/nav/div/span/ul/li[4]/a");
	private By Menu = By.xpath("//*[@id='top']/div/nav/div/span/ul/li[6]/a");
	private By BuildYourProfile = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/div[2]/div[1]/div[2]/button");
	private By LookingFor = By.id("s2id_autogen2");
	private By Location = By.id("select2-chosen-4");
	private By Location_textinput = By.id("s2id_autogen4_search");
	private By FindJobs = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/div[2]/div[2]/div/div/div/div/form/button");
	private By EmployersVideo = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/section[1]/div/div[2]/div[1]/div[1]/div/div/div/div[1]");
	private By CandidateVideo = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/section[1]/div/div[2]/div[2]/div/div/div/div/div[1]");
	private By CreateYourFreeProfile = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/section[2]/div/div/div[1]/div/div[1]/div[3]/a");
	private By HarriForEmployers = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/section[2]/div/div/div[2]/div/div[2]/a");
	private By HarriBlog = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/section[2]/div/div/div[3]/div/div/a");
	private By FindTheRightOpportunity = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/section[2]/div/div/div[4]/div/div[2]/div[2]");

	public HomePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void clickEmployersLink() {
		try {
			WebElement employers = driver.findElement(Employers);
			employers.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void clickJobsLink() {
		try {
			WebElement jobs = driver.findElement(Jobs);
			jobs.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void clickLoginLink() {
		try {
			WebElement log_in = driver.findElement(Login);
			log_in.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void clickJoinLink() {
		try {
			WebElement join = driver.findElement(Join);
			join.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void clickSpanishLink() {
		try {
			WebElement spanish = driver.findElement(Spanish);
			spanish.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void clickMenu() {
		try {
			WebElement menu = driver.findElement(Menu);
			menu.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void clickBuildYourProfileButton() {
		try {
			WebElement build_yourProfile = driver.findElement(BuildYourProfile);
			build_yourProfile.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void FindJobs_LookingFor(String Position) {
		try {
			WebElement looking_for = driver.findElement(LookingFor);
			looking_for.click();
			looking_for.sendKeys(Position);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("//*[contains(text(),'" + Position + "')]")));
			driver.findElement(
					By.xpath("//*[contains(text(),'" + Position + "')]"))
					.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}

	}

	public void FindJobs_location(String location) {
		try {
			WebElement location_btn = driver.findElement(Location);
			location_btn.click();
			WebElement location_input = driver.findElement(Location_textinput);
			location_input.sendKeys(location);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("//*[@id='select2-results-4']/li/div")));
			driver.findElement(By.xpath("//*[@id='select2-results-4']/li/div"))
					.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void clickFindJobs() {
		try {
			WebElement find_jobs = driver.findElement(FindJobs);
			find_jobs.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void clickEmployersVideo() {
		try {
			WebElement employer_video = driver.findElement(EmployersVideo);
			employer_video.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void clickCandidateVideo() {
		try {
			WebElement candidate_video = driver.findElement(CandidateVideo);
			candidate_video.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void clickCreateYourFreeProfile() {
		try {
			WebElement create_yourFree_profile = driver
					.findElement(CreateYourFreeProfile);
			create_yourFree_profile.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void clickHarriForEmployers() {
		try {
			WebElement harri_foremployers = driver
					.findElement(HarriForEmployers);
			harri_foremployers.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void clickHarriBlog() {
		try {
			WebElement harri_blog = driver.findElement(HarriBlog);
			harri_blog.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void clickFindTheRightOpportunity() {
		try {
			WebElement find_opportunity = driver
					.findElement(FindTheRightOpportunity);
			find_opportunity.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}
}
