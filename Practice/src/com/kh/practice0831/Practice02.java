package com.kh.practice0831;

import java.util.Scanner;

public class Practice07 {
	public static void main(String[] args) {
		/*
		 �� 1�� ������ ��� ���� �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
		 "1 �̻��� ���ڸ� �Է����ּ���"�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("�ڿ��� �� ���� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		//���� �� ����� boolean ���� = true or false;
		
		while(num>1) { //2. ���� �߰��ϱ�
		if (num < 1) {
			System.out.print("1 �̻��� ���ڸ� �Է����ּ���");
			} else { // 1�̻��� ���ڵ�(�ڿ���)
				for(int i = 1 ; i<=num ; i++) {
				System.out.print(i + " /");
					}
				//3. ���� false �����
			}	
		}

	}

}
