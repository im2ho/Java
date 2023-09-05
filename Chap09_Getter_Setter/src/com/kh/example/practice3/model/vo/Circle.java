package com.kh.example.practice3.model.vo;

public class Circle {
	
	//1. 멤버변수(필드)
	private final double Pi = 3.14; //Pi = 상수 (절대 변하지 않는 값)
	private int radius = 1; //변수
	
	//Getter
	public double getPi() {
		return Pi;
	}
	
	public int getRadius() {
		return radius;
	}
	
	//Setter
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//메소드
	
	//반지름에 대해 출력
	public void incrementRadius() {
		//반지름 증가: 증가시킬 양을 지정할 수 있다
		radius ++ ;
	}
		
	//원의 넓이를 계산하고 출력하는 메소드
	public void getAreaCircle() {
		double area = Pi * radius * radius;
		System.out.println("원의 넓이 : " + area);
	}
		
	//
	public void getSizeOfCircle() {
		System.out.println("원의 크기(반지름) : " + radius);
	}

	
	
	
	

}
