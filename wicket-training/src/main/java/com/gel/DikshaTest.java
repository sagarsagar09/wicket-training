package com.gel;

public class DikshaTest {
	 private String name;
	 private int age;
	 private long mobilenumber;
	 private float height;
	
	
	 
	 
	public DikshaTest(String name, int age, long mobilenumber, float height) {
		super();
		this.name = name;
		this.age = age;
		this.mobilenumber = mobilenumber;
		this.height = height;
		
	}
	
	
	public DikshaTest() {
		
		// TODO Auto-generated constructor stub
		System.out.println("Hey good to create an object of diksha....");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello world.... Wicket training program");
		DikshaTest st = new DikshaTest();
		DikshaTest st1 = new DikshaTest("diksha", 42,27678278989L, 56.6f);
		System.out.println(st1.getName());
		System.out.println(st1.getAge());
		System.out.println(st1.getMobilenumber());
		System.out.println(st1.getHeight());
		for(int i=1;i<10;i++) {
			System.out.println(i+" X "+4+" = "+i*4);
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
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
}
	

