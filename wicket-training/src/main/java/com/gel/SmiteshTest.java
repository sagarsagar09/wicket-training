package com.gel;

public class SmiteshTest {

	private String name;
	private int age;
	private String firstname;
	private String lastname;
	

	
	public SmiteshTest(String name, int age, String firstname, String lastname) {
		super();
		this.name = name;
		this.age = age;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	

	public SmiteshTest() {
		
		// TODO Auto-generated constructor stub
		System.out.println("Good to create an object");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		SmiteshTest st = new SmiteshTest();
		SmiteshTest st1 = new SmiteshTest("Smitesh",26,"Smitesh","Korgaonkar");
		System.out.println(st1.getName());
		System.out.println(st1.getAge());
		System.out.println(st1.getFirstname());
		System.out.println(st1.getLastname());
		
		for(int i=1;i<=10;i++)
		{
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
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
	
}
