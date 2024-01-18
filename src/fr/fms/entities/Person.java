package fr.fms.entities;

public abstract class Person {

	//attributes
	private String firstName;
	private String lastName;
	private int age;
	
	// Address address = new Address(String street, String city, String state, int postalCode);
	
	//constructor
	public Person() {
		super();	
	}

	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = lastName;
		this.lastName = firstName;
		this.age = age;
	}
	
	
	//methods
	public abstract String modifyPerson();
	public abstract String removePerson();


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

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + "]";
	}

	
	
}
