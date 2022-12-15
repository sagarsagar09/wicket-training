package com.gel;

public class GauriTest {
	
	private int age;
	private String name;
	private boolean False;
	private float f= 4.6f;
	private short s = 10000;
	private long a = 100000L;
	private char ch= 'a';
	
	
	public static void main(String args[])
	{
		
		
	}

	@Override
	public String toString() {
		return "GauriTest [age=" + age + ", name=" + name + ", False=" + False + ", f=" + f + ", s=" + s + ", a=" + a
				+ ", ch=" + ch + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (False ? 1231 : 1237);
		result = prime * result + (int) (a ^ (a >>> 32));
		result = prime * result + age;
		result = prime * result + ch;
		result = prime * result + Float.floatToIntBits(f);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + s;
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
		GauriTest other = (GauriTest) obj;
		if (False != other.False)
			return false;
		if (a != other.a)
			return false;
		if (age != other.age)
			return false;
		if (ch != other.ch)
			return false;
		if (Float.floatToIntBits(f) != Float.floatToIntBits(other.f))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (s != other.s)
			return false;
		return true;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isFalse() {
		return False;
	}


	public void setFalse(boolean false1) {
		False = false1;
	}


	public float getF() {
		return f;
	}


	public void setF(float f) {
		this.f = f;
	}


	public short getS() {
		return s;
	}


	public void setS(short s) {
		this.s = s;
	}


	public long getA() {
		return a;
	}


	public void setA(long a) {
		this.a = a;
	}


	public char getCh() {
		return ch;
	}


	public void setCh(char ch) {
		this.ch = ch;
	}
	
	

}




