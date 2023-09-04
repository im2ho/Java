package com.kh.classSample;

public class Car {
	
	//1. ���� �ʵ� �������
	String brand; //�귣��
	String model; //��
	int speed; //�ӵ�
	boolean engineOn; //���� ����
	/*================================================
	 * ������� �ؿ��� ��� �޼���� ����
	 */
	
	//2. ������ (�޼����� ����)
	public Car(String brand, String model) { 
				//���� �� �� �ʼ��� ���� �Ķ���ʹ� �귣��� ��
		this.brand = brand; //�ǳ� �ʱ�ȭ �����ش�
		this.model = model;
		this.speed = 0;
		this.engineOn = true;
		System.out.println("Car�� ����"); //��� �޼���
	}
	
	//3. ���� ���� �޼��� (���� ������ �� ������ �� ���ư����� üũ)
	public void startEngine() { //void 
		//���࿡ ������ true : ���� �õ�
		if(engineOn) {
			System.out.println("������ �õ��մϴ�."); //��� �޼ҵ� �ۼ�
		} else { //false : �̹� ������ �����ִ�
			System.out.println("�̹� ������ ���� �ֽ��ϴ�.");
		}
	}
	
	//���� �޼���
	public void acclerate(int amount) {//�Ķ���� �̸�(amount) : ���� ǥ���ϰ���� �̸� ����� ���� ��...
		if(engineOn) {
			//������ true�� ���� �ӵ��� �󸶴�.
			System.out.println("�ӵ� " + amount + "�Դϴ�.");
		} else {
			//������ false�� ������ �����־� �ӵ��� �� �� ����.
			System.out.println("�ӵ��� �� �� ����");
		}
		
		
	}
}
