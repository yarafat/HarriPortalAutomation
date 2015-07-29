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
	private String Hecs;
	private String Cuisine;
	private String Description ;
	private String ProfileLogoPath;
	private String CoverPhotoPath;
	private String BusinessEmail;
	private String GroupName;
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

	public String getHecs() {
		return Hecs;
	}

	public void setHecs(String hecs) {
		Hecs = hecs;
	}

	public String getCuisine() {
		return Cuisine;
	}

	public void setCuisine(String cuisine) {
		Cuisine = cuisine;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getProfileLogoPath() {
		return ProfileLogoPath;
	}

	public void setProfileLogoPath(String profileLogoPath) {
		ProfileLogoPath = profileLogoPath;
	}

	public String getCoverPhotoPath() {
		return CoverPhotoPath;
	}

	public void setCoverPhotoPath(String coverPhotoPath) {
		CoverPhotoPath = coverPhotoPath;
	}

	public String getBusinessEmail() {
		return BusinessEmail;
	}

	public void setBusinessEmail(String businessEmail) {
		BusinessEmail = businessEmail;
	}

	public String getGroupName() {
		return GroupName;
	}

	public void setGroupName(String groupName) {
		GroupName = groupName;
	}
	

}
