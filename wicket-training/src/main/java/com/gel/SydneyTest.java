package com.gel;

public class SydneyTest {
	private String name;
	private int age;
	private String firstName;
	private String lastName;
	
	//Getters and Setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	@Override
	public String toString() {
		return "SydneyTest [name=" + name + ", age=" + age + ", firstName=" + firstName + ", lastName=" + lastName
				+ "]";
	}
	
	public static void main(String args[]) {
		System.out.println("Hello World");
	}
	
	
}
