/**
* user class for setting and getting user info
* @author  Aziza Mustafa
* @version 1.0
* @since   2015-07-28 
*/
package com.pack.utils;

public class User {
	private String FirstUserName;
	private String LastUserName;
	private String Password;
	private String Email;
	private String BrandName;
	private String BrandLocation;
	private String Slug;
	private String phoneNumber;
	public User()
	{
		
	}
	
	public String getFirstUserName() {
		return FirstUserName;
	}
	public void setFirstUserName(String FirstUserName) {
		this.FirstUserName = FirstUserName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getBrandName() {
		return BrandName;
	}
	public void setBrandName(String brandName) {
		BrandName = brandName;
	}
	public String getBrandLocation() {
		return BrandLocation;
	}
	public void setBrandLocation(String brandLocation) {
		BrandLocation = brandLocation;
	}
	public String getSlug() {
		return Slug;
	}
	public void setSlug(String slug) {
		Slug = slug;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLastUserName() {
		return LastUserName;
	}

	public void setLastUserName(String lastUserName) {
		LastUserName = lastUserName;
	}
	

}
