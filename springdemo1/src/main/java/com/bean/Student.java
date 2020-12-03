package com.bean;

public class Student {
	private int stdId;
	private String firstName;
	private String lastName;
	public Student() {
		super();
	}
	public Student(int stdId, String firstName, String lastName) {
		super();
		this.stdId = stdId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
