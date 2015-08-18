package com.pack.entities;

import java.util.Arrays;

public class Brand {
	private String BrandName;
	private String [] BrandLocation;// Always the location[0] is the main location , used to select the business 
	private String Hecs;
	private String Cuisine;
	private String BusinessEmail;
	private String GroupName;//will be removed 
	private String Description ;
	private Media media;
	

	public String getBrandName() {
		return BrandName;
	}
	public void setBrandName(String brandName) {
		BrandName = brandName;
	}
	
	
	public String[] getBrandLocation() {
		return BrandLocation;
	}
	public void setBrandLocation(String[] brandLocation) {
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
	public Media getMedia() {
		return media;
	}
	public void setMedia(Media media) {
		this.media = media;
	}


	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}


	@Override
	public String toString() {
		return "Brand [BrandName=" + BrandName + ", BrandLocation="
				+ Arrays.toString(BrandLocation) + ", Hecs=" + Hecs
				+ ", Cuisine=" + Cuisine + ", BusinessEmail=" + BusinessEmail
				+ ", GroupName=" + GroupName + ", media=" + media + "]";
	}
	
	

}
