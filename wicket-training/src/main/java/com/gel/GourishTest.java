package com.gel;

public class GourishTest {
	private int num = 6;
	private float FloatNum =6.23f;
	private char letter = 'G';
	private boolean Boo = true;
	private String Text = "Hello";
	private long number= 2345;
	
	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public static void main(String args[]) {
		System.out.println("Hello World");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (Boo ? 1231 : 1237);
		result = prime * result + Float.floatToIntBits(FloatNum);
		result = prime * result + ((Text == null) ? 0 : Text.hashCode());
		result = prime * result + letter;
		result = prime * result + num;
		result = prime * result + (int) (number ^ (number >>> 32));
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
		GourishTest other = (GourishTest) obj;
		if (Boo != other.Boo)
			return false;
		if (Float.floatToIntBits(FloatNum) != Float.floatToIntBits(other.FloatNum))
			return false;
		if (Text == null) {
			if (other.Text != null)
				return false;
		} else if (!Text.equals(other.Text))
			return false;
		if (letter != other.letter)
			return false;
		if (num != other.num)
			return false;
		if (number != other.number)
			return false;
		return true;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public float getFloatNum() {
		return FloatNum;
	}

	public void setFloatNum(float floatNum) {
		FloatNum = floatNum;
	}

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	public boolean isBoo() {
		return Boo;
	}

	public void setBoo(boolean boo) {
		Boo = boo;
	}

	public String getText() {
		return Text;
	}

	public void setText(String text) {
		Text = text;
	}

	@Override
	public String toString() {
		return "GourishTest [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
