package com.aditya.aws.pojo;

public class Person {
	
	String fname;
	String lname;
	String mobile;
	
	public Person(String fname, String lname, String mobile) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.mobile = mobile;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
