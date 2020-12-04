package com.example.studentsHackathon;

public class Student {
	private int regID;
	private String name;
	private int age;
	private String city;
	
	public Student() {
		
	}

	public Student(int regID, String name, int age, String city) {
		super();
		this.regID = regID;
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public int getRegID() {
		return regID;
	}

	public void setRegID(int regID) {
		this.regID = regID;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [regID = " + regID + ", name = " + name + ", age = " + age + ", city = " + city + "]";
	}
	
	
	
}


