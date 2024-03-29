package fr.fms.entities;

public abstract class Person {

	//attributes
	private String firstName;
	private String lastName;
	private int age;
	private Address address;
	
	
	//constructor
	public Person() {
		super();	
	}

	public Person(String firstName, String lastName, int age, Address address) {
		super();
		this.firstName = lastName;
		this.lastName = firstName;
		this.age = age;
		this.address = new Address(address.getStreet(), address.getCity(), address.getPostalCode(), address.getCountry());
	}
	
	
	//methods


	public abstract void modifyPerson(String firstName , String lastName , int ages);
	public abstract void removePerson(String personName);



	//getters & setter
	public String getLastName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.firstName = lastName;
	}

	public String getFirstName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.lastName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "[nom : " + lastName + ", prenom : " + firstName + ", age : " + age + ", " + address + ", ";
	}

	
	
}
