package com.kh.inheritance.calculator;

public class Calculator {
	
	//계산기를 만들어보자~
	
	int num1;
	int num2;
	
	
	//1. 더하기
	
	public int add() { //파라미터(매개변수) : 숫자 2개
		return num1 + num2; //반환값이 있으므로 함수에 변수형 입력 필수
	}
	
	//2. 빼기
	
	public int substract() { 
		return num1 - num2; 
	}
	
	//3. 곱하기
	
	public int multiply() { 
		return num1 * num2; 
	}
	
	//4. 나누기
	
	public int divide() {
		return num1 / num2;
	}
	

}
