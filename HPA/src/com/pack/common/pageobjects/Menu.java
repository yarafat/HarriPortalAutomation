package com.pack.common.pageobjects;

import org.openqa.selenium.*;

public class Menu {
	protected WebDriver driver;
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
		WebElement build_yourprofile = driver.findElement(BuildYourProfile);
		build_yourprofile.click();
	}

	public void ClickHome() {
		WebElement home = driver.findElement(Home);
		home.click();
	}

	public void ClickJobs() {
		WebElement jobs = driver.findElement(Jobs);
		jobs.click();
	}

	public void ClickPeople() {
		WebElement people = driver.findElement(People);
		people.click();
	}

	public void ClickCompanies() {
		WebElement companies = driver.findElement(Companies);
		companies.click();
	}

	public void ClickLogin() {
		WebElement login = driver.findElement(Login);
		login.click();
	}

	public void ClickHelpAndSupport() {
		WebElement help_and_support = driver.findElement(HelpAndSupport);
		help_and_support.click();
	}

	public void ClickPricing() {
		WebElement pricing = driver.findElement(Pricing);
		pricing.click();
	}

	public void ClickAboutHarri() {
		WebElement about_harri = driver.findElement(AboutHarri);
		about_harri.click();
	}

	public void ClickHarriBlog() {
		WebElement harri_blog = driver.findElement(HarriBlog);
		harri_blog.click();
	}

	public void ClickTermsOfService() {
		WebElement terms_of_service = driver.findElement(TermsOfService);
		terms_of_service.click();
	}

	public void ClickPrivacy() {
		WebElement privacy = driver.findElement(Privacy);
		privacy.click();
	}

	public void ClickFAQ() {
		WebElement faq = driver.findElement(FAQ);
		faq.click();
	}

	public void ClickContactUs() {
		WebElement contact_us = driver.findElement(ContactUs);
		contact_us.click();
	}

	public void ClickHarriFB() {
		WebElement fb = driver.findElement(HarriFB);
		fb.click();
	}

	public void ClickHarriTwitter() {
		WebElement twitter = driver.findElement(HarriTwitter);
		twitter.click();
	}

	public void ClickHarriInstagram() {
		WebElement instagram = driver.findElement(HarriInstagram);
		instagram.click();
	}

	public void ClickHarriLinkedIn() {
		WebElement linkedin = driver.findElement(HarriLinkedIn);
		linkedin.click();
	}

	public void ClickHarriPinterest() {
		WebElement pinterest = driver.findElement(HarriPinterest);
		pinterest.click();
	}

	public void ClickHarriYouTube() {
		WebElement youtube = driver.findElement(HarriYouTube);
		youtube.click();
	}

}
