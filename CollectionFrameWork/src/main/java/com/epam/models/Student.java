package com.epam.models;

public class Student {
	private String name;
	private Integer standard;
	private String rollNo;
	private Integer age;
	private String address;
	
	public Student(String name, Integer age, String address, Integer standard, String rollNo) {
		super();
		this.name = name;
		this.standard = standard;
		this.rollNo = rollNo;
		this.age = age;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getRollNo() {
		return rollNo;
	}
	
	public Integer getStandard() {
		return standard;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	
	public void setStandard(Integer standard) {
		this.standard = standard;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
}