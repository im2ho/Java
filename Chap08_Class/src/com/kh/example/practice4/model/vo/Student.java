package com.kh.example.practice4.model.vo;

public class Student {
	//1.�������
	int grade;
	int classroom;
	String name;
	double height;
	char gender;
	
	//2.������
	public Student(int grade, int classroom, String name, double height, char gender) { //�л����� �ʱ�ȭ
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.height = height;
		this.gender = gender;	
	}
	
	
	//3.�޼���
	public void information() {
		System.out.println("< " + name + " �л� ���� >\n" );
		System.out.println(grade + "�г� " + classroom + "��");
		System.out.println("���� : " + gender);
		System.out.println("Ű : " + height + "cm");
	}

}

