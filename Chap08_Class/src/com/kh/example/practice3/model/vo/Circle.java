package com.kh.example.practice3.model.vo;

public class Circle {
	//1.�ʵ�(�������)
	double Pi; //������
	int radius; //������
	
	//2.������
	public Circle(double Pi, int radius) {//���� ������ �ʱ�ȭ
		this.Pi = 3.14;
		this.radius = radius; //1�� �ʱ�ȭ........�ؾߵɱ�..............
	}
	
	//3.�� ���� ��� �޼ҵ�
	
	public void incrementRadius() {
		System.out.println("�̰Թ���..");
	}
	
	public void getAreaOfCircle() {
		System.out.println("���� : " + (Pi*(radius^2)));
	}
	
	public void getSizeOfCircle() {
		System.out.println("�ѷ� : " + (2*Pi*radius));
	}

}
