package com.gel;

public class AdityaTest {

	
	
	private byte bytevar;
private int intvar;
private long longvar;
private short shortvar;
private float floatvar;
private String stringvar;
private boolean booleanvar;

public byte getBytevar() {
	return bytevar;
}
public void setBytevar(byte bytevar) {
	this.bytevar = bytevar;
}
public int getIntvar() {
	return intvar;
}
public void setIntvar(int intvar) {
	this.intvar = intvar;
}
public long getLongvar() {
	return longvar;
}
public void setLongvar(long longvar) {
	this.longvar = longvar;
}
public short getShortvar() {
	return shortvar;
}
public void setShortvar(short shortvar) {
	this.shortvar = shortvar;
}
public float getFloatvar() {
	return floatvar;
}
public void setFloatvar(float floatvar) {
	this.floatvar = floatvar;
}
public String getStringvar() {
	return stringvar;
}
public void setStringvar(String stringvar) {
	this.stringvar = stringvar;
}
public boolean isBooleanvar() {
	return booleanvar;
}
public void setBooleanvar(boolean booleanvar) {
	this.booleanvar = booleanvar;
}
public char getCharvar() {
	return charvar;
}
public void setCharvar(char charvar) {
	this.charvar = charvar;
}
private char charvar;

public AdityaTest(byte bytevar, int intvar, long longvar, short shortvar, float floatvar, String stringvar,
		boolean booleanvar, char charvar) {
	super();
	this.bytevar = bytevar;
	this.intvar = intvar;
	this.longvar = longvar;
	this.shortvar = shortvar;
	this.floatvar = floatvar;
	this.stringvar = stringvar;
	this.booleanvar = booleanvar;
	this.charvar = charvar;
}
@Override
public String toString() {
	return "AdityaTest [bytevar=" + bytevar + ", intvar=" + intvar + ", longvar=" + longvar + ", shortvar=" + shortvar
			+ ", floatvar=" + floatvar + ", stringvar=" + stringvar + ", booleanvar=" + booleanvar + ", charvar="
			+ charvar + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (booleanvar ? 1231 : 1237);
	result = prime * result + bytevar;
	result = prime * result + charvar;
	result = prime * result + Float.floatToIntBits(floatvar);
	result = prime * result + intvar;
	result = prime * result + (int) (longvar ^ (longvar >>> 32));
	result = prime * result + shortvar;
	result = prime * result + ((stringvar == null) ? 0 : stringvar.hashCode());
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
	AdityaTest other = (AdityaTest) obj;
	if (booleanvar != other.booleanvar)
		return false;
	if (bytevar != other.bytevar)
		return false;
	if (charvar != other.charvar)
		return false;
	if (Float.floatToIntBits(floatvar) != Float.floatToIntBits(other.floatvar))
		return false;
	if (intvar != other.intvar)
		return false;
	if (longvar != other.longvar)
		return false;
	if (shortvar != other.shortvar)
		return false;
	if (stringvar == null) {
		if (other.stringvar != null)
			return false;
	} else if (!stringvar.equals(other.stringvar))
		return false;
	return true;
}

public static void main(String[] args) {
	System.out.println("hello world");
}

}
