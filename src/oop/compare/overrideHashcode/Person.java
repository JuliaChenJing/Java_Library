package oop.compare.overrideHashcode;

import java.time.LocalDate;

public class Person {
	String firstName;
	String lastName;
	double salary;
	LocalDate dob;
	public Person(String fname, String lname, double salary, LocalDate dob) {
		this.firstName = fname;
		this.lastName = lname;
		this.salary = salary;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + ", dob=" + dob
				+ "]";
	}

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public double getSalary() {
		return salary;
	}
	public LocalDate getDob() {
		return dob;
	}
	
}
