package com.pack.common.pageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Menu {
	protected WebDriver driver;
	private WebDriverWait wait;
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
		wait = new WebDriverWait(driver, 5);
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void ClickBuildYourProfile() {
		try {
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(BuildYourProfile));
			WebElement build_yourprofile = driver.findElement(BuildYourProfile);
			build_yourprofile.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickHome() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(Home));
			WebElement home = driver.findElement(Home);
			home.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickJobs() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(Jobs));
			WebElement jobs = driver.findElement(Jobs);
			jobs.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickPeople() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(People));
			WebElement people = driver.findElement(People);
			people.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickCompanies() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Companies));
		try {
			WebElement companies = driver.findElement(Companies);
			companies.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickLogin() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Login));
		try {
			WebElement login = driver.findElement(Login);
			login.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickHelpAndSupport() {
		try {
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(HelpAndSupport));
			WebElement help_and_support = driver.findElement(HelpAndSupport);
			help_and_support.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickPricing() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(Pricing));
			WebElement pricing = driver.findElement(Pricing);
			pricing.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickAboutHarri() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(AboutHarri));
		try {
			WebElement about_harri = driver.findElement(AboutHarri);
			about_harri.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickHarriBlog() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(HarriBlog));
		try {
			WebElement harri_blog = driver.findElement(HarriBlog);
			harri_blog.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickTermsOfService() {
		try {

			wait.until(ExpectedConditions
					.visibilityOfElementLocated(TermsOfService));
			WebElement terms_of_service = driver.findElement(TermsOfService);
			terms_of_service.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickPrivacy() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(Privacy));
			WebElement privacy = driver.findElement(Privacy);
			privacy.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickFAQ() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(FAQ));
			WebElement faq = driver.findElement(FAQ);
			faq.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickContactUs() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(ContactUs));
			WebElement contact_us = driver.findElement(ContactUs);
			contact_us.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}

	}

	public void ClickHarriFB() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(HarriFB));
			WebElement fb = driver.findElement(HarriFB);
			fb.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}

	}

	public void ClickHarriTwitter() {
		try {
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(HarriTwitter));
			WebElement twitter = driver.findElement(HarriTwitter);
			twitter.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickHarriInstagram() {
		try {
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(HarriInstagram));
			WebElement instagram = driver.findElement(HarriInstagram);
			instagram.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}

	}

	public void ClickHarriLinkedIn() {
		try {
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(HarriLinkedIn));
			WebElement linkedin = driver.findElement(HarriLinkedIn);
			linkedin.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickHarriPinterest() {
		try {
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(HarriPinterest));
			WebElement pinterest = driver.findElement(HarriPinterest);
			pinterest.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickHarriYouTube() {
		try {
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(HarriYouTube));
			WebElement youtube = driver.findElement(HarriYouTube);
			youtube.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

}
