package com.kh.variable;

import java.util.Scanner;

public class Scannerexme {
	
	public static void main(String[] args) {
		//Ű���忡�� ���� �� ���� �Է� �޾�, �� ���� ��, ��, ��, ������ �� ��� ������ ���
		
		Scanner sc = new Scanner(System.in);
		
		int inum1, inum2;
		
		System.out.println("�� ���� ���� �Է��� �ʿ��մϴ�.");
		System.out.print("ù ��° ������ �Է��ϼ��� : ");
		inum1 = sc.nextInt();
		System.out.print("�� ��° ������ �Է��ϼ��� : ");
		inum2 = sc.nextInt();
		
		System.out.println(inum1 - inum2);
	}
	
	
	

}
