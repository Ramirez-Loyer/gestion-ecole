package fr.fms.entities;

public abstract class Person {

	//attributes
	private String lastName;
	private String firstName;
	private int age;
	
	
	//constructor
	
	public Person() {
		super();	
	}


	public Person(String lastName, String firstName, int age) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}
	
	
	//methods
	
	public abstract String modifyPerson();
	public abstract String removePerson();


	//getters & setter
	
	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	

	
	
}
