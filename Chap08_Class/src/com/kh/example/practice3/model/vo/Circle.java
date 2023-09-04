package com.kh.example.practice3.model.vo;

public class Circle {
	//1.필드(멤버변수)
	double Pi; //원주율
	int radius; //반지름
	
	//2.생성자
	public Circle(double Pi, int radius) {//원의 정보를 초기화
		this.Pi = 3.14;
		this.radius = radius; //1로 초기화........해야될까..............
	}
	
	//3.원 정보 출력 메소드
	
	public void incrementRadius() {
		System.out.println("이게뭐지..");
	}
	
	public void getAreaOfCircle() {
		System.out.println("면적 : " + (Pi*(radius^2)));
	}
	
	public void getSizeOfCircle() {
		System.out.println("둘레 : " + (2*Pi*radius));
	}

}
