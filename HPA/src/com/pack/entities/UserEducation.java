package com.pack.entities;

public class UserEducation {
	private String Institution;
	private String Location;
	private String Degree;
	private String AreaOfStudy;
	private String StartMonth;
	private String StartYear;
	private String EndMonth;
	private String EndYear;
	private boolean StillAtShcool;

	public UserEducation() {
	}

	public String getInstitution() {
		return Institution;
	}

	public void setInstitution(String institution) {
		Institution = institution;
	}

	public String getDegree() {
		return Degree;
	}

	public void setDegree(String degree) {
		Degree = degree;
	}

	public String getAreaOfStudy() {
		return AreaOfStudy;
	}

	public void setAreaOfStudy(String areaOfStudy) {
		AreaOfStudy = areaOfStudy;
	}

	public String getStartMonth() {
		return StartMonth;
	}

	public void setStartMonth(String startMonth) {
		StartMonth = startMonth;
	}

	public String getStartYear() {
		return StartYear;
	}

	public void setStartYear(String startYear) {
		StartYear = startYear;
	}

	public String getEndMonth() {
		return EndMonth;
	}

	public void setEndMonth(String endMonth) {
		EndMonth = endMonth;
	}

	public String getEndYear() {
		return EndYear;
	}

	public void setEndYear(String endYear) {
		EndYear = endYear;
	}

	public boolean isStillAtShcool() {
		return StillAtShcool;
	}

	public void setStillAtShcool(boolean stillAtShcool) {
		StillAtShcool = stillAtShcool;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

}
