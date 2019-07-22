package com.cg.iocdemo1;

public class Address {
	private String city, line1, line2;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public Address(String city, String line1, String line2) {
		super();
		this.city = city;
		this.line1 = line1;
		this.line2 = line2;
	}

	public Address() {
		super();
	}
	

}
