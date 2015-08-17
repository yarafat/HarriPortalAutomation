/**
 * 
 */
package com.pack.entities;

/**
 * @author Yaser
 *
 */
public class PaymentMethod {
	
	private String FirstName;
	private String LastName;
	private String CardNumber ;
	private int ExpirationMonth;
	private int ExpirationYear;
	private String CardSecurityCode ;
	private String Address ;
	private String Company ;
	private String State ;
	private String Country ;
	private String ZipCode ;
	
	
	public PaymentMethod() {
		super();
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return FirstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return CardNumber;
	}
	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}
	/**
	 * @return the expirationMonth
	 */
	public int getExpirationMonth() {
		return ExpirationMonth;
	}
	/**
	 * @param expirationMonth the expirationMonth to set
	 */
	public void setExpirationMonth(int expirationMonth) {
		ExpirationMonth = expirationMonth;
	}
	/**
	 * @return the expirationYear
	 */
	public int getExpirationYear() {
		return ExpirationYear;
	}
	/**
	 * @param expirationYear the expirationYear to set
	 */
	public void setExpirationYear(int expirationYear) {
		ExpirationYear = expirationYear;
	}
	/**
	 * @return the cardSecurityCode
	 */
	public String getCardSecurityCode() {
		return CardSecurityCode;
	}
	/**
	 * @param cardSecurityCode the cardSecurityCode to set
	 */
	public void setCardSecurityCode(String cardSecurityCode) {
		CardSecurityCode = cardSecurityCode;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return Address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		Address = address;
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return Company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		Company = company;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return State;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		State = state;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return Country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		Country = country;
	}
	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return ZipCode;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PaymentMethod [FirstName=" + FirstName + ", LastName="
				+ LastName + ", CardNumber=" + CardNumber
				+ ", ExpirationMonth=" + ExpirationMonth + ", ExpirationYear="
				+ ExpirationYear + ", CardSecurityCode=" + CardSecurityCode
				+ ", Address=" + Address + ", Company=" + Company + ", State="
				+ State + ", Country=" + Country + ", ZipCode=" + ZipCode + "]";
	}
	
	

}
