package com.kh.example.practice3.model.vo;

public class Circle {
	
	//1. �������(�ʵ�)
	private final double Pi = 3.14; //Pi = ��� (���� ������ �ʴ� ��)
	private int radius = 1; //����
	
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
	
	//�޼ҵ�
	
	//�������� ���� ���
	public void incrementRadius() {
		//������ ����: ������ų ���� ������ �� �ִ�
		radius ++ ;
	}
		
	//���� ���̸� ����ϰ� ����ϴ� �޼ҵ�
	public void getAreaCircle() {
		double area = Pi * radius * radius;
		System.out.println("���� ���� : " + area);
	}
		
	//
	public void getSizeOfCircle() {
		System.out.println("���� ũ��(������) : " + radius);
	}

	
	
	
	

}
