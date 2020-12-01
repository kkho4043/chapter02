package com.javaex.ex14;

public class Student extends Person{
	
	private String schoolName;
	
	public Student() {
	}
	
	public Student(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public Student(String name,int age , String schoolName) {
		super(name,age);
		this.schoolName = schoolName;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public void showInfo() {
		
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(schoolName);
		
		System.out.println("이름 :" + name + " 나이 :" + age +" 학교 :" +schoolName);
	}
	/*
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
	*/
	
	
	
}
