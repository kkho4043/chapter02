package com.javaex.ex17;

public class PersonApp {
	public static void main(String[] args) {
		
		
		Person[] pArray = new Person[5];
		Person p01 = new Person("둘리", 1200);
		Person p02 = new Person("또치", 40);
		Person p03 = new Person("도우너", 200);
		
		Person s01 = new Student("유재석" , 44, "서울고등학교");
		Person s02 = new Student("강호동" , 47, "경기고등학교");
		
		pArray[0] = p01;		
		pArray[1] = p02;
		pArray[2] = p03;
		pArray[3] = s01;
		pArray[4] = s02;
		
		for(int i = 0; i<pArray.length;i++) {
			pArray[i].showInfo();
		}
		
		((Student)pArray[4]).setSchoolName("마산고등학교");
		
		for(int i = 0; i<pArray.length;i++) {
			pArray[i].showInfo();
		}
	}
}
