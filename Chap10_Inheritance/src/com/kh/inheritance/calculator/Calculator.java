package com.kh.inheritance.calculator;

public class Calculator {
	
	//���⸦ ������~
	
	int num1;
	int num2;
	
	
	//1. ���ϱ�
	
	public int add() { //�Ķ����(�Ű�����) : ���� 2��
		return num1 + num2; //��ȯ���� �����Ƿ� �Լ��� ������ �Է� �ʼ�
	}
	
	//2. ����
	
	public int substract() { 
		return num1 - num2; 
	}
	
	//3. ���ϱ�
	
	public int multiply() { 
		return num1 * num2; 
	}
	
	//4. ������
	
	public int divide() {
		return num1 / num2;
	}
	

}
