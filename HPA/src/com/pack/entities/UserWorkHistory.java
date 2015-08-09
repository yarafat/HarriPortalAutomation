package com.pack.entities;

public class UserWorkHistory {
	private String Company;
	private String CompanyAddress;
	private String Position;
	private String StartMonth;
	private String StartYear;
	private String EndMonth;
	private String EndYear;
	private boolean NewPosition;
	private boolean StillWorkHere;

	public UserWorkHistory() {
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public String getCompanyAddress() {
		return CompanyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		CompanyAddress = companyAddress;
	}

	public String getPosition() {
		return Position;
	}

	public void setPosition(String position) {
		Position = position;
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

	public boolean isStillWorkHere() {
		return StillWorkHere;
	}

	public void setStillWorkHere(boolean stillWorkHere) {
		StillWorkHere = stillWorkHere;
	}

	public boolean isNewPosition() {
		return NewPosition;
	}

	public void setNewPosition(boolean newPosition) {
		NewPosition = newPosition;
	}

}
