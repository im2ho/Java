package com.kh.practice0831;

import java.util.Scanner;

public class Practice06 {
	public static void main(String[] args) {
		/*
		 1 �̻��� ���ڸ� �Է��ϼ���
		 ����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���
		 ��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
		 ���� 1�̸��� ���ڰ� �Էµƴٸ� "1 �̻��� ���ڸ� �Է����ּ���"�� ����ϼ���.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ڿ��� �� ���� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if (num < 1) {
			System.out.print("1 �̻��� ���ڸ� �Է����ּ���");
		} else { // 1�̻��� ���ڵ�(�ڿ���)
			for(int i = 1 ; i<=num ; i++) {
				System.out.print(i + " /");
			}
		}

}
}
