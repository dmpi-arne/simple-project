package oop_2;

public class Person {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private int ageInyear;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAgeInyear() {
		return ageInyear;
	}
	public void setAgeInyear(int ageInyear) {
		this.ageInyear = ageInyear;
	}
	
	public String getFullName() {
		return firstName + " " +middleName + " " +lastName;
	}
	
}
