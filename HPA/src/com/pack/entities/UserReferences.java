package com.pack.entities;

public class UserReferences {
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserReferences [Name=" + Name + ", Phone=" + Phone
				+ ", Email=" + Email+ ", Company=" + Company  + "]";
	}

	private String Name;
	private String Phone;
	private String Email;
	private String Company;
	

	public UserReferences() {

	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

}
