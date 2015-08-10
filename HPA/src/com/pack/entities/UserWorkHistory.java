package com.pack.entities;

public class UserWorkHistory {
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserWorkHistory [Company=" + Company + ", CompanyAddress="
				+ CompanyAddress + ", Position=" + Position + ", StartMonth="
				+ StartMonth + ", StartYear=" + StartYear + ", EndMonth="
				+ EndMonth + ", EndYear=" + EndYear + ", StillWorkHere="
				+ StillWorkHere + "]";
	}

	private String Company;
	private String CompanyAddress;
	private String Position;
	private String StartMonth;
	private String StartYear;
	private String EndMonth;
	private String EndYear;
	private String Description;
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

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

}
