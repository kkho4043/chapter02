package com.javaex.ex17;

public class PersonApp {
	public static void main(String[] args) {
		
		
		Person[] pArray = new Person[5];
		Person p01 = new Person("�Ѹ�", 1200);
		Person p02 = new Person("��ġ", 40);
		Person p03 = new Person("�����", 200);
		
		Person s01 = new Student("���缮" , 44, "�������б�");
		Person s02 = new Student("��ȣ��" , 47, "������б�");
		
		pArray[0] = p01;		
		pArray[1] = p02;
		pArray[2] = p03;
		pArray[3] = s01;
		pArray[4] = s02;
		
		for(int i = 0; i<pArray.length;i++) {
			pArray[i].showInfo();
		}
		
		((Student)pArray[4]).setSchoolName("�������б�");
		
		for(int i = 0; i<pArray.length;i++) {
			pArray[i].showInfo();
		}
	}
}
