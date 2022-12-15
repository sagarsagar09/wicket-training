package com.gel;

public class SagarTest {

	private int inty;
	private short shorty;
	private long lng;
	private char cha;
	private char name;
	private boolean booln;
	private float flo;
	private byte bye;
	
	
	public SagarTest(int inty, short shorty, long lng, char cha, char name, boolean booln, float flo, byte bye) {
		super();
		this.inty = inty;
		this.shorty = shorty;
		this.lng = lng;
		this.cha = cha;
		this.name = name;
		this.booln = booln;
		this.flo = flo;
		this.bye = bye;
	}

	public SagarTest() {
		// TODO Auto-generated constructor stub
		System.out.println("Hello");
	}
	
public static void main(String[] args) {
		
		}
	
	
	
	public int getInty() {
		return inty;
	}
	public void setInty(int inty) {
		this.inty = inty;
	}
	public short getShorty() {
		return shorty;
	}
	public void setShorty(short shorty) {
		this.shorty = shorty;
	}
	public long getLng() {
		return lng;
	}
	public void setLng(long lng) {
		this.lng = lng;
	}
	public char getCha() {
		return cha;
	}
	public void setCha(char cha) {
		this.cha = cha;
	}
	public char getName() {
		return name;
	}
	public void setName(char name) {
		this.name = name;
	}
	public boolean isBooln() {
		return booln;
	}
	public void setBooln(boolean booln) {
		this.booln = booln;
	}
	public float getFlo() {
		return flo;
	}
	public void setFlo(float flo) {
		this.flo = flo;
	}
	public byte getBye() {
		return bye;
	}
	public void setBye(byte bye) {
		this.bye = bye;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (booln ? 1231 : 1237);
		result = prime * result + bye;
		result = prime * result + cha;
		result = prime * result + Float.floatToIntBits(flo);
		result = prime * result + inty;
		result = prime * result + (int) (lng ^ (lng >>> 32));
		result = prime * result + name;
		result = prime * result + shorty;
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
		SagarTest other = (SagarTest) obj;
		if (booln != other.booln)
			return false;
		if (bye != other.bye)
			return false;
		if (cha != other.cha)
			return false;
		if (Float.floatToIntBits(flo) != Float.floatToIntBits(other.flo))
			return false;
		if (inty != other.inty)
			return false;
		if (lng != other.lng)
			return false;
		if (name != other.name)
			return false;
		if (shorty != other.shorty)
			return false;
		return true;
	}
	
	
}