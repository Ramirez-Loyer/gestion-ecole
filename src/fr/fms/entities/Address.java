package fr.fms.entities;

public class Address {
	
	private String street;
	private String city;
	private String state;
	private int postalCode;
	private String country;
	
	
	public Address(String street, String city, int postalCode, String country) {
		super();
		this.street = street;
		this.city = city;
		
		this.postalCode = postalCode;
		this.country = country;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}

	public void validate() {}

	@Override
	public String toString() {
		return "Adresse : " + street + ", " + city + (state != null ? ", " + state : "") + ", " + postalCode
				+ ", " + country + " ";
	}
	
	

}
