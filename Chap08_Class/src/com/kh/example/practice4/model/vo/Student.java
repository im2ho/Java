package com.kh.example.practice4.model.vo;

public class Student {
	//1.멤버변수
	int grade;
	int classroom;
	String name;
	double height;
	char gender;
	
	//2.생산자
	public Student(int grade, int classroom, String name, double height, char gender) { //학생정보 초기화
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.height = height;
		this.gender = gender;	
	}
	
	
	//3.메서드
	public void information() {
		System.out.println("< " + name + " 학생 정보 >\n" );
		System.out.println(grade + "학년 " + classroom + "반");
		System.out.println("성별 : " + gender);
		System.out.println("키 : " + height + "cm");
	}

}

