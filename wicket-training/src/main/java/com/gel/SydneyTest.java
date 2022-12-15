package com.gel;

public class SydneyTest {
	private int myNum = 5;
	private float myFloatNum = 5.99f;
	private char myLetter = 'D';
	private boolean myBool = true;
	private String myText = "Hello";
	
	public static void main(String args[]) {
		System.out.println("Hello World");
	}

	@Override
	public String toString() {
		return "SydneyTest [myNum=" + myNum + ", myFloatNum=" + myFloatNum + ", myLetter=" + myLetter + ", myBool="
				+ myBool + ", myText=" + myText + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (myBool ? 1231 : 1237);
		result = prime * result + Float.floatToIntBits(myFloatNum);
		result = prime * result + myLetter;
		result = prime * result + myNum;
		result = prime * result + ((myText == null) ? 0 : myText.hashCode());
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
		SydneyTest other = (SydneyTest) obj;
		if (myBool != other.myBool)
			return false;
		if (Float.floatToIntBits(myFloatNum) != Float.floatToIntBits(other.myFloatNum))
			return false;
		if (myLetter != other.myLetter)
			return false;
		if (myNum != other.myNum)
			return false;
		if (myText == null) {
			if (other.myText != null)
				return false;
		} else if (!myText.equals(other.myText))
			return false;
		return true;
	}

	public int getMyNum() {
		return myNum;
	}

	public void setMyNum(int myNum) {
		this.myNum = myNum;
	}

	public float getMyFloatNum() {
		return myFloatNum;
	}

	public void setMyFloatNum(float myFloatNum) {
		this.myFloatNum = myFloatNum;
	}

	public char getMyLetter() {
		return myLetter;
	}

	public void setMyLetter(char myLetter) {
		this.myLetter = myLetter;
	}

	public boolean isMyBool() {
		return myBool;
	}

	public void setMyBool(boolean myBool) {
		this.myBool = myBool;
	}

	public String getMyText() {
		return myText;
	}

	public void setMyText(String myText) {
		this.myText = myText;
	}
	
	
}
