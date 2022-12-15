package com.gel;

public class ShreyaTest {
	private String name;
	private int age;
	private long salary;
	
	
	public ShreyaTest(String name, int age,long salary) {
		this.name = name;
		this.age = age;
		this.salary= salary;
	}
	
	


	public ShreyaTest() {
		
		System.out.println("Object");
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

	


	public static void main(String[] args) {
		
		ShreyaTest s0 = new ShreyaTest();
		ShreyaTest s1 = new ShreyaTest("Adam", 24, 100000);
		System.out.println(s1);
		
	}




	@Override
	public String toString() {
		return "ShreyaTest [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (salary ^ (salary >>> 32));
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
		ShreyaTest other = (ShreyaTest) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	
	
}
