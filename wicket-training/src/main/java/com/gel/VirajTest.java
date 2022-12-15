package com.gel;

public class VirajTest {
	private int age;
	private long salary;
	private String firstName;
	private String lastName;
	
	
	
	  
	
	public VirajTest(int age, long salary, String firstName, String lastName) {
		super();
		this.age = age;
		this.salary = salary;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	


	public VirajTest() {
		
		System.out.println("good");
	}




	public static void main(String[] args) {
		System.out.println("Hello world.... Wicket training program");
		VirajTest st = new VirajTest();
		VirajTest st1 = new VirajTest(22, 4200, "viraj", "kudav");
		System.out.println(st1.getAge());
		System.out.println(st1.getSalary());
		System.out.println(st1.getFirstName());
		System.out.println(st1.getLastName());

		for(int i=1;i<10;i++) {
			System.out.println(i+" X "+5+" = "+i*5);
		}
		
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public long getSalary() {
		return salary;
	}




	public void setSalary(long salary) {
		this.salary = salary;
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


	
}
