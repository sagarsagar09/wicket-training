package com.gel;

public class MisriaTest {
	
	private String name;
	private int age;
	private boolean False;
	long l = 15621525127L;
	short s = 7878;
	char ch = 'a';
	float f = 1.25f;
	

	public static void main(String[] args) {
		//
		//
		
	}


	@Override
	public String toString() {
		return "MisriaTest [name=" + name + ", age=" + age + ", False=" + False + ", l=" + l + ", s=" + s + ", ch=" + ch
				+ ", f=" + f + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (False ? 1231 : 1237);
		result = prime * result + age;
		result = prime * result + ch;
		result = prime * result + Float.floatToIntBits(f);
		result = prime * result + (int) (l ^ (l >>> 32));
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
		MisriaTest other = (MisriaTest) obj;
		if (False != other.False)
			return false;
		if (age != other.age)
			return false;
		if (ch != other.ch)
			return false;
		if (Float.floatToIntBits(f) != Float.floatToIntBits(other.f))
			return false;
		if (l != other.l)
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


	public boolean isFalse() {
		return False;
	}


	public void setFalse(boolean false1) {
		False = false1;
	}


	public long getL() {
		return l;
	}


	public void setL(long l) {
		this.l = l;
	}


	public short getS() {
		return s;
	}


	public void setS(short s) {
		this.s = s;
	}


	public char getCh() {
		return ch;
	}


	public void setCh(char ch) {
		this.ch = ch;
	}


	public float getF() {
		return f;
	}


	public void setF(float f) {
		this.f = f;
	}

}
