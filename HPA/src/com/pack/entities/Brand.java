package com.pack.entities;

public class Brand {
	private String BrandName;
	private String BrandLocation;
	private String Hecs;
	private String Cuisine;
	private String BusinessEmail;
	private String GroupName;
	private String ProfileLogoPath;
	private String CoverPhotoPath;
	
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
}