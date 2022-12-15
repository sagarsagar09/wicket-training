package com.gel;

public class VishalTest {
	
	
	private byte byteVar; 
	private int intVar; 
	private short shortVar; 
	private long longVar; 
	private float floatVar; 
	private char charVar; 
	private String stringVar; 
	private boolean boolVar;
	
	public VishalTest(byte byteVar, int intVar, short shortVar, long longVar, float floatVar, char charVar,
			String stringVar, boolean boolVar) {
		super();
		this.byteVar = byteVar;
		this.intVar = intVar;
		this.shortVar = shortVar;
		this.longVar = longVar;
		this.floatVar = floatVar;
		this.charVar = charVar;
		this.stringVar = stringVar;
		this.boolVar = boolVar;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		
	}
	
	public byte getbyteVar() {
		return byteVar;
	}
	public void setbyteVar(byte byteVar) {
		this.byteVar = byteVar;
	}
	public int getIntVar() {
		return intVar;
	}
	public void setIntVar(int intVar) {
		this.intVar = intVar;
	}
	public short getShortVar() {
		return shortVar;
	}
	public void setShortVar(short shortVar) {
		this.shortVar = shortVar;
	}
	public long getLongVar() {
		return longVar;
	}
	public void setLongVar(long longVar) {
		this.longVar = longVar;
	}
	public float getFloatVar() {
		return floatVar;
	}
	public void setFloatVar(float floatVar) {
		this.floatVar = floatVar;
	}
	public char getCharVar() {
		return charVar;
	}
	public void setCharVar(char charVar) {
		this.charVar = charVar;
	}
	public String getStringVar() {
		return stringVar;
	}
	public void setStringVar(String stringVar) {
		this.stringVar = stringVar;
	}
	public boolean isBoolVar() {
		return boolVar;
	}
	public void setBoolVar(boolean boolVar) {
		this.boolVar = boolVar;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + byteVar;
		result = prime * result + (boolVar ? 1231 : 1237);
		result = prime * result + charVar;
		result = prime * result + Float.floatToIntBits(floatVar);
		result = prime * result + intVar;
		result = prime * result + (int) (longVar ^ (longVar >>> 32));
		result = prime * result + shortVar;
		result = prime * result + ((stringVar == null) ? 0 : stringVar.hashCode());
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
		VishalTest other = (VishalTest) obj;
		if (byteVar != other.byteVar)
			return false;
		if (boolVar != other.boolVar)
			return false;
		if (charVar != other.charVar)
			return false;
		if (Float.floatToIntBits(floatVar) != Float.floatToIntBits(other.floatVar))
			return false;
		if (intVar != other.intVar)
			return false;
		if (longVar != other.longVar)
			return false;
		if (shortVar != other.shortVar)
			return false;
		if (stringVar == null) {
			if (other.stringVar != null)
				return false;
		} else if (!stringVar.equals(other.stringVar))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "VishalTest [byteVar=" + byteVar + ", intVar=" + intVar + ", shortVar=" + shortVar + ", longVar=" + longVar
				+ ", floatVar=" + floatVar + ", charVar=" + charVar + ", stringVar=" + stringVar + ", boolVar="
				+ boolVar + "]";
	}

	
}
