package com.kh.arraysample;

public class Array02 {

	public static void main(String[] args) {
		
		/**
		 * 
		// 1. �迭�� ���̸� ����
		int[] num = new int[10]; //���̰� 10�� �迭 ����
		
		// 1~10������ �ݺ����� �̿��ؼ�
		for(int i = 0; i < num.length ; i++) {
			//������� �迭 �ε����� ���� �� 
			num[i] = i +1;
			System.out.println(num[i]);
		}
		
		//�� ���� ���
		for (int i = 0; i < num.length ; i++) {
			System.out.println("num[" + i + "]=" + num[i]);
		}
		
		**/
		
		//���̰� 10�� �迭�� ���� 1~10������ ���� �ݺ����� �̿��ؼ�
		//�������� �迭 �ε����� ���� �� �� ���� ����ϱ�
		
		int[] arr = new int[10]; //���̰� 10�� �迭 arr ����
		
		// 1~10������ ���� �������� �迭�� �Ҵ�
		int value = 10;
		for(int j = 0 ; j <arr.length ; j++) { //arr.length = 10
			arr[j] = value --; //arr[0]=9, arr[1]=8, .... ,arr[9]=0
		}
		
		for (int j = 0 ; j < arr.length ; j++) {
			System.out.println("arr[" + j + "] = " + arr[j] );
		}
	}

}
