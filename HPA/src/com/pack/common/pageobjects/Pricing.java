package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pricing {

private WebDriver driver;

private By posting = By.xpath("//*[@id='harriApp']/div[1]/div[3]/div[2]/div[2]/div/ul/li[1]/a");
private By monthly = By.xpath("//*[@id='harriApp']/div[1]/div[3]/div[2]/div[2]/div/ul/li[2]/a");
private By select_1_jop_posts_package = By.xpath("//*[@id='posting']/div/div/div[1]/div[1]/div[2]/div[4]/a");
private By select_3_jop_posts_package = By.xpath("//*[@id='posting']/div/div/div[2]/div[1]/div[2]/div[4]/a");
private By select_5_jop_posts_package = By.xpath("//*[@id='posting']/div/div/div[3]/div[1]/div[2]/div[4]/a");
private By select_silver_package = By.xpath("//*[@id='monthly']/div/div/div[1]/div[1]/div[2]/div[4]/button");
private By select_gold_package = By.xpath("//*[@id='monthly']/div/div/div[2]/div[1]/div[2]/div[4]/button");
private By select_platinium_package = By.xpath("//*[@id='monthly']/div/div/div[3]/div[1]/div[2]/div[4]/button");
private By send_help_email = By.xpath("//*[@id='harriApp']/div[1]/div[3]/div[2]/div[4]/div/div/div/div/div/div/div[2]/a[1]");
private By call_harri = By.xpath("//*[@id='harriApp']/div[1]/div[3]/div[2]/div[4]/div/div/div/div/div/div/div[2]/a[2]");
private By buy_indivisual_post_1= By.xpath("//*[@id='harriApp']/div[1]/div[4]/div/div[2]/div/div[3]/button");
private By subscribe = By.xpath("//*[@id='harriApp']/div[1]/div[5]/div/div[2]/div/div[3]/button");
private By learn_more = By.xpath("//*[@id='harriApp']/div[1]/div[5]/div/div[2]/div/div[3]/a");
private By buy_indivisual_post_2= By.xpath("//*[@id='harriApp']/div[1]/div[8]/div/div/div/div/div[1]/div[3]/button");
private By subscribe_monthly = By.xpath("//*[@id='harriApp']/div[1]/div[8]/div/div/div/div/div[2]/div[3]/button");



 public Pricing(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getPricingPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public void clickPostingSection() {
	WebElement postinglnk = driver.findElement(posting);
	if(postinglnk.isDisplayed()||postinglnk.isEnabled())
		postinglnk.click();
	else
		System.out.println("Element : "+postinglnk.toString()+" can't be reached");
	}
	
	public void clickMonthlySection() {
		WebElement monthlylnk = driver.findElement(monthly);
		if(monthlylnk.isDisplayed()||monthlylnk.isEnabled())
			monthlylnk.click();
		else
			System.out.println("Element : "+monthlylnk.toString()+" can't be reached");
		}
	
	public void select_1_jop_posts_package() {
		WebElement select = driver.findElement(select_1_jop_posts_package);
		if(select.isDisplayed()||select.isEnabled())
			select.click();
		else
			System.out.println("Element : "+select.toString()+" can't be reached");
		}
	public void select_2_jop_posts_package() {
		WebElement select = driver.findElement(select_3_jop_posts_package);
		if(select.isDisplayed()||select.isEnabled())
			select.click();
		else
			System.out.println("Element : "+select.toString()+" can't be reached");
		}
	public void select_5_jop_posts_package() {
		WebElement select = driver.findElement(select_5_jop_posts_package);
		if(select.isDisplayed()||select.isEnabled())
			select.click();
		else
			System.out.println("Element : "+select.toString()+" can't be reached");
		}
	public void select_silver_package() {
		WebElement select = driver.findElement(select_silver_package);
		if(select.isDisplayed()||select.isEnabled())
			select.click();
		else
			System.out.println("Element : "+select.toString()+" can't be reached");
		}
	public void select_gold_package() {
		WebElement select = driver.findElement(select_gold_package);
		if(select.isDisplayed()||select.isEnabled())
			select.click();
		else
			System.out.println("Element : "+select.toString()+" can't be reached");
		}
		
	public void select_platinium_package() {
		WebElement select = driver.findElement(select_platinium_package);
		if(select.isDisplayed()||select.isEnabled())
			select.click();
		else
			System.out.println("Element : "+select.toString()+" can't be reached");
		}
	public void call_harri() {
		WebElement select = driver.findElement(call_harri);
		if(select.isDisplayed()||select.isEnabled())
			select.click();
		else
			System.out.println("Element : "+select.toString()+" can't be reached");
		}
	
	public void send_help_email() {
		WebElement select = driver.findElement(send_help_email);
		if(select.isDisplayed()||select.isEnabled())
			select.click();
		else
			System.out.println("Element : "+select.toString()+" can't be reached");
		}
	
	public void buy_indivisual_post_1() {
		WebElement select = driver.findElement(buy_indivisual_post_1);
		if(select.isDisplayed()||select.isEnabled())
			select.click();
		else
			System.out.println("Element : "+select.toString()+" can't be reached");
		}
	public void buy_indivisual_post_2() {
		WebElement select = driver.findElement(buy_indivisual_post_2);
		if(select.isDisplayed()||select.isEnabled())
			select.click();
		else
			System.out.println("Element : "+select.toString()+" can't be reached");
		}
	public void subscribe() {
		WebElement select = driver.findElement(subscribe);
		if(select.isDisplayed()||select.isEnabled())
			select.click();
		else
			System.out.println("Element : "+select.toString()+" can't be reached");
		}
	public void learn_more() {
		WebElement select = driver.findElement(learn_more);
		if(select.isDisplayed()||select.isEnabled())
			select.click();
		else
			System.out.println("Element : "+select.toString()+" can't be reached");
		}
	public void subscribe_monthly() {
		WebElement select = driver.findElement(subscribe_monthly);
		if(select.isDisplayed()||select.isEnabled())
			select.click();
		else
			System.out.println("Element : "+select.toString()+" can't be reached");
		}

}