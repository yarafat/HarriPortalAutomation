package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Footer {

	private WebDriver driver;

	private By locations_newyork = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/div[3]/footer/div[1]/div/div/div[1]/div/ul/li[1]/a");
	private By locations_miami = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/div[3]/footer/div[1]/div/div/div[1]/div/ul/li[2]/a");
	private By locations_losangeles = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/div[3]/footer/div[1]/div/div/div[1]/div/ul/li[3]/a");
	private By locations_lasvegas = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/div[3]/footer/div[1]/div/div/div[1]/div/ul/li[4]/a");
	private By locations_boston = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/div[3]/footer/div[1]/div/div/div[1]/div/ul/li[5]/a");

	private By talent_bartender = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/div[3]/footer/div[1]/div/div/div[2]/div/div/ul/li[1]/a");
	private By talent_cashier = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/div[3]/footer/div[1]/div/div/div[2]/div/div/ul/li[2]/a");
	private By talent_host = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/div[3]/footer/div[1]/div/div/div[2]/div/div/ul/li[3]/a");
	private By talent_kitchen_manager = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/div[3]/footer/div[1]/div/div/div[2]/div/div/ul/li[4]/a");
	private By talent_line_cook = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/div[3]/footer/div[1]/div/div/div[2]/div/div/ul/li[5]/a");
	private By talent_assistance_manager = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/div[3]/footer/div[1]/div/div/div[2]/div/div/ul/li[6]/a");
	private By talent_delivery_person = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/div[3]/footer/div[1]/div/div/div[2]/div/div/ul/li[7]/a");
	private By talent_server = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/div[3]/footer/div[1]/div/div/div[2]/div/div/ul/li[8]/a");

	private By harri_helpSupport = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/div[3]/footer/div[1]/div/div/div[3]/div/ul/li[1]/a");
	private By harri_pricing = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/div[3]/footer/div[1]/div/div/div[3]/div/ul/li[2]/a");
	private By harri_about = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/div[3]/footer/div[1]/div/div/div[3]/div/ul/li[3]/a");
	private By harri_blog = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/div[3]/footer/div[1]/div/div/div[3]/div/ul/li[4]/a");
	private By harri_termsOfService = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/div[3]/footer/div[1]/div/div/div[3]/div/ul/li[5]/a");
	private By harri_privacy = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/div[3]/footer/div[1]/div/div/div[3]/div/ul/li[6]/a");
	private By harri_FAQ = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/div[3]/footer/div[1]/div/div/div[3]/div/ul/li[7]/a");
	private By harri_contactUs = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/div[3]/footer/div[1]/div/div/div[3]/div/ul/li[8]/a");

	public Footer(WebDriver driver) {
		this.driver = driver;
	}

	public void click_locations_newyork() {
		WebElement link = driver.findElement(locations_newyork);
		if (link.isDisplayed() || link.isEnabled())
			link.click();
		else
			System.out.println("Element : " + link.toString()
					+ " can't be reached");
	}

	public void click_locations_miami() {
		WebElement link = driver.findElement(locations_miami);
		if (link.isDisplayed() || link.isEnabled())
			link.click();
		else
			System.out.println("Element : " + link.toString()
					+ " can't be reached");
	}

	public void click_locations_losangeles() {
		WebElement link = driver.findElement(locations_losangeles);
		if (link.isDisplayed() || link.isEnabled())
			link.click();
		else
			System.out.println("Element : " + link.toString()
					+ " can't be reached");
	}

	public void click_locations_lasvegas() {
		WebElement link = driver.findElement(locations_lasvegas);
		if (link.isDisplayed() || link.isEnabled())
			link.click();
		else
			System.out.println("Element : " + link.toString()
					+ " can't be reached");
	}

	public void click_locations_boston() {
		WebElement link = driver.findElement(locations_boston);
		if (link.isDisplayed() || link.isEnabled())
			link.click();
		else
			System.out.println("Element : " + link.toString()
					+ " can't be reached");
	}

	
	public void click_talent_bartender() {
		WebElement link = driver.findElement(talent_bartender);
		if (link.isDisplayed() || link.isEnabled())
			link.click();
		else
			System.out.println("Element : " + link.toString()
					+ " can't be reached");
	}
	
	public void click_talent_cashier() {
		WebElement link = driver.findElement(talent_cashier);
		if (link.isDisplayed() || link.isEnabled())
			link.click();
		else
			System.out.println("Element : " + link.toString()
					+ " can't be reached");
	}
	
	public void click_talent_host() {
		WebElement link = driver.findElement(talent_host);
		if (link.isDisplayed() || link.isEnabled())
			link.click();
		else
			System.out.println("Element : " + link.toString()
					+ " can't be reached");
	}
	public void click_talent_kitchen_manager() {
		WebElement link = driver.findElement(talent_kitchen_manager);
		if (link.isDisplayed() || link.isEnabled())
			link.click();
		else
			System.out.println("Element : " + link.toString()
					+ " can't be reached");
	}
	public void click_talent_line_cook() {
		WebElement link = driver.findElement(talent_line_cook);
		if (link.isDisplayed() || link.isEnabled())
			link.click();
		else
			System.out.println("Element : " + link.toString()
					+ " can't be reached");
	}
	public void click_talent_assistance_manager() {
		WebElement link = driver.findElement(talent_assistance_manager);
		if (link.isDisplayed() || link.isEnabled())
			link.click();
		else
			System.out.println("Element : " + link.toString()
					+ " can't be reached");
	}
	public void click_talent_delivery_person() {
		WebElement link = driver.findElement(talent_delivery_person);
		if (link.isDisplayed() || link.isEnabled())
			link.click();
		else
			System.out.println("Element : " + link.toString()
					+ " can't be reached");
	}
	
	public void click_talent_server() {
		WebElement link = driver.findElement(talent_server);
		if (link.isDisplayed() || link.isEnabled())
			link.click();
		else
			System.out.println("Element : " + link.toString()
					+ " can't be reached");
	}
	
	public void click_harri_helpSupport() {
		WebElement link = driver.findElement(harri_helpSupport);
		if (link.isDisplayed() || link.isEnabled())
			link.click();
		else
			System.out.println("Element : " + link.toString()
					+ " can't be reached");
	}
	public void click_harri_pricing() {
		WebElement link = driver.findElement(harri_pricing);
		if (link.isDisplayed() || link.isEnabled())
			link.click();
		else
			System.out.println("Element : " + link.toString()
					+ " can't be reached");
	}
	public void click_harri_about() {
		WebElement link = driver.findElement(harri_about);
		if (link.isDisplayed() || link.isEnabled())
			link.click();
		else
			System.out.println("Element : " + link.toString()
					+ " can't be reached");
	}
	public void click_harri_blog() {
		WebElement link = driver.findElement(harri_blog);
		if (link.isDisplayed() || link.isEnabled())
			link.click();
		else
			System.out.println("Element : " + link.toString()
					+ " can't be reached");
	}
	public void click_harri_termsOfService() {
		WebElement link = driver.findElement(harri_termsOfService);
		if (link.isDisplayed() || link.isEnabled())
			link.click();
		else
			System.out.println("Element : " + link.toString()
					+ " can't be reached");
	}
	public void click_harri_privacy() {
		WebElement link = driver.findElement(harri_privacy);
		if (link.isDisplayed() || link.isEnabled())
			link.click();
		else
			System.out.println("Element : " + link.toString()
					+ " can't be reached");
	}
	public void click_harri_faq() {
		WebElement link = driver.findElement(harri_FAQ);
		if (link.isDisplayed() || link.isEnabled())
			link.click();
		else
			System.out.println("Element : " + link.toString()
					+ " can't be reached");
	}
	public void click_harri_contactUs() {
		WebElement link = driver.findElement(harri_contactUs);
		if (link.isDisplayed() || link.isEnabled())
			link.click();
		else
			System.out.println("Element : " + link.toString()
					+ " can't be reached");
	}
}