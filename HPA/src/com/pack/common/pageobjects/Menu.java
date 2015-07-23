package com.pack.common.pageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Menu {
	protected WebDriver driver;
	private WebDriverWait wait = new WebDriverWait(driver, 5);
	private By BuildYourProfile = By
			.xpath("//*[@id='harriApp']/div[1]/div[1]/div[1]/div/div/div/div[2]/button");
	private By Home = By
			.xpath("//*[@id='harriApp']/div[1]/div[1]/div[1]/div/div/div/div[3]/a[1]");
	private By Jobs = By
			.xpath("//*[@id='harriApp']/div[1]/div[1]/div[1]/div/div/div/div[3]/a[2]");
	private By People = By
			.xpath("//*[@id='harriApp']/div[1]/div[1]/div[1]/div/div/div/div[3]/a[3]");
	private By Companies = By
			.xpath("//*[@id='harriApp']/div[1]/div[1]/div[1]/div/div/div/div[3]/a[4]");
	private By Login = By
			.xpath("//*[@id='harriApp']/div[1]/div[1]/div[1]/div/div/div/a[3]");
	private By HelpAndSupport = By
			.xpath("//*[@id='harriApp']/div[1]/div[1]/div[1]/div/div/div/a[4]");
	private By Pricing = By
			.xpath("//*[@id='harriApp']/div[1]/div[1]/div[1]/div/div/div/a[5]");
	private By AboutHarri = By
			.xpath("//*[@id='harriApp']/div[1]/div[1]/div[1]/div/div/div/a[6]");
	private By HarriBlog = By
			.xpath("//*[@id='harriApp']/div[1]/div[1]/div[1]/div/div/div/a[7]");
	private By TermsOfService = By
			.xpath("//*[@id='harriApp']/div[1]/div[1]/div[1]/div/div/div/a[8]");
	private By Privacy = By
			.xpath("//*[@id='harriApp']/div[1]/div[1]/div[1]/div/div/div/a[9]");
	private By FAQ = By
			.xpath("//*[@id='harriApp']/div[1]/div[1]/div[1]/div/div/div/a[10]");
	private By ContactUs = By
			.xpath("//*[@id='harriApp']/div[1]/div[1]/div[1]/div/div/div/a[11]");
	private By HarriFB = By
			.xpath("//*[@id='harriApp']/div[1]/div[1]/div[1]/div/div/div/footer/div/div/ul/li[1]/a");
	private By HarriTwitter = By
			.xpath("//*[@id='harriApp']/div[1]/div[1]/div[1]/div/div/div/footer/div/div/ul/li[2]/a");
	private By HarriInstagram = By
			.xpath("//*[@id='harriApp']/div[1]/div[1]/div[1]/div/div/div/footer/div/div/ul/li[3]/a");
	private By HarriLinkedIn = By
			.xpath("//*[@id='harriApp']/div[1]/div[1]/div[1]/div/div/div/footer/div/div/ul/li[4]/a");
	private By HarriPinterest = By
			.xpath("//*[@id='harriApp']/div[1]/div[1]/div[1]/div/div/div/footer/div/div/ul/li[5]/a");
	private By HarriYouTube = By
			.xpath("//*[@id='harriApp']/div[1]/div[1]/div[1]/div/div/div/footer/div/div/ul/li[6]/a");

	public Menu(WebDriver driver) {
		this.driver = driver;
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void ClickBuildYourProfile() {
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(BuildYourProfile));
		WebElement build_yourprofile = driver.findElement(BuildYourProfile);
		build_yourprofile.click();
	}

	public void ClickHome() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Home));
		WebElement home = driver.findElement(Home);
		home.click();
	}

	public void ClickJobs() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Jobs));
		WebElement jobs = driver.findElement(Jobs);
		jobs.click();
	}

	public void ClickPeople() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(People));
		WebElement people = driver.findElement(People);
		people.click();
	}

	public void ClickCompanies() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Companies));
		WebElement companies = driver.findElement(Companies);
		companies.click();
	}

	public void ClickLogin() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Login));
		WebElement login = driver.findElement(Login);
		login.click();
	}

	public void ClickHelpAndSupport() {
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(HelpAndSupport));
		WebElement help_and_support = driver.findElement(HelpAndSupport);
		help_and_support.click();
	}

	public void ClickPricing() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Pricing));
		WebElement pricing = driver.findElement(Pricing);
		pricing.click();
	}

	public void ClickAboutHarri() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(AboutHarri));
		WebElement about_harri = driver.findElement(AboutHarri);
		about_harri.click();
	}

	public void ClickHarriBlog() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(HarriBlog));
		WebElement harri_blog = driver.findElement(HarriBlog);
		harri_blog.click();
	}

	public void ClickTermsOfService() {
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(TermsOfService));
		WebElement terms_of_service = driver.findElement(TermsOfService);
		terms_of_service.click();
	}

	public void ClickPrivacy() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Privacy));
		WebElement privacy = driver.findElement(Privacy);
		privacy.click();
	}

	public void ClickFAQ() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(FAQ));
		WebElement faq = driver.findElement(FAQ);
		faq.click();
	}

	public void ClickContactUs() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(ContactUs));
		WebElement contact_us = driver.findElement(ContactUs);
		contact_us.click();
	}

	public void ClickHarriFB() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(HarriFB));
		WebElement fb = driver.findElement(HarriFB);
		fb.click();
	}

	public void ClickHarriTwitter() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(HarriTwitter));
		WebElement twitter = driver.findElement(HarriTwitter);
		twitter.click();
	}

	public void ClickHarriInstagram() {
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(HarriInstagram));
		WebElement instagram = driver.findElement(HarriInstagram);
		instagram.click();
	}

	public void ClickHarriLinkedIn() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(HarriLinkedIn));
		WebElement linkedin = driver.findElement(HarriLinkedIn);
		linkedin.click();
	}

	public void ClickHarriPinterest() {
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(HarriPinterest));
		WebElement pinterest = driver.findElement(HarriPinterest);
		pinterest.click();
	}

	public void ClickHarriYouTube() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(HarriYouTube));
		WebElement youtube = driver.findElement(HarriYouTube);
		youtube.click();
	}

}
