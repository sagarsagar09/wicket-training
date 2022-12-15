package com.gel;

public class ShivaTest {
	
	private String name;
	private int age;
	private String firstName;
	private String lastName;
	
	
	public ShivaTest(String name, int age, String firstName, String lastName) {
		super();
		this.name = name;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public ShivaTest() {
		// TODO Auto-generated constructor stub
		System.out.println("Hey good to create an object of Shiva....");
	}

	public static void main(String[] args) {
		
		System.out.println("Hello world.... Wicket training program");
		ShivaTest st = new ShivaTest();
		ShivaTest st1 = new ShivaTest("Shiva", 42, "Sivakumar", "Nair");
		System.out.println(st1.getName());
		System.out.println(st1.getAge());
		System.out.println(st1.getFirstName());
		System.out.println(st1.getLastName());
		for(int i=1;i<10;i++) {
			System.out.println(i+" X "+5+" = "+i*5);
		}
		
	}

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShivaTest other = (ShivaTest) obj;
		if (age != other.age)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ShivaTest [name=" + name + ", age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
